package chapter6;

/**
 * 创建静态内部类,包括怎么声明以及创建对象
 * @author Crossing
 * @date 2019-03-04
 */
public class CreateStaticInnerInstance {
    public static void main(String[] args) {
        StaticOut.StaticInner staticInner = new StaticOut.StaticInner();
    }
}



class StaticOut{


    static class StaticInner{

        public StaticInner(){
            System.out.println("静态内部类");
        }
    }
}