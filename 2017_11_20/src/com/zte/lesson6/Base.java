package com.zte.lesson6;

public class Base {
    protected int a;

    protected static int b;

    public Base() {
        a = 1;
        b = 1;
    }

    public void addA() {
        a += 4;
    }

    public static void addB() {
        b += 5;
    }
}
