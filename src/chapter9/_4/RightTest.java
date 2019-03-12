package chapter9._4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 将某个泛型集合添加到另外一个泛型集合之中
 * @author Crossing
 * @date 2019-03-12
 */
public class RightTest {

    private static <T> void rightTest(Collection<? extends T> cf, Collection<T> ct){
        ct.addAll(cf);
    }

    /**
     * 这两个方法的结构是一样的
     private static <E extends T, T> void rightTest1(Collection<E> ce, Collection<T> ct){
        ct.addAll(ce);
    }*/


    public static void main(String[] args) {
        List<Object>lo = new  ArrayList<>();

        List<String> ls= new ArrayList<>();

        rightTest(ls, lo);
    }
}
