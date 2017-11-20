package com.zte.lesson7;

public class Son extends Base {
    protected int a;

    protected static int b;

    public Son() {
        a = 2;
        b = 2;
    }

    public void addA() {
        a += 6;
    }

    public static void addB() {
        b += 7;
    }

    public static void main(String[] args) {
        Son son = new Son();//
//		Base base = new  Base();
//		
//		//子类将全部继承父类的成员变量和方法，去掉全部
//		//特殊在:当子类出现和父类的同名变量时。父类的同名变量将不在给子类继承******
//		System.out.println(son.a+"\t"+son.b);//2,2
//		System.out.println(base.a+"\t"+base.b);//1,1

        // 引用类型赋值，父类指向子类，Son类
        Base base = son;

        base.addA();

        System.out.println(son.a + "\t" + son.b);// 8,2,
        System.out.println(base.a + "\t" + base.b);// 1,1

        // 静态方法是类方法，是属于那个类的，不是属于那个对象的。
        // 所以即使方法名，参数列表相同，返回值类型相同，也不属于方法重写。static是静态是属于类的，而不是属于那个对象的。
//		base.addB();
//
//		System.out.println(son.a + "\t" + son.b);//8,2
//		System.out.println(base.a + "\t" + base.b);// 1,6
//		// 1-------------------
//		// Base base = new Base();//1,1
//		// System.out.println(son.a+"\t"+son.b);//
//		// System.out.println(base.a+"\t"+base.b);//

        son.addB();
        System.out.println(son.a + "\t" + son.b);//8,9
        System.out.println(base.a + "\t" + base.b);// 1,1
    }

}
