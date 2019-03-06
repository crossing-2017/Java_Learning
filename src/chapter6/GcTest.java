package chapter6;

/**
 * 内存回收测试
 * @author Crossing
 * @date 2019-03-06
 */
public class GcTest {

    @Override
    public void finalize(){
        System.out.println("系统正在清理资源");
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 4 ; i++){
            new GcTest();
            System.gc();
            //这两种方法的效果是一样的
            //Runtime.getRuntime().gc();
        }
    }
}
