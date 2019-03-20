package chapter11.IO.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流测试
 * @author Crossing
 * @date 2019-03-20
 *
 *     java.io.FileReader extends InputStreamReader extends Reader
 *     FileReader:文件字符输入流
 *     作用:把硬盘文件中的数据以字符的方式读取到内存中
 *
 *     构造方法:
 *         FileReader(String fileName)
 *         FileReader(File file)
 *         参数:读取文件的数据源
 *             String fileName:文件的路径
 *             File file:一个文件
 *         FileReader构造方法的作用:
 *             1.创建一个FileReader对象
 *             2.会把FileReader对象指向要读取的文件
 *     字符输入流的使用步骤:
 *         1.创建FileReader对象,构造方法中绑定要读取的数据源
 *         2.使用FileReader对象中的方法read读取文件
 *         3.释放资源
 */
public class ReaderTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象,构造方法中绑定要读取的数据源
        FileReader fileReader = new FileReader("src/chapter11/IO/outputstream/c.txt");
        int read;
        //2.使用FileReader对象中的方法read读取文件
        while ((read = fileReader.read())!= -1){
            System.out.print((char)read);
        }
        //3.释放资源
        fileReader.close();
    }
}
