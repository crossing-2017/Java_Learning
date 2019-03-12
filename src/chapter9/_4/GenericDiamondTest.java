package chapter9._4;

/**
 * 测试Java7中新添加的菱形语法
 * @author Crossing
 * @date 2019-03-12
 */
public class GenericDiamondTest {

    public static void main(String[] args) {
        //Myclass类声明的E的形参是String类型
        //构造器中声明的T的形参是Integer类型
        Myclass<String> myclass1 = new Myclass<>(5);

        //显示指定构造器中声明的T的形参是Integer类型
        Myclass<String> myclass2 = new <Integer>Myclass<String>(5);

        //显示指定构造器中声明的T的形参是Integer类型
        //此时不能使用菱形语法，下面的语句错误
        //Myclass myclass3 = new <Integer>Myclass<>(5);
    }

}


class Myclass<E>{

    public <T> Myclass(T t){
        System.out.println("t中的内容是:" + t);
    }
}
