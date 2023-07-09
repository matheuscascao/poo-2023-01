package com.github.matheuscascao.ufg.poo.t013;

public class Main {
    public void main(String[] args){
        Job myJob = new Job("Developer", 100000.00F);
        Person myPerson = new Person("Jon Doe", 14, myJob);
        HelloWorld myHello = new HelloWorld(myPerson.name);

        System.out.println("Hello World: ");
        String greeting = myHello.greet();
        System.out.println("Greeting: " + greeting);
        myHello.toString();

        System.out.println("Other methods: ");
        myPerson.toString();
        myJob.toString();

    }
}
