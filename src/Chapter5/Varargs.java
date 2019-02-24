package Chapter5;

/**
 * @author Crossing
 * @date 2019-02-24
 */
public class Varargs {

    //形参数卡可变的方法一
    public static void test(int a , String... books){
        for (String book :
                books) {
            System.out.println(book);
        }
        System.out.println(a + "\n");
    }

    //形参数卡可变的方法二
    public static void test1(int a , String[] books){
        for (String book :
                books) {
            System.out.println(book);
        }
        System.out.println(a + "\n");
    }
    public static void main(String[] args){
        //第一种表示方法的实例化
        test(5, "今天是个好日子", "我有个喜欢的女孩子");

        //第二种表示方法的实例化
        String[] str = new String[]{"今天是个好日子", "我有个喜欢的女孩子"};
        test1(5, str);
        test1(5, new String[]{"今天是个好日子", "我有个喜欢的女孩子"});
    }
}


