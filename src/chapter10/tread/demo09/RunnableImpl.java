package chapter10.tread.demo09;

/**
 * 线程池方法的测试类
 * @author Crossing
 * @date 2019-03-19
 */
public class RunnableImpl implements Runnable{      //2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建一个新的线程" );
    }
}
