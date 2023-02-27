package com.example.todoapp;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@RequestScoped
@Named("firstBean")
public class ExampleBean {
    private String name;
    private String greetings;

    @Inject
    private GreetingService greetingService;

    public ExampleBean(){

    }

    public ExampleBean(String name, String greetings) {
        this.name = name;
        this.greetings = greetings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String doGreetings(){
     return  greetings = String.format(greetingService.doGreetingsTemplate(null) , name);
    }
}
