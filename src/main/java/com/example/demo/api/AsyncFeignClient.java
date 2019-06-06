package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author songdexu
 * @date 2019/6/3
 */
@FeignClient(url = "http://127.0.0.1:8081", name = "async")
public interface AsyncFeignClient {
    @GetMapping("/async/longPolling")
    String longPolling();

    @GetMapping("/async/returnLongPollingValue")
    void returnLongPollingValue();
}
