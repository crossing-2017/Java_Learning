package chapter7._4;

import java.util.Calendar;

/**
 * 测试calendar类的容错方法
 * @author Crossing
 * @date 2019-03-07
 */
public class LenientTest {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.MONTH, 13);
        System.out.println(instance.getTime());
        instance.setLenient(true);
        instance.set(Calendar.MONTH, 13);
        System.out.println(instance.getTime());
    }
}
