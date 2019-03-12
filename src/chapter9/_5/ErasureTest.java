package chapter9._5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 泛型擦除类型测试
 * @author Crossing
 * @date 2019-03-12
 */
public class ErasureTest {
    public static void main(String[] args) {
        Apple<Integer> a = new Apple<>(5);
        a.getT();
        // 这里将引用变量a赋值个引用变量b，但是抹去了b的泛型类型，所以这里默认将b设定成最高的父类类型，即Number类型
        Apple b = a;
        Number t = b.getT();
        //这里是错误的，因为此时的b是Number类型，但是可以强转，如注释第二行
        //Integer i1 = b.getT();
        //Integer b1 = (Integer) b.getT();

        //java中不允许有泛型数组出现，所以下面的这句话是错误的
        //new ArrayList<String>[10];

        /**
         * 原因
         * List<Integer> arrayOfIdList[] = new ArrayList<Integer>[10];// Suppose generic array creation is legal.
         * List<String> nameList = new ArrayList<String>();
         * Object objArray[] = arrayOfIdList; // that is allowed because arrays are covariant
         * objArray[0] = nameList;
         * Integer id = objArray[0].get(0);
         */
    }
}


class Apple<T extends Number>{
    T t;

    public Apple(){};

    public Apple(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
