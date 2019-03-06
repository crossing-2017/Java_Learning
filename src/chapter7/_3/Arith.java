package chapter7._3;
import java.math.BigDecimal;

/**
 * BigDecimal类中关于准确计算浮点数的构造器Arith的测试
 * @author Crossing
 * @date 2019-03-06
 */
public class Arith {
    /**
     * 除法运算精度
     */
    private static final int DEV_DIV_SCALE = 10;


    private Arith(){}

    /**
     * 提供精确的加法运算
     * @param d1
     * @param d2
     * @return
     */
    public static double add(double d1, double d2){
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        return bd1.add(bd2).doubleValue();
    }

    /**
     * 提供精确的减法运算
     * @param d1
     * @param d2
     * @return
     */
    public static double sub(double d1, double d2){
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        return bd1.subtract(bd2).doubleValue();
    }

    /**
     * 提供精确的乘法运算
     * @param d1
     * @param d2
     * @return
     */
    public static double mul(double d1, double d2){
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        return bd1.multiply(bd2).doubleValue();
    }

    /**
     * 提供相对精确的除法运算，当除不尽的时候
     * 精确到小数点以后10位的数字四舍五入
     * @param d1
     * @param d2
     * @return
     */
    public static double div(double d1, double d2){
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        return bd1.divide(bd2, DEV_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 如果以后的浮点数运算，可以考虑这种方式
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("0.05 + 0.01 = " + Arith.add(0.05, 0.01));
        System.out.println("1.0 - 0.42 = " + Arith.sub(1.0, 0.42));
        System.out.println("4.015 * 100 = " + Arith.mul(4.015, 100));
        System.out.println("123.3 / 100 = " + Arith.div(123.3, 100));
    }
}
