/**
 * Created by Roll on 2017/11/16.
 */
public class Test1 {


    static {

        System.out.println("静态块");

        //解析系统级文件（xml），并要在执行其它方法之前就解析并获取。

    }

    public Test1() {
        System.out.println("无参构造函数");
    }

    public static void main(String[] args) {

        //构造函数不是显示的被调用 的，但是构造函数是通过创建对象去隐式的去调用。
        //调用哪个构造函数，是由创建对象的参数来决定的。

        //静态块也不是显示的被调用，它是随着类的加载而执行的。
        //并它只执行一次。
        //静态块作用:1.最先执行 2.只运行一次

    }

}
