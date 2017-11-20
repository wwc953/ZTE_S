package com.zte.lesson4;

public class Student extends Person {
    // 子类具有扩充父类的能力-->子类具有自己的属性和方法

    // 分数
    private float score;

    public Student(String name, int age, float score) {
        super(name, age);
    }

    public void setScore() {
        this.score = score;
    }

    public float getScore() {
        return this.score;
    }

    public void showInfo() {
        System.out.println("这个学生的姓名为:" + this.name + "，年龄为:" + this.age + ",这次考试的分数为:" + this.score);
    }

}
