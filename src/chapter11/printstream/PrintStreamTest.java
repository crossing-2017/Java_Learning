package chapter11.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 关于打印流的测试
 * @author Crossing
 * @date 2019-03-22
 *
 *  可以改变输出语句的目的地(打印流的流向)
 *     输出语句,默认在控制台输出
 *     使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
 *         static void setOut(PrintStream out)
 *           重新分配“标准”输出流。
 */
public class PrintStreamTest {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("123");
        PrintStream printStream = new PrintStream("src/chapter11/printstream/a.txt");
        System.setOut(printStream);
        System.out.println("234");

    }
}
