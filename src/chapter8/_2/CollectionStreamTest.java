package chapter8._2;

import java.util.ArrayList;

/**
 * Java8中新添了Stream方法，测试
 * @author Crossing
 * @date 2019-03-13
 */
public class CollectionStreamTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Hello");
        arrayList.add("books");
        arrayList.add("chapter8");

        //统计集合中的包含有o的元素
        System.out.println(arrayList.stream().filter(ele->ele.contains("o")).count());


        //先调用stream方法将Collection对象转化成Stream对象
        //再调用Stream的mapToInt()方法获得原有Stream对应的IntStream
        arrayList.stream().mapToInt(String::length).forEach(System.out::println);
    }
}
