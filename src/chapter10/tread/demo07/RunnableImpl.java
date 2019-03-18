package chapter10.tread.demo07;

/**
 * 线程同步方法测试, 解决线程安全问题方法一, 使用同步代码块
 * @author Crossing
 * @date 2019-03-18
 *
 *
 * 解决线程安全问题的一种方案:使用同步代码块
 *       格式:
 *           synchronized(锁对象){
 *               可能会出现线程安全问题的代码(访问了共享数据的代码)
 *           }
 *
 *       注意:
 *           1.通过代码块中的锁对象,可以使用任意的对象
 *           2.但是必须保证多个线程使用的锁对象是同一个
 *           3.锁对象作用:
 *               把同步代码块锁住,只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable{

    //定义一个多个线程共享的票源
    private int ticket = 100;


    //设置线程任务:卖票
    @Override
    public void run() {
        while (true){
            synchronized (this){    //这里的this是Runnable接口对象
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "当前在卖" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
