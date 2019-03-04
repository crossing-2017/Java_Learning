package chapter6;

/**
 * 方法体入参的实现类
 * @author Crossing
 * @date 2019-03-04
 */
public class SumCommand implements Command{
    private int sum = 0;
    @Override
    public void process(int[] targets) {
        for (int target :
                targets) {
            sum = sum + target;
        }
        System.out.println(sum);
    }
}
