package chapter7._1;

import java.util.Scanner;

/**
 * 对可输入方法Scanner方法的测试
 * @author Crossing
 * @date 2019-03-06
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //这行的意思是要把回车作为分隔符
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            System.out.println("键盘输入的内容：" + scanner.next());
        }
    }
}
