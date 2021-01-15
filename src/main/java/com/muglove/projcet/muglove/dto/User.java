package com.muglove.projcet.muglove.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userId;
    private String password;
    private String name;
    private String email;

    public String toString(){
        return "User [userId="+userId+",password="+password+",name="+name+", email="+email+"]";
    }
}