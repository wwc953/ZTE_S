package com.zte.lesson1;

public class Son extends Base {

    public Son() {

        a = 2;
        b = 2;
    }

    public static void main(String[] args) {
        //创建子类的对象，访问子类的构造函数，子类的构造必须依赖于父类的构造
        Son son = new Son();// son.a=2(堆内存)，son.b=2(静态全局存储区)


        //创建了父类的对象，调用了父类的构造函数
        Base base = new Base();//base.a=1(堆内存) base.b=1(静态全局存储区)

        System.out.println(son.a + "\t" + son.b);//2,1
        System.out.println(base.a + "\t" + base.b);// 1,1
//		
//	
//		System.out.println("----------");
//		System.out.println(base.a+"\t"+base.b);

    }

}
