package com.zte.lesson3;

public class Worker extends Person {

    private float salary;

    public Worker(String name, int age, float salary) {

        super(name, age);
        // TODO Auto-generated constructor stub
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
