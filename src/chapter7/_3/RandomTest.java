package chapter7._3;

import java.util.Random;

/**
 * 关于随机数类的测试
 * @author Crosssing
 * @date 2019-03-06
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
    }
}
