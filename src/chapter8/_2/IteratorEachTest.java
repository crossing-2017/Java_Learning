package chapter8._2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Interator加Lambda表达式
 * @author Crossing
 * @date 2019-03-13
 */
public class IteratorEachTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Hello");
        arrayList.add("books");
        arrayList.add("chapter8");

        // Iterator遍历加Lambda表达式表示方法
        Iterator<String> iterator = arrayList.iterator();
        iterator.forEachRemaining(obj-> System.out.println("每一个迭代的元素:" + obj));
    }
}
