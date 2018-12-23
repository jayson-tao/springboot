package com.yaorange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class RedisController {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @GetMapping("/redis")
    public String redis(){
        redisTemplate.opsForValue().set("name","jayson",10);
        String name = redisTemplate.opsForValue().get("name");
        return name;
}
}
