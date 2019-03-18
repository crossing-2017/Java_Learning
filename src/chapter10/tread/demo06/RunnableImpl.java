package chapter10.tread.demo06;

/**
 * Runnable接口的实现类，用来测试多线程安全问题
 * @author Crossing
 * @date 2019-03-18
 */
public class RunnableImpl implements Runnable{

    //定义一个多个线程共享的票源
    private int ticket = 100;

    //设置线程任务:卖票
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "当前在卖" + ticket + "张票");
                ticket--;
            }
        }
    }
}
