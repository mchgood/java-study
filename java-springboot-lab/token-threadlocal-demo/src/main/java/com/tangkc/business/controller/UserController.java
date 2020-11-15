package com.tangkc.business.controller;

import com.tangkc.base.web.context.AppContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangkc
 * @description
 * @date 2020/11/15 14:42
 */
@RestController
public class UserController {

    @GetMapping("/login")
    public String login(){
        return AppContext.getContext().getTraceId();
    }
}
