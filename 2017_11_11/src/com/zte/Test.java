package com.zte;

/**
 * Created by Roll on 2017/11/11.
 */
public class Test {
    public static void main(String[] args){

        String s1 = new String("11");
        String s2 = new String("11");
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("11");
        StringBuffer sb2 = new StringBuffer("11");
        System.out.println(sb1.equals(sb2));

        int a = 5;

        System.out.println(a++);
        System.out.println(a);

        System.out.println(--a);
        System.out.println(a);

        System.out.println(a++ > --a);

    }
}
