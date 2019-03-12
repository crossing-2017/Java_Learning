package chapter9._4;

/**
 *泛型构造器的测试
 * @author Crossing
 * @date 2019-03-12
 */
public class GenericConstructorTest {

    public <T> GenericConstructorTest(T t){
        System.out.println(t);
    }


    public static void main(String[] args) {
        //泛型构造器中的参数T为String类型
        new GenericConstructorTest("Java");
        //泛型构造器中的参数T为Integer类型
        new GenericConstructorTest(123);
        //显示的指出泛型构造器参数T为String
        //传入的参数也是String类型，所以是正确的
        new <String>GenericConstructorTest("Hello");
        //显示的指出泛型构造器参数T为String
        //传入的参数也是Integer类型，所以是错误的
        //new <String> GenericConstructorTest(456);
    }
}
