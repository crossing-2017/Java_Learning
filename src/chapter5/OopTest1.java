package chapter5;

/**
 * @author Crossing
 * @date 2019/02/23
 */
public class OopTest1 {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.run();
    }
}


class Dog{
    private void jump(){
        System.out.println("正在执行jump方法！");
    }

    /**
     * 当新建一个对象后，此时，这里的this即之该对象
     */
    public void run(){
        this.jump();
        System.out.println("正在执行run方法！");
    }

    //也可以这样，在一个类中一个方法调用另一个方法时，this可以省略
    /**
    public void run(){
        jump();
        System.out.println("正在执行run方法！");
    }*/
}