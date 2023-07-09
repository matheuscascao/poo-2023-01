package com.github.matheuscascao.ufg.poo.t013;

public class HelloWorld {
    private String name;
    public HelloWorld(String n){
        this.name = n;
    }

    public String greet(){
        String greetingString = "Hello, " + this.name + ". Hello World!";
        return greetingString;
    }

    public String toString(){
        return "Hello, " + this.name + ". Hello World!";
    }

}
