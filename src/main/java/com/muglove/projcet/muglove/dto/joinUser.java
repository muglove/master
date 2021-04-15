package com.muglove.projcet.muglove.dto;

public class joinUser {
    String user_id;
    String name;
    String psswd;
    String email;

    public String getUser_id(){
        return user_id;
    }
    public void setUser_id(String user_id)
    {
        this.user_id=user_id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPsswd(){
        return psswd;
    }
    public void setPsswd(String psswd){
        this.psswd = psswd;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

}
