package com.zte.lesson4;

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

    public void showInfo() {
        System.out.println("这个工人的姓名为:" + this.name + "，年龄为:" + this.age + ",这个工人的工资是:" + this.salary);
    }
}
