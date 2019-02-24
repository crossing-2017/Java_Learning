package chapter5;

/**
 * @author Crossing
 * @date 2019-02-24
 */
public class OverloadVarargs {

    public  void test(String str){
        System.out.println("这是一个形参的方法");
    }
    public  void test(String... books){
        System.out.println("这个含有多个形参的方法");
    }
    public static void main(String[] args) {
        OverloadVarargs overloadVarargs = new OverloadVarargs();
        overloadVarargs.test();
        overloadVarargs.test("123");
        overloadVarargs.test("123", "456");
        overloadVarargs.test(new String[]{"123"});

    }

}
