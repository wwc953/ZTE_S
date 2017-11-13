/**
 * Created by Roll on 2017/11/13.
 */
public class Test6 {

    boolean foo(char a) {
        System.out.print(a);
        return true;
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        int i = 0;
        for (t.foo('A'); t.foo('B') && i < 2; t.foo('C')) {
            i++;
            t.foo('D');
        }

    }
}
