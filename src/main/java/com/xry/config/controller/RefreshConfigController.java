package com.xry.config.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Slf4j
public class RefreshConfigController {

    @Value("${data.bookName}")
    private String name;

    @GetMapping("refreshConfig")
    public String refreshConfig(){
        log.info("name = {}",name);
        return name;
    }
}
