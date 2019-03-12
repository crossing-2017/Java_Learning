package chapter9._4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 关于泛型方法的测试
 * @author Crossing
 * @date 2019-03-12
 */
public class GenericMethodTest {


     static  <T> void fromArraytoCollection(T[] t, Collection<T> c){
        for (T o :
                t) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] o = new Object[100];

        Collection<Object> co = new ArrayList<>();

        fromArraytoCollection(o, co);

        String[] strings = new String[100];
        Collection<String> cs = new ArrayList<>();

        fromArraytoCollection(strings, cs);
        fromArraytoCollection(strings, co);


        Integer[] integers = new Integer[100];
        fromArraytoCollection(integers, co);
        //这句话有问题，不能这么使用，Integer不是String的子类
        //fromArraytoCollection(integers, cs);

    }

}
