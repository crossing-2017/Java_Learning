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

        // 用匿名内部类实现形参为方法体的情况
        processArray.process(targets, new Command() {
            int sum = 0;
            @Override
            public void process(int[] targets) {
                for (int target :
                        targets) {
                    sum = sum + target;
                }
                System.out.println(sum);
            }
        });

        // Lambda编程
        processArray.process(targets, (int[] aims)->{
            int sum = 0;
            for (int target :
                    targets) {
                sum = sum + target;
            }
            System.out.println(sum);
        });


    }
}
