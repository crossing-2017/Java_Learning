package chapter10.lambda.demo01;

/**
 * 用来测试Lambda表达式所做类
 * @author Crossing
 * @date 2019-03-19
 */
public class CookTest {

    public static void main(String[] args) {

        invokeCook(() -> System.out.println("做饭"));
    }


    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
