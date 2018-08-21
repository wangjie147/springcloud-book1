package com.facetofront.controller;


import com.facetofront.entity.ConfigBean;
import com.facetofront.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class LucyController {

    @Autowired
    ConfigBean configBean;

    @Autowired
    User user;

    @RequestMapping(value = "/lucy")
    public String miya(){
        return configBean.getGreeting()+"-";
    }

    @RequestMapping(value = "/users")
    public String users(){
        return user.getName()+"-----"+user.getAge();
    }


}
