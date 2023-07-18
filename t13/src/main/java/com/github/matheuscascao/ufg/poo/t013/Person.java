package com.github.matheuscascao.ufg.poo.t013;

public class Person {
    public String name;
    int age;
    Job job;

    public Person(String n, int a, Job j){
        this.name = n;
        this.age = a;
        this.job = j;
    }

    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nJob: " + this.job;
    }
}
