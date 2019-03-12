package chapter9._1;

import java.util.ArrayList;

/**
 * 在没有泛型之前会出现类型转换错误
 * @author Crossing
 * @date 2019-03-08
 */
public class ListErr {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.add(5);
        // 这里会自动封装成基本类型的包装类，即这里会输出Integer
        System.out.println(arrayList.get(2).getClass());
    }
}
