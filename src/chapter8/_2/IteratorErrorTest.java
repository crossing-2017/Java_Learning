package chapter8._2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 和IteratorTest一样，迭代器的remove方法只能删除上一次next返回的集合元素
 */
public class IteratorErrorTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Hello");
        arrayList.add("books");
        arrayList.add("chapter8");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);

            //迭代器中间可以删掉集合中的元素，但是无法向集合中添加元素
            if("books".equals(s)){
                //这里是错误的，remove只能删除next返回的元素
                //iterator.remove(s);
            }
        }
    }
}
