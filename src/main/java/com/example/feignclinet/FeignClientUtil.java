package com.example.feignclinet;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo" ,url = "http://localhost:9091/one")
public interface FeignClientUtil {

    @GetMapping("/name")
    public String getName ();



    @GetMapping("/address")
    public String getAddress ();
    @GetMapping("/status")
    public String getStatus ();
}
