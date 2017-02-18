package com.zhl.spring.boot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhl.spring.boot.model.User;
import com.zhl.spring.boot.model.UserDao;

@Controller
@EnableAutoConfiguration
public class HelloController
{
    
//    @Autowired
//    private UserDao userDao;  
    
    @RequestMapping("/")
    @ResponseBody
    public String helloWord() {
        return "Hello World!";
    }
    
//    @RequestMapping("/getName")  
//    @ResponseBody  
//    public String getByName(String name) {  
//        List<User> userList = userDao.findByName(name);  
//        if (userList != null && userList.size()!=0) {  
//            return "The user length is: " + userList.size();  
//        }  
//        return "user " + name + " is not exist.";  
//    }  
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
