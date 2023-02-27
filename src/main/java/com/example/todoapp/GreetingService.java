package com.example.todoapp;

import jakarta.annotation.PostConstruct;

public class GreetingService {
    @PostConstruct
    public void init(){

    }

    public String doGreetingsTemplate(String language){
        String result = "Hello %s";
        return result;
    }
}
