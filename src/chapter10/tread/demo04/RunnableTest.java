package chapter10.tread.demo04;

/**
 * 实现多线程的第二种方法
 * @author Crossing
 * @date 2019-03-18
 *
 *
 * 实现Runnable接口创建多线程程序的好处:
 *         1.避免了单继承的局限性
 *             一个类只能继承一个类(一个人只能有一个亲爹),类继承了Thread类就不能继承其他的类
 *             实现了Runnable接口,还可以继承其他的类,实现其他的接口
 *         2.增强了程序的扩展性,降低了程序的耦合性(解耦)
 *             实现Runnable接口的方式,把设置线程任务和开启新线程进行了分离(解耦)
 *             实现类中,重写了run方法:用来设置线程任务
 *             创建Thread类对象,调用start方法:用来开启新线程
 */
public class RunnableTest {
    public static void main(String[] args) {

        //3.创建一个Runnable接口的实现类对象
        RunnableImpl runnableimpl = new RunnableImpl();
        //4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        //Thread t = new Thread(run);//打印线程名称
        Thread thread = new Thread(runnableimpl);
        //5.调用Thread类中的start方法,开启新的线程执行run方法
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
