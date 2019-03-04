package chapter6;

/**
 * 测试简单的工厂模式
 * @author Crossing
 * @date 2019-03-04
 */
public class Computer {

    private Output output;

    public Computer(Output output){
        this.output = output;
    }


    public void keyIn(String msg){
        output.getData(msg);
    }

    public void print(){
        output.out();
    }
}
