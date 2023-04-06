package com.example.springboottest.dao;

import com.example.springboottest.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
@Mapper
public interface UserDao {
     @Select("Select * from user")
     ArrayList<User> findAll();

}
