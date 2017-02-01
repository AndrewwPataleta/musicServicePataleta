package com.pataleta.musicService.model;

import org.springframework.stereotype.Component;


@Component
public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public User(){

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "Имя: "+getName();
    }
}