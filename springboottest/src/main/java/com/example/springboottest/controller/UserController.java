package com.example.springboottest.controller;


import com.example.springboottest.pojo.User;
import com.example.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/user")
  public ArrayList<User> findAll(){
    return userService.finAll();
}


}
