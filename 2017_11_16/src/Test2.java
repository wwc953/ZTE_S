/**
 * Created by Roll on 2017/11/16.
 */
public class Test2 {

    //实例变量，非静态变量，作用域:全局  对象名.变量名
    private String  name;

    //静态变量，类变量  ，作用域:全局  类名变量名 (使用这个) ,对象名.变量名
    private static  int   count;

    //静态块  访问规则和静态方法完全一致 ，作用:1。最先执行 2。只执行一次
    static{
        System.out.println("静态块");
    }

    //构造函数
    public  Test2() {
        System.out.println("默认无参构造函数");
    }
    //构造函数重载
    public Test2(String  name) {
        System.out.println("有一个构造函数");
    }

    //实例方法，也叫做非静态方法，可以直接使用本类的实例方法|变量，也可以直接使用本类的静态方法|变量
    public void  show() {
        this.name="111";
        count++;

        check();

        System.out.println("实例方法");
    }
    //静态方法，也叫做类方法，它可以直接使用静态变量和静态方法，不能够直接使用实例变量和实例方法，怎么访问？创建这个类的对象去访问。
    //静态方法中不能够使用this关键字

    public  static  void   check() {
        System.out.println("静态方法");
    }

    public  static void  check(String name) {
        System.out.println("带一个参数的静态方法");
    }

    public void  setName(String name) {
        this.name=name;
    }
    public String  getName() {
        return this.name;
    }
    public static void main(String[] args) {
        Test2.check();


//		Test2  t1= new Test2();
//		t1.setName("11");
//		Test2  t2= new Test2();
//		t1.setName("22");

    }
}
