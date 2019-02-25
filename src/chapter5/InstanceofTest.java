package chapter5;

/**
 * @author Crossing
 * @date 2019-02-25
 * @return instanceof关键字的测试
 */
public class InstanceofTest {
    public static void main(String[] args) {
        Object hello = "Hello";
        System.out.println(hello instanceof Object);
        System.out.println(hello instanceof String);
        System.out.println(hello instanceof Math);
    }

}
