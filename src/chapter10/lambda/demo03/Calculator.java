package chapter10.lambda.demo03;

/**
 * 定义一个计算器接口，用来测试Lambda表达式
 * @author Crossing
 * @date 2019-03-19
 */
public interface Calculator {
    /**
     * 设置计算机相加的抽象方法
     * @param a
     * @param b
     * @return
     */
    int add(int a, int b);
}
