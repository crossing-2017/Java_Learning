package chapter10.tread.demo06;

import chapter10.tread.demo07.RunnableImpl;

/**
 * 测试线程安全问题
 * @author Crossing
 * @date 2019-03-18
 */
public class TicketTest {

    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();

        /**
         * 这样会出现线程安全问题
         */
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
