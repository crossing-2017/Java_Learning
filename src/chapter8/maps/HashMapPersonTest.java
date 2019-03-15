package chapter8.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 测试引用类型的HashMap
 * @author Crossing
 * @date 2019-03-15
 */
public class HashMapPersonTest {
    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<>();

        Person zhangsan = new Person("zhangsan", 21);

        Person lisi = new Person("lisi", 23);

        Person wangwu = new Person("wangwu", 25);


        map.put(1, zhangsan);
        map.put(2, lisi);
        map.put(3, wangwu);


        Set<Integer> keys = map.keySet();

        for (Integer key :
                keys) {
            Person person = map.get(key);

            System.out.println(key + " 是: " + person);
        }

        System.out.println("------------------------");
        Set<Map.Entry<Integer, Person>> entries = map.entrySet();

        for (Map.Entry<Integer, Person> entry: entries
             ) {
            System.out.println(entry.getKey() + " 是: " + entry.getValue());
        }
    }
}
