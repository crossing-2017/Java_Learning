package chapter6;

/**
 * 对内部类用this关键字代替新建对象
 * @author Crossing
 * @date 2019-03-05
 */
public class DiscernVariable {

    private static String str = "这是外部类的变量";

    private static class InnerClass{
        private String str = "这是内部类的变量";


        public void info(){

            String str = "这是局部变量的同名变量";
            System.out.println(DiscernVariable.str);
            System.out.println(this.str);
            System.out.println(str);
        }
    }

    public void test(){
        new InnerClass().info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}
