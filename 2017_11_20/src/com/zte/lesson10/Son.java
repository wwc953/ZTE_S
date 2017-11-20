package com.zte.lesson10;

/**
 * Created by Roll on 2017/11/20.
 */
public class Son extends Base {

    public int a;
    public int b;

    public Son() {
//        a = 2;
//        b = 2;

        //注意：这是局部变量
        int a = 2;
        int b = 2;

    }


    public static void main(String[] args) {

        Base base = new Base();
        Son son = new Son();

        System.out.println(base.a + "," + base.b);
        System.out.println(son.a + "," + son.b);


    }

}
