package chapter10.tread.demo03;

/**
 * 线程sleep的方法测试
 * @author Crossing
 * @date 2019-03-18
 */
public class ThreadSleepTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
