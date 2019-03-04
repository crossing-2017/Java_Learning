package chapter6;

/**
 * 带有入参的匿名内部类的测试
 * @author Crossing
 * @date 2019-03-04
 */
public class AnonymousInner {

    public void test(Device device){
        System.out.println("购买了一个：" + device.getName() + ", 花了：" + device.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner anonymousInner = new AnonymousInner();
        anonymousInner.test(new Device("小猫") {
            @Override
            public double getPrice() {
                return 23.4;
            }
        });


        Device d = new Device() {
            //初始化块
            {
                System.out.println("匿名内部类的初始化块");
            }


            @Override
            public double getPrice() {
                return 34.5;
            }

            @Override
            public String getName() {
                return "小狗";
            }

        };

        anonymousInner.test(d);
    }
}

/**
 * 抽象类中的抽象方法一定要加public abstract
 */
abstract class Device{
    private String name;

    public abstract double getPrice();

    public Device(){}

    public Device(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}