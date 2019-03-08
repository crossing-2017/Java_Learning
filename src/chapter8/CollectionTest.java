package chapter8;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection底下的各个方法的测试
 * @author Crossing
 * @date 2019-03-08
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(1, "Java" );
        System.out.println(arrayList.get(1));

    }
}
