package chapter10.tread.demo07;
/**
 * 线程同步方法测试, 解决线程安全问题方法二, 使用同步方法
 * @author Crossing
 * @date 2019-03-18
 *
 *
 * 解决线程安全问题的二种方案:使用同步方法
 *     使用步骤:
 *         1.把访问了共享数据的代码抽取出来,放到一个方法中
 *         2.在方法上添加synchronized修饰符
 *
 *     格式:定义方法的格式
 *     修饰符 synchronized 返回值类型 方法名(参数列表){
 *         可能会出现线程安全问题的代码(访问了共享数据的代码)
 *     }
 */
public class RunnableImpl2 implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;


    //设置线程任务:卖票
    @Override
    public void run() {
        while (true){
            sellTickets();
        }

    }

    public void sellTickets(){

        synchronized (this) {       //这里的this是Runnable接口对象
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "当前在卖" + ticket + "张票");
                ticket--;
            }
        }
    }
}
