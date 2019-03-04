package chapter6;

/**
 * 方法体入参的实现类
 * @author Crossing
 * @date 2019-03-04
 */
public class PrintCommand implements Command{
    @Override
    public void process(int[] targets) {
        for (int target :
                targets) {
            System.out.println(target);
        }
    }
}
