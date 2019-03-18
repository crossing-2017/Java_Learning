package chapter10.tread.demo07;

/**
 * 线程同步方法测试, 解决线程安全问题方法三, 使用静态同步方法
 * @author Crossing
 * @date 2019-03-18
 */
public class RunnableImpl3 implements Runnable{
    private static int ticket = 100;


    //设置线程任务:卖票
    @Override
    public void run() {
        while (true){
            sellTickets();
        }

    }

    public static /*synchronized*/ void sellTickets(){

        synchronized (RunnableImpl3.class) {        //静态方法的锁对象是本类的class属性-->class文件对象(反射)
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "当前在卖" + ticket + "张票");
                ticket--;
            }
        }
    }
}
