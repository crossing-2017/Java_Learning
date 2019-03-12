package chapter9._1;

import java.util.ArrayList;

/**
 * 接入泛型之后的测试
 * @author Crossing
 * @date 2019-03-08
 */
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello ");
        arrayList.add("Java");
        //这里会报错，因为这里只能添加String类型
        //arrayList.add(5);
        arrayList.add(String.valueOf(5));
        arrayList.forEach(str-> System.out.println(str.length()));
    }
}
