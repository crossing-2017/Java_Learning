package chapter6;

import java.lang.ref.WeakReference;

/**
 * 关于各种引用的测试
 * 关于弱引用相当于地址寻址，即弱引用对象指向实际对象，实际对象的内容发生的改变，弱引用中的数据即发生了改变
 * @author Crossing
 * @date 2019-03-06
 */
public class ReferenceTest {

    public static void main(String[] args) {
        String str = "疯狂的java讲义";
        WeakReference<String> stringWeakReference = new WeakReference<>(str);
        str = "123";
        System.out.println(stringWeakReference.get());
        System.gc();
        Runtime.getRuntime().runFinalization();
        System.out.println(str);

    }
}
