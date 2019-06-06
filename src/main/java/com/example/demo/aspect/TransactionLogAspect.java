package com.example.demo.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.mapper.TxLogMapper;
import com.example.demo.mapper.model.TxLog;
import com.example.demo.util.ServiceContextHolder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author songdexu
 * @date 2019/5/30
 */
@Aspect
@Component
@Order(Ordered.LOWEST_PRECEDENCE)
@Slf4j
public class TransactionLogAspect {
    @Autowired
    private TxLogMapper txLogMapper;

    @Around(value = "@annotation(transactionLog)")
    public Object intercept(ProceedingJoinPoint pjt, TransactionLog transactionLog) throws Throwable {
        try {
            Object result = pjt.proceed();
            log.info("记录事务日志");
            TxLog txLog = new TxLog();
            txLog.setContent(ServiceContextHolder.getTransactionLog());
            txLog.setCreateTime(LocalDateTime.now());
            txLog.setUpdateTime(LocalDateTime.now());
            txLog.setStatus(0);
            txLogMapper.insert(txLog);
            return result;
        } catch (Exception e) {
            throw e;
        } finally {
            ServiceContextHolder.removeTransactionLog();
        }
    }
}
