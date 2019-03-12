package chapter9._1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 测试泛型中尖括号里面的类型变化和方式
 * @author Crossing
 * @date 2019-03-08
 */
public class DiamondTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.forEach(str-> System.out.println(str.length()));

        //value为非基本数据类型时的表示方法
        HashMap<String, ArrayList<String>> schoolMap = new HashMap<>();
        ArrayList<String> school = new ArrayList<>();


        school.add("123");
        school.add("456");
        schoolMap.put("000", school);

        //遍历Map，输出其中的数据
        //结果是000-->[123, 456]
        schoolMap.forEach((key, value)-> System.out.println(key + "-->" + value));

    }
}
