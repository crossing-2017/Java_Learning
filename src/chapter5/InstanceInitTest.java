package chapter5;

/**
 * @author Crossing
 * @date 2019-02-25
 * @return 初始化块位置的不同对结果的影响
 */
public class InstanceInitTest {

    //这两行位置的不同将会导致a的结果不同
    int a = 9;

    {
        a = 6;
    }
    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
    }
}
