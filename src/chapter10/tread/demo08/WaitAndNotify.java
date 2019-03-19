package chapter10.tread.demo08;

/**
 * 关于线程通讯中消费者和生产者的测试学习
 * @author Crossing
 * @date 2019-03-18
 *
 * 等待唤醒案例:线程之间的通信
 *         创建一个顾客线程(消费者):告知老板要的包子的种类和数量,调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
 *         创建一个老板线程(生产者):花了5秒做包子,做好包子之后,调用notify方法,唤醒顾客吃包子
 *
 *     注意:
 *         顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个在执行
 *         同步使用的锁对象必须保证唯一
 *         只有锁对象才能调用wait和notify方法
 *
 *     Obejct类中的方法
 *     void wait()
 *           在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
 *     void notify()
 *           唤醒在此对象监视器上等待的单个线程。
 *           会继续执行wait方法之后的代码
 */
public class WaitAndNotify {

    public static void main(String[] args) {

        //创建锁对象,保证唯一
        Object obj = new Object();
        boolean b = false;

        //创建一个消费者线程

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("告诉老板，我来买包子了");
                        //调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                        if (b == false) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子真好吃");
                        System.out.println("--------------------");
                        obj.notify();
                    }

                }
            }
        }.start();



        //创建一个生产者线程

       /* new Thread() {
            @Override
            public void run() {
                while (true){
                    //花了5秒做包子
                    //如果这里没有等待五秒的话，两个线程就无法实现同步
                    //实际上，就是让生产者故意等待，放弃抢占锁的权利才有了线程同步的表象
              *//*  try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*//*
                    //保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                    synchronized (obj){
                        if(b == true) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("包子做好了，可以卖了");
                        b = true;
                        //做好包子之后,调用notify方法,唤醒顾客吃包子
                        obj.notify();

                    }
                }
            }
        }.start();*/

    }
}
