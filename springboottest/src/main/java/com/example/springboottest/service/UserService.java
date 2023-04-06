package com.example.springboottest.service;

import com.example.springboottest.dao.UserDao;
import com.example.springboottest.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserService {
    @Autowired
    UserDao userDao;

   public ArrayList<User> finAll(){
       return userDao.findAll();
   }











}
