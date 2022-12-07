package com.example.feignclinet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class FeignClientController {

  @Autowired
  private  FeignClientUtil feignClientUtil;

    @GetMapping("/nameTwo")
    public String getName (){
        return feignClientUtil.getName();
    }


    @GetMapping("/addressTwo")
    public String getAddress (){
        return feignClientUtil.getAddress();

    }
    @GetMapping("/statusTwo")
    public String getStatus (){
        return feignClientUtil.getStatus();
    }
}
