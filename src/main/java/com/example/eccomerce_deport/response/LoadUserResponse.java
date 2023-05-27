package com.example.eccomerce_deport.response;

import lombok.Data;

@Data
public class LoadUserResponse {
    private long id;
    private String  username;
    private String password;
    private boolean enable;
}
