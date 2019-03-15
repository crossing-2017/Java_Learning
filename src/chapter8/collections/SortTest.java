package chapter8.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Collections中Sort方法的测试
 * @author Crossing
 * @date 2019-03-15
 */
public class SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, 1, 5, 6, 3, 9, 7);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<Person> people = new ArrayList<>();

        Person p1 = new Person("zhangsan", 21);

        Person p2 = new Person("lisi", 20);

        Person p3 = new Person("wangwu", 32);

        Collections.addAll(people, p1, p2, p3);

        System.out.println(people);

        Collections.sort(people);

        System.out.println(people);

    }
}
