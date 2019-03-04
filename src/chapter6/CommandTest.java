package chapter6;

/**
 * 对方法体入参的测试
 * @author Crossing
 * @date 2019-03-04
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] targets = {2, 4, 6, 7, -3};
        processArray.process(targets, new PrintCommand());
        System.out.println("----------------");
        processArray.process(targets, new SumCommand());
    }
}
