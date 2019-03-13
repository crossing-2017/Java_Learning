package chapter8._2;

import java.util.ArrayList;

/**
 * Collection底下的各个方法的测试
 * @author Crossing
 * @date 2019-03-08
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Hello");
        arrayList.add("books");
        arrayList.add("chapter8");
        // 用Lambda方式来遍历List
        arrayList.forEach(obj -> System.out.println("遍历List：" + obj));


    }
}
