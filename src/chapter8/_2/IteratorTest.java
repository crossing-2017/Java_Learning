package chapter8._2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator方法来遍历集合
 * @author Crossing
 * @date 2019-03-13
 */
public class IteratorTest {

    /**
     * 用Iterator方法来遍历集合
     * @param args
     */
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
                iterator.remove();
            }
        }

        /*此方法与上面方法效果相同
        for (String anArrayList :
                arrayList) {
            System.out.println(anArrayList);
        }*/

        //输出整个集合
        System.out.println(arrayList);
    }
}
