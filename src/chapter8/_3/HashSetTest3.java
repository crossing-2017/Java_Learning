package chapter8._3;

import java.util.HashSet;

/**
 * Person类中同名同年龄的只添加一次
 * @author Crossing
 * @date 2019-03-15
 */
public class HashSetTest3 {

    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();

        Person p1 = new Person("zhangsan", 21);

        Person p2 = new Person("lisi", 21);

        Person p3 = new Person("zhangsan", 22);

        Person p4 = new Person("zhangsan", 21);


        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        String s1 = new String("123");
        String s2 = new String("123");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        //System.out.println(people);
    }
}
