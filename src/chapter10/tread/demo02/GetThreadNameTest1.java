package chapter10.tread.demo02;

/**
 * 获取线程名称的第二种方法
 * @author Crossing
 * @date 2019-03-18
 */
public class GetThreadNameTest1 {

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

        //获取main方法的方法名
        System.out.println(Thread.currentThread().getName());


    }
}
