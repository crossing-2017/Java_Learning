package chapter10.lambda.demo03;

/**
 * 对计算器接口的实现
 * @author Crossing
 * @date 2019-03-19
 */
public class CalculatorTest {
    public static void main(String[] args) {

        //调用invokeCalc方法,方法的参数是一个接口,可以使用匿名内部类
        invokeCul(10, 20, new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

        });

        //使用Lambda表达式简化匿名内部类的书写
        invokeCul(120,130,(int a,int b)->{
            return a + b;
        });

        //优化省略Lambda
        invokeCul(2, 3, (a, b) -> a+b);
    }

    public static void invokeCul(int a, int b, Calculator c){
        int sum = c.add(a, b);

        System.out.println(sum);
    }
}
