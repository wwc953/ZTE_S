package com.zte.lesson8;

public class Son extends Base {
    protected int a1;

    protected static int b1;

    public Son() {
        a1 = 2;
        b1 = 2;
    }

    public void addA() {

        a += 1;
        a1 += 6;
    }

    public static void addB() {
        b1 += 7;
    }

    public static void main(String[] args) {
        Son son = new Son();

        Base base = son;
        base.addA();

        System.out.println(son.a + "\t" + son.b + "\t" + son.a1 + "\t" + son.b1);
        System.out.println(base.a + "\t" + base.b + "\t");

//		System.out.println(son.a+"\t"+son.b+"\t"+son.a1+"\t"+son.b1);
//
//		Base  base = new Base();
//		System.out.println(base.a+"\t"+base.b+"\t");


    }

}
