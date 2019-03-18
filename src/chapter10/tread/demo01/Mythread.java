package chapter10.tread.demo01;

/**
 * 第一个thread类
 * @author Crossing
 * @date 2019-03-18
 */
public class Mythread extends Thread{       //1.创建一个Thread类的子类


    //2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("run: " + i);
        }
    }
}
