package chapter6;

import org.omg.SendingContext.RunTime;

/**
 * 内存回收测试
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
            //RunTime.getRunTime().gc();
        }
    }
}
