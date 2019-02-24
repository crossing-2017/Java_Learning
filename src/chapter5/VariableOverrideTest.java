package chapter5;

/**
 * @author Crossing
 * @date 2019-02-24
 */
public class VariableOverrideTest {
    public static int price = 34;
    public int age = 14;

    public static void main(String[] args) {
        int price = 12;
        System.out.println(price);
        System.out.println(VariableOverrideTest.price);
       new VariableOverrideTest().info();
    }

    /**
     * 所有的static变量或方法在调用是都是使用类名调用的，因为他们是类变量和类方法
     * 当没有用static修饰的变量和方法在调用是要新建对象，可以通过this关键字调用类中的成员变量
     */
    public void info(){
        System.out.println(price);
        int age = 35;
        System.out.println(age);
        System.out.println(this.age);
    }
}

