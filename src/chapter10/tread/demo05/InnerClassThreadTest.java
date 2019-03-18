package chapter10.tread.demo05;

/**
 * 匿名内部类创建多线程
 * @author Crossing
 * @date 2019-03-18
 *
 *
 * 匿名内部类作用:简化代码
 *         把子类继承父类,重写父类的方法,创建子类对象合一步完成
 *         把实现类实现类接口,重写接口中的方法,创建实现类对象合成一步完成
 *     匿名内部类的最终产物:子类/实现类对象,而这个类没有名字
 */
public class InnerClassThreadTest {
    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
        }).start();

        Runnable runnable = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + "-->" + "123");
            }
        };

        new Thread(runnable).start();
    }
}
