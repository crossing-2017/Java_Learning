package chapter7._4;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期类的测试
 * @author Crossing
 * @date 2019-03-07
 */
public class DateTest {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        Date date1 = new Date();
        System.out.println(date1);
        Date date2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(date2 );
        System.out.println(System.currentTimeMillis());
    }
}
