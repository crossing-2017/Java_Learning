package chapter8._3;

import java.util.LinkedHashSet;

/**
 * 测试链表HashSet
 * @author Crossing
 * @date 2019-03-14
 * @return 输出和添加的顺序一样
 *         [Java, Hello]
 *         [Hello, java]
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Hello");
        System.out.println(set);
        set.remove("Java");
        set.add("java");
        System.out.println(set);
        boolean add = set.add("123");
    }
}
