package chapter7._3;

/**
 * 关于StringBuilder类的使用测试
 * @author Crossing
 * @date 2019-03-06
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java");
        System.out.println(stringBuilder);
        stringBuilder.insert(0, "hello ");
        System.out.println(stringBuilder);
        stringBuilder.replace(5, 6, ",");
        System.out.println(stringBuilder);
        stringBuilder.delete(5, 6);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
    }
}
