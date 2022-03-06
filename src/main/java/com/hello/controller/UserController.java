package com.hello.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hello.dto.SignupRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping(value = "/")
    public String signUpUser(@RequestParam final String userName, @RequestParam final String password) throws JsonProcessingException {
        SignupRequest signupRequest = new SignupRequest(userName, password);
        return new ObjectMapper().writeValueAsString(signupRequest);
    }

    @GetMapping(value = "/")
    @ResponseBody
    public String loginUser() {

        return "hello world";
    }

}
