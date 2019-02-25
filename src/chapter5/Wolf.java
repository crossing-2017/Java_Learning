package chapter5;

/**
 * @author Crossing
 * @date 2019-02-25
 */
public class Wolf extends Animal{

    public Wolf() {
        super("zhangsan", "hongse");
        System.out.println("这是Wolf的无参构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}


class Creature{
    public Creature(){
        System.out.println("这个是Creature的构造器");
    }
}

class Animal extends Creature{
    public Animal(String name){

        System.out.println("这是带有一个形参的构造器");
    }

    public Animal(String name, String color){
        this(name);
        System.out.println("这是带有两个形参的构造器");

    }
}