package chapter5;

/**
 * @author Crossing
 * @date 2019-02-25
 */
public class OverrideTest extends Fruit{
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.wight = 12;
        test.info(12);
    }

    @Override
    public void info(int wight){
        //super.info(wight);
        System.out.println("重载的重量是：" + wight);
    }
}


class Fruit{
    int wight;
    public void info(int wight){
        System.out.println("水果的重量是：" + wight);
    }
}