package chapter10.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 基础异常测试
 * @author Crossing
 * @date 2019-03-17
 */
public class ExceptionTest1 {

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = date.parse("1995-09-17");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);

        int[] array = {1, 2, 3};

        System.out.println(array[0]);
    }
}
