package chapter10.exception;

import java.util.Objects;

/**
 * Objects中静态方法的测试
 * @author Crossing
 * @date 2019-03-17
 *
 *
 * Objects类中的静态方法
 *     public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
 *     源码:
 *         public static <T> T requireNonNull(T obj) {
 *             if (obj == null)
 *                 throw new NullPointerException();
 *             return obj;
 *         }
 */
public class ObjectsTest {
    public static void main(String[] args) {
        Object obj = null;
        method(obj);
    }


    public static void method(Object obj){
//        if (obj == null){
//            throw new NullPointerException("传递的对象为空");
//        }

        Objects.requireNonNull(obj, "传递的对象为空");
    }
}
