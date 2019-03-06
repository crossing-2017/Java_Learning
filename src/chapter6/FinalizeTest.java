package chapter6;

/**
 * 关于内存回收的测试
 * @author Crossing
 * @date 2019-03-06
 */
public class FinalizeTest {
    public static FinalizeTest ft = null;
    public void info(){
        System.out.println("测试资源清理finalize方法");
    }

    public static void main(String[] args) {
        new FinalizeTest();
        //通知系统进行资源回收
        System.gc();
        Runtime.getRuntime().gc();
        //重新将变量引向对象
        System.runFinalization();
        //效果一样
        //Runtime.getRuntime().runFinalization();
        ft.info();
    }
    @Override
    public void finalize(){
        //让ft引用重新指向可恢复对象，让可恢复对象再次变得可达
        ft = this;
    }
}
