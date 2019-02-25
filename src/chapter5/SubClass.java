package chapter5;

/**
 * @author Crossing
 * @date 2019-02-25
 * @return 多态的表示方法
 */
public class SubClass extends BaseClass{
    public void sub(){
        System.out.println("这是子类所自有的方法");
    }

    @Override
    public void test(){
        super.test();
        System.out.println("这是子类要覆盖掉父类的方法");
    }

    public static void main(String[] args) {
        BaseClass baseClass = new SubClass();
        baseClass.base();
        baseClass.test();
        ((SubClass) baseClass).sub();

    }
}


class BaseClass{
    public void base(){
        System.out.println("这是父类所有的方法");
    }

    public void test(){
        System.out.println("这是父类要被覆盖的方法");
    }
}