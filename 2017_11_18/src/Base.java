/**
 * Created by Roll on 2017/11/18.
 */
public class Base {

    private int value;

    static {
        System.out.println("父类静态块");
    }

    public Base() {
        value++;
        System.out.println("1.Base-->" + value);
    }

    public Base(int value) {

        /**
         *
         *  ---------------------------  一个坑  ---------------------
         *
         * 注意：局部变量和全局变量 同名的问题
         *
         *      方法中的变量是局部变量，方法运行完后内存被释放。
         *
         */

        value++;

        //this.value = ++value;

        System.out.println("Base类中this.value = " + this.value);
        System.out.println("2.Base类: value的值为-->" + value);
    }

    public Base(int value, int a) {
        ++value;
        System.out.println("3.Base类的value的值为-->" + this.value);
    }

    public int getValue() {
        return this.value;
    }

}
