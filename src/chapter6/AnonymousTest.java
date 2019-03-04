package chapter6;

/**
 * 关于匿名内部类的测试
 * @author Crossing
 * @date 2019-03-04
 */
public class AnonymousTest{
    public void test(Product1 product1){
        System.out.println("购买了一个：" + product1.getname() + ", 花了：" + product1.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest anonymousTest = new AnonymousTest();
        anonymousTest.test(new Product1() {

            // 这是一个接口实现类，所以可以有初始化块，是没有问题的
            {
                System.out.println("初始化块");
            }
            @Override
            public double getPrice() {
                return 23.4;
            }

            @Override
            public String getname() {
                return "小猫";
            }
        });

    }
}


interface Product1{
    public double getPrice();
    public String getname();
}
