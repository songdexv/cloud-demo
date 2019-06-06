package com.example.demo.controller;

import java.util.Map;

import org.springframework.util.ConcurrentReferenceHashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @author songdexu
 * @date 2019/6/3
 */
@RestController
@RequestMapping("/async")
public class AsyncController {
    final Map<Integer, DeferredResult> deferredResultMap = new ConcurrentReferenceHashMap();

    @RequestMapping(value = "/longPolling")
    public DeferredResult longPolling() {
        DeferredResult deferredResult = new DeferredResult(0l);
        deferredResultMap.put(deferredResult.hashCode(), deferredResult);
        deferredResult.onCompletion(() -> {
            deferredResultMap.remove(deferredResult.hashCode());
            System.err.println("还剩" + deferredResultMap.size() + "个deferredResult未响应");
        });
        return deferredResult;
    }

    @GetMapping("/returnLongPollingValue")
    public void returnLongPollingValue() {
        for (Map.Entry<Integer, DeferredResult> entry : deferredResultMap.entrySet()) {
            entry.getValue().setResult("kl");
        }
    }
}
