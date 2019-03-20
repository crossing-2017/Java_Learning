package chapter11.IO.inputstream;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
/**
 * 字节输入流从文件中一次获取多个字节的方法
 * @author Crossing
 * @date 2019-03-20
 */
public class InputStreamTest02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/chapter11/IO/outputstream/a.txt");
        byte[] bytes = new byte[2];
        int read = fis.read(bytes);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes));
    }
}
