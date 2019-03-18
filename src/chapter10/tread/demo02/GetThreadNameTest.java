package chapter10.tread.demo02;

/**
 * 获取线程的名称测试1
 * @author Crossing
 * @date 2019-03-18
 */
public class GetThreadNameTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}
