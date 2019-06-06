package com.example.demo.util;

/**
 * @author songdexu
 * @date 2019/5/30
 */
public class ServiceContextHolder {
    private static ThreadLocal<String> transactionLog = new ThreadLocal<>();

    public static void setTransactionLog(String message) {
        transactionLog.set(message);
    }

    public static String getTransactionLog() {
        return transactionLog.get();
    }

    public static void removeTransactionLog() {
        transactionLog.remove();
    }
}
