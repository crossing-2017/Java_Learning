package chapter6;

/**
 * 创建可以被访问的内部类，包括声明以及怎么新建对象
 * @author Crossing
 * @date 2019-03-04
 */
public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("zhangsan");
    }

}


class Out{
    class In{
        public In(String msg){
            System.out.println(msg);
        }
    }
}