package com.hello.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SignupRequest {

    @NotNull
    @NotBlank
    String userName;

    @NotNull
    @NotBlank String password;

    public SignupRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void getPassword(String password) {
        this.password = password;
    }

    public SignupRequest() {
    }
}
