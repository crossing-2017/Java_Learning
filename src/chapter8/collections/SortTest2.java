package chapter8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 测试Comparator接口中的sort方法
 * @author Crossing
 * @date 2019-03=15
 */
public class SortTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, 1, 5, 6, 3, 9, 7);


        Collections.sort(arrayList, new Comparator<Integer>() {
            //重写比较规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; //升序
            }
        });

        //和上面的方法一样，只不过使用的Lambda方法
        Collections.sort(arrayList, Comparator.comparingInt(o -> o));

        System.out.println(arrayList);

        ArrayList<Person> people = new ArrayList<>();

        Person p1 = new Person("zhangsan", 21);

        Person p2 = new Person("lisi", 20);

        Person p3 = new Person("wangwu", 32);

        Person p4   = new Person("zhaoliu", 20);

        Collections.addAll(people, p1, p2, p3, p4);

        /**
         * 先比较年龄大小，如果年龄相同，则比较姓名的首字母大小
         */
        Collections.sort(people, new Comparator<Person>() {
            int result;
            @Override
            public int compare(Person o1, Person o2) {
                 result = o1.getAge()-o2.getAge();
                if (result == 0){
                    result = p1.getName().charAt(0) - p2.getName().charAt(0);
                }
                return result;
            }
        });

        System.out.println(people);
    }
}
