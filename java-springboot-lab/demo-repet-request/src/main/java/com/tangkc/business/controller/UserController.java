package com.tangkc.business.controller;

import com.tangkc.business.entity.UserEntity;
import com.tangkc.common.annotation.NotRepeatSubmit;
import org.springframework.web.bind.annotation.*;

/**
 * @author tangkc
 * @description
 * @date 2020/12/2 18:02
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @NotRepeatSubmit(value = 1000)
    @GetMapping("/get")
    public String getUser(@RequestParam(value="id") String id){
        return id;
    }

    @NotRepeatSubmit(value = 1000)
    @GetMapping("/gets")
    public UserEntity getUsers(@RequestBody(required = true)UserEntity userEntity){
        return userEntity;
    }
}
