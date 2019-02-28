package chapter6;

/**
 * @author Crossing
 * @date 2019-02-28
 * @return final关键字赋值的几种情景
 */
public class FinalVariableTest {


    //成员变量申明时就初始化了，合法
    final int a = 6;
    final String str;
    final int c;
    final static int d;

    //静态初始化块赋值，合法
    static {
        d = 3;
    }

    //初始化块赋值，合法
    {
        str = "Crossing";
    }

    //构造器中赋值，合法
    public FinalVariableTest(){
        c = 7;
    }


    public void changeFinal(){
        //普通方法无法为final关键字修饰的变量赋值
    }



    public static void main(String[] args){

        FinalVariableTest finalVariableTest = new FinalVariableTest();

        //以上就是被final关键字修饰后的所有赋值的场景
        System.out.println(finalVariableTest.a);
        System.out.println(finalVariableTest.str);
        System.out.println(finalVariableTest.c);
        System.out.println(FinalVariableTest.d);


    }
}
