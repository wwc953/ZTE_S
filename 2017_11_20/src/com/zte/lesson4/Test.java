package com.zte.lesson4;

/**
 * 方法的重写： 继承关系中，子类和父类具有 1.相同的方法名。 2.相同的参数类型 3.相同的参数个数 4.相同的返回值类型
 * <p>
 * 都相同，哪调用那个呢？
 * <p>
 * 是由new 实际类型来决定调用那个重写的方法
 * <p>
 * 重写的方法实际是和new 类型来关联的。
 * <p>
 * <p>
 * 同一个方法名，不同的实现结果是由那个来决定的? 1.在同一个类中，方法重载，是由参数的列表来决定实现的结果。 2.在继承关系中，方法重写，是由new
 * 的实际类型来决定实现的结果
 *
 * @author zte
 */
public class Test {

    public static void main(String[] args) {
        /**
         * Person p是一个父类对象，它可以指向 Student类，
         * 也可以指向Worker， 意味着这是多态的现象.
         *
         * 在运行期间n来调用重写的哪个方法，是有new 的实际类型来决定的
         * ，我们叫做动态绑定，也叫做运行时多态。
         *
         */

        Person p = new Student("rr", 20, 90.0f);
        System.out.println(p.getClass());
        p.showInfo();

        p = new Worker("gr", 50, 10000.0f);
        System.out.println(p.getClass());
        p.showInfo();
    }

}
