package chapter8.collections;

import java.util.ArrayList;

/**
 * 测试Collections的一些常用的静态方法
 * @author Crossing
 * @date 2019-03-15
 */
public class Collections {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //测试addAll的方法
        java.util.Collections.addAll(arrayList, "1", "2", "3");
        System.out.println(arrayList);
        java.util.Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
