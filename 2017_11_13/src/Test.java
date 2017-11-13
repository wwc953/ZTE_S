/**
 * Created by Roll on 2017/11/13.
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 使用分支语句进行对学生成绩的判断，if和switch语句
         */
        int score = 60;
        System.out.print("if --> ");
        if (score < 0) {
            System.out.println("成绩无效！");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        System.out.print("switch --> ");
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩无效！");
                break;
        }
        System.out.println("--------------------");

        /**
         * 直角三角形
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        /**
         * 正方形
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        /**
         * 长方形
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        /**
         * 20!
         */

        double result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
        }
        System.out.println("20! = " + result);
        System.out.println("--------------------");

        /**
         * 99乘法表
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }

    }
}
