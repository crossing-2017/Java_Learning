package chapter10.tread.demo07;

/**
 * 线程安全问题处理的检测测试
 * @author Crossing
 * @date 2019-03-18
 *
 */
public class SynchronizedTest {
    public static void main(String[] args) {
//        RunnableImpl runnable = new RunnableImpl();
//
//        new Thread(runnable).start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();


//        RunnableImpl2 runnable2 = new RunnableImpl2();
//
//        new Thread(runnable2).start();
//        new Thread(runnable2).start();
//        new Thread(runnable2).start();


        RunnableImpl3 runnable3 = new RunnableImpl3();

        new Thread(runnable3).start();
        new Thread(runnable3).start();
        new Thread(runnable3).start();
    }
}
