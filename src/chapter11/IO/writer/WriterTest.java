package chapter11.IO.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidParameterException;

/**
 * 字符输出流测试
 * @author Crossing
 * @date 2019-03-20
 *
 * java.io.FileWriter extends OutputStreamWriter extends Writer
 *     FileWriter:文件字符输出流
 *     作用:把内存中字符数据写入到文件中
 *
 *     构造方法:
 *         FileWriter(File file)根据给定的 File 对象构造一个 FileWriter 对象。
 *         FileWriter(String fileName) 根据给定的文件名构造一个 FileWriter 对象。
 *         参数:写入数据的目的地
 *             String fileName:文件的路径
 *             File file:是一个文件
 *         构造方法的作用:
 *             1.会创建一个FileWriter对象
 *             2.会根据构造方法中传递的文件/文件的路径,创建文件
 *             3.会把FileWriter对象指向创建好的文件
 *
 *     字符输出流的使用步骤(重点):
 *         1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
 *         2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
 *         3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
 *         4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
 */
public class WriterTest {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("src/chapter11/IO/writer/a.txt");
        //2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
        for (int i = 0; i < 10; i++) {
            fw.write("你好");
            //换行
            fw.write("\n");
        }
        //3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        fw.flush();
        //4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
        fw.close();
    }
}
