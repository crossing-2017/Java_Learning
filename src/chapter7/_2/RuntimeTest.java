package chapter7._2;

/**
 * Runtime类中的一些方法
 * @author Crossing
 * @date 2019-03-06
 */
public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器的个数：" + runtime.availableProcessors());
        System.out.println("空闲内存数：" + runtime.freeMemory());
        System.out.println("内存总数：" + runtime.totalMemory());
        System.out.println("最大内存数：" + runtime.maxMemory());
    }
}
