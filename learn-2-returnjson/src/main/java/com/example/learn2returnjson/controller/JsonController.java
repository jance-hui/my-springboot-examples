package com.example.learn2returnjson.controller;

import com.example.learn2returnjson.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn2")
public class JsonController {

    @RequestMapping("/returnJson")
    public StudentEntity returnJson(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName("张三");
        studentEntity.setAge(21);
        studentEntity.setSex("男");
        return studentEntity;
    }
}
