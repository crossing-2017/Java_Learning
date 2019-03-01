package chapter6;

/**
 * 初识接口，以及接口中的一些性质，接口中没有构造器和初始化块
 * @author Crossing
 * @date 2019-03-01
 */
public interface Output {
    //接口中的成员变量默认是public static final类型的
    int  MAX_CACHE_LINE = 30;

    //接口的权限只能是public abstract类型
     void put();
     void getData(String msg);

     //默认方法和静态方法必须要有方法体
     default void test(){
         System.out.println("默认的test（）方法");
     }

     default void print(String... msgs){
         for (String msg :
                 msgs) {
             System.out.println(msg);
         }
     }
    //静态方法的权限是public
      public static String staticTest(){
         return "接口里的静态方法";
     }

}
