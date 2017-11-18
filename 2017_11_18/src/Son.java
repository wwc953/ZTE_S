/**
 * Created by Roll on 2017/11/18.
 */
public class Son extends Base {
//    public Son() {
//        this(10);
//    }
//
//
//    public Son(int a) {
//        //隐式的调用了父类的默认无参构造函数
//    }

    static {
        System.out.println("子类静态块");
    }

    public Son() {
        super(10);
    }
}
