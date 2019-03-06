package chapter7._2;

/**
 * 比较IdentityHashCode 和HashCode两个方法的区别测试
 * IdentityHashCode计算的是对象内存地址的hashCode,如果相同则一定是一个对象
 * HashCode计算的是字符序列的hashCode，如果相同，这说明二者的内容是一致的
 * @author Crossing
 * @date 2019-03-06
 */
public class IdentityHashCodeTest {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(System.identityHashCode(s1) == System.identityHashCode(s2));
        System.out.println(s3.hashCode() == s4.hashCode());
        System.out.println(System.identityHashCode(s3) == System.identityHashCode(s4));
    }
}
