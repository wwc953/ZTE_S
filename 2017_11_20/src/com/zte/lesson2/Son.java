package com.zte.lesson2;

public class Son extends Base {

    public Son() {

        a = 2;
        b = 2;
    }

    public static void main(String[] args) {
        // 创建了父类的对象，调用了父类的构造函数
        Base base = new Base();

        // 创建子类的对象，访问子类的构造函数，子类的构造必须依赖于父类的构造
        Son son = new Son();//

        System.out.println(son.a + "\t" + son.b);//2,2
        System.out.println(base.a + "\t" + base.b);//1,2
        //
        //
        // System.out.println("----------");
        // System.out.println(base.a+"\t"+base.b);

    }

}
