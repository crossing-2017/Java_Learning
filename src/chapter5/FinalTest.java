package chapter5;

/**
 * @author Crossing
 * @date 2019-02-25
 * @return 初始化块，构造器，this，super，static的综合问题，查看输出顺序
 */
public class FinalTest {
    public static void main(String[] args) {

        new Mid(123);
        System.out.println("\n");
        new Mid(123);
    }

}


class Root{


    static {
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的一般初始化块");
    }

    public Root(){
        System.out.println("Root的无参构造器");
    }

    public Root(String name){
        System.out.println("Root的含参构造器");
    }
}


class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }

    {
        System.out.println("Mid的一般初始化块");
    }

    public Mid(){
        System.out.println("Mid的无参构造器");
    }

    public Mid(int age){
        this();
        System.out.println("Mid的含参构造器");
    }
}

class Left extends Root{
    static {
        System.out.println("Left的静态初始化块");
    }

    {
        System.out.println("Left的一般初始化块");
    }

    public Left(){
        super("123");
        System.out.println("Left的无参构造器");
    }
}


/**结果
*   Root的静态初始化块
    Mid的静态初始化块
    Root的一般初始化块
    Root的无参构造器
    Mid的一般初始化块
    Mid的无参构造器
    Mid的含参构造器


    Root的一般初始化块
    Root的无参构造器
    Mid的一般初始化块
    Mid的无参构造器
    Mid的含参构造器



    实际上就是在类初始化的时候执行静态初始化块，新建对象时就不再执行静态初始化块了，但是
    每新建一个对象都要执行类中的一般初始化块和构造器，
    执行过程是父类的初始化块，构造器，再到子类的初始化块，构造器
*/