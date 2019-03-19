package chapter10.lambda.demo01;

/**
 *创建Cook接口，用来测试Lambda表达式
 * @author Crossing
 * @date 2019-03-19
 *
 * Lambda表达式的标准格式:
 *         由三部分组成:
 *             a.一些参数
 *             b.一个箭头
 *             c.一段代码
 *         格式:
 *             (参数列表) -> {一些重写方法的代码};
 *         解释说明格式:
 *             ():接口中抽象方法的参数列表,没有参数,就空着;有参数就写出参数,多个参数使用逗号分隔
 *             ->:传递的意思,把参数传递给方法体{}
 *             {}:重写接口的抽象方法的方法体
 */
public interface Cook {
    public abstract void makeFood();
}
