package chapter11.IO.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流测试一
 * @author Crossing
 * @date 2019-03-20
 *
 * java.io.FileInputStream extends InputStream
 *     FileInputStream:文件字节输入流
 *     作用:把硬盘文件中的数据,读取到内存中使用
 *
 *     构造方法:
 *         FileInputStream(String name)
 *         FileInputStream(File file)
 *         参数:读取文件的数据源
 *             String name:文件的路径
 *             File file:文件
 *         构造方法的作用:
 *             1.会创建一个FileInputStream对象
 *             2.会把FileInputStream对象指定构造方法中要读取的文件
 *
 *     读取数据的原理(硬盘-->内存)
 *         java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
 *
 *     字节输入流的使用步骤(重点):
 *         1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *         2.使用FileInputStream对象中的方法read,读取文件
 *         3.释放资源
 */
public class InputStreamTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/chapter11/IO/outputstream/a.txt");
        /*int read = fis.read();
        System.out.println(read);
        int read2 = fis.read();
        System.out.println(read2);
        int read3 = fis.read();
        System.out.println(read3);
        int read4 = fis.read();
        System.out.println(read4);      //-1*/

        int length;
        while ((length = fis.read()) != -1){
            System.out.print((char) length);
        }
        fis.close();
    }
}
