package org.springwithout.springboot.beans;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void saveUser(){
        System.out.println("user is saved successfully");
    }
}
