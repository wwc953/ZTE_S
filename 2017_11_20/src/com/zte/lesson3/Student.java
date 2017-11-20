package com.zte.lesson3;

public class Student extends Person {
    //子类具有扩充父类的能力-->子类具有自己的属性和方法

    //分数
    private float score;

    public Student(String name, int age, float score) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    public void setScore() {
        this.score = score;
    }

    public float getScore() {
        return this.score;
    }

}
