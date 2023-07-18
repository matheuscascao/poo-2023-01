package com.github.matheuscascao.ufg.poo.t013;

public class Job {
    String name;
    double annualSalary;

    public Job(String n, double as){
        this.name = n;
        this.annualSalary = as;
    }

    public String toString(){
        return "Job Title: " + this.name + "Annual Salary: " + this.annualSalary;
    }

}
