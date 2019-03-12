package chapter9._4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 设置通配符下限测试
 * @author Crossing
 * @date 2019-03-12
 */
public class MyUtils {


    /**
     * cs必须是ct的同类，或者是其的父类
     * @param cs
     * @param ct
     * @param <T>
     * @return
     */
    static <T> T copy(Collection<? super T> cs , Collection<T> ct){
            T last = null;
        for (T cts :
                ct) {
            last = cts;
            System.out.println(cts);
            cs.add(cts);
        }

        return last;
    }


    public static void main(String[] args) {

        Collection<Number> cn = new ArrayList<>();
        Collection<Integer> ci = new ArrayList<>();

        ci.add(5);

        copy(cn, ci);
    }
}
