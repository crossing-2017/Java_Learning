package chapter8._2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * 经一步检验removeIf方法的测试，直接可以用
 * @author Crossing
 * @date 2019-03-13
 */
public class PredicateTest2 {
    private static int listAll(Collection collections , Predicate p){
        int total = 0;

        for (Object collection : collections) {
            //使用Predicate的test方法检查该对象是否满足Predicate的指定要求
            if (p.test(collection)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Hello");
        arrayList.add("books");
        arrayList.add("chapter8");
        System.out.println(listAll(arrayList, obj->((String)obj).contains("o")));
    }
}
