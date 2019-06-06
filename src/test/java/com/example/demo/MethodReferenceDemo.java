package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songdexu
 * @date 2019/6/4
 */
public class MethodReferenceDemo {
    private static final Logger logger = LoggerFactory.getLogger(MethodReferenceDemo.class);
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        System.out.println(demoClass.normalMethod(2));
    }
}

class DemoClass {
    public int normalMethod(DemoClass this, int i) {
        return i*2;
    }
}