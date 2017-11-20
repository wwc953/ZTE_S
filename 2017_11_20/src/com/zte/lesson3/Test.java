package com.zte.lesson3;

public class Test {

    public static void main(String[] args) {
        //基本数据类型转型
        //从低byte-short-int-long-float-double到高
        //从高------------>低[强制转换目标类型]
        //从低------------>高[直接转换]

        //引用类型转型
        //Java中的顶级的父类Object
        //Java中如果没有写extends ，这个类是直接Object,
        //所有的类都直接或间接的继承Object.
        //Java中只能有一个直接的父类，间接的多个父类。

//		Object  obj = new Object();
//		
//		Person  p1 = new Person("rr",30);
//		
//		//instanceof 判断这个对象是不是这个类的一个实例
//		System.out.println(p1  instanceof  Object);

        Person p1 = new Person("aa", 30);

        //父类对象指向子类
        Person p2 = new Student("xs", 18, 20.0f);

        Worker w = new Worker("gr", 50, 5000.00f);

        //人p1属于人类
        System.out.println(p1 instanceof Person);

        //学生p2属于人类
        System.out.println(p2 instanceof Person);

        //工人属于人类
        System.out.println(w instanceof Person);

        System.out.println(p1 instanceof Student);

        //各个子类继承了父类的全部的属性和方法，直接来说，
        //各个子类可以使用父类的属性和方法。

        //父类想使用子类的方法(子类自己扩展的方法)，怎么破?
        //一个父类指向多个子类的现象，叫做动态绑定.
        //更为强调的设计，抽象类和接口，父类不能够自己new 自己。

        //向上转型  父类对象指向子类
        Person p = new Worker("gr", 50, 10000);

        System.out.println("--->" + p.getClass());

        //想调用子类获取工资的方法，父类是不能够访问
        //向下转型  父类通过向下的转型，可以访问子类的方法
        Worker w1 = (Worker) p;
        System.out.println(w1.getSalary());


        Person pp = new Person("rr", 50);
        System.out.println("********>" + pp.getClass());
        //向下做转型，我们需要用instanceof来做判断，需要保护
        //否则会抛出异常。
        //向下转型
        if (pp instanceof Worker) {

            Worker w2 = (Worker) pp;
            System.out.println(w2.getSalary());

        }


    }
}
