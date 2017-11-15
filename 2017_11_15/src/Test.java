public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test() {

    }

    public void call(Test t1, Test t2) {
        System.out.println("t1地址1＝" + t1);
        Test t3 = new Test();
        t1.setName("aaa");
        t2.setName("bbb");
        t3.setName("ccc");
        System.out.println(t1.getName());
        System.out.println(t2.getName());


        t1 = t2;
        t1.setName("fff");
        System.out.println("t1的地址4=" + t1);
        System.out.println(t1.getName());
        t1 = t3;
        System.out.println(t1.getName());
        System.out.println(t3.getName());
        t3.setName("eeee");
        System.out.println("t1地址ַ2=" + t1);
        System.out.println("t1.name-->" + t1.getName());
    }

    public static void main(String[] arg) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println("t1地址0＝" + t1);
        Test t4 = new Test();
        t4.call(t1, t2);
        System.out.println("t1地址3＝" + t1);
        System.out.println("t1=" + t1.getName());//aaa
        System.out.println("t2=" + t2.getName());//fff
    }
}
