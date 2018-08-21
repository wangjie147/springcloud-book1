package com.facetofront.controller;


import com.facetofront.entity.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @Value("${my.name}")
        private  String name;

        @Value("${my.uuid}")
        private  String uuid;



        @GetMapping("/hi")
        public String hello(){
            return "hi,"+name+uuid;
        }



}
