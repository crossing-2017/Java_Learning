package chapter6;

/**
 * 新建简单的工厂类，为以后重构做准备
 * @author Crossing
 * @date 2019-03-04
 */
public class OutPutFactory {

    public Output getOutput(){
        return new Printer();
    }

    public static void main(String[] args) {
        OutPutFactory outPutFactory = new OutPutFactory();

        Computer computer = new Computer(outPutFactory.getOutput());
        computer.keyIn("Java");
        computer.keyIn("Android");
        computer.print();

    }
}
