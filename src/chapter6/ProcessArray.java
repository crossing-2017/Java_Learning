package chapter6;

/**
 * 处理方法体入参
 * @author Crossing
 * @date 2019-03-04
 */
public class ProcessArray {
    public void process(int[] target, Command command){
        command.process(target);
    }
}
