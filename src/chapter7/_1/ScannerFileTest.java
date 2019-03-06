package chapter7._1;

import java.io.File;
import java.util.Scanner;

/**
 * Scanner方法的入参是一个文件
 * @author Crossing
 * @date 2019-03-06
 */
public class ScannerFileTest {
    public static void main(String[] args) throws Exception{
        //这里用的是绝对路径，在工作中开始是不能用的，后面有可以用相对路径的方法时再在后面补上
        Scanner scanner = new Scanner(new File("/Users/crossing/GitHub/Java_Learning/src/chapter7/_1/ScannerKeyBoardTest.java"));
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
