package Chapter5;

/**
 * @author crossing
 * @date 2019/02/23
 */
public class OopTest_1 {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.run();
    }
}


class Dog{
    public void jump(){
        System.out.println("正在执行jump方法！");
    }

    public void run(){
        this.jump();
        System.out.println("正在执行run方法！");
    }
}