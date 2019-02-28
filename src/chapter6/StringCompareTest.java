package chapter6;

/**
 * @author Crossing
 * @date 2019-02-28
 */
public class StringCompareTest {
    public static void main(String[] args) {
        String s1 = "疯狂的java";
        String s2 = "疯狂的";
        String s3 = "java";
        String s4 = s2 + s3;
        String s5 = new String("疯狂的java");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2+s3));
        System.out.println(s1.equals(s5));
    }
}
