package chapter8._2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * removeIf方法的测试
 * @author Crossing
 * @date 2019-03-13
 */
public class PredicateTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Hello");
        arrayList.add("books");
        arrayList.add("chapter8");


        arrayList.removeIf(obj-> (obj.length()<=4));
        System.out.println(arrayList);
    }
}
