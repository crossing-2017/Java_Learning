package chapter11.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 输入缓存字节流测试
 * @author Crossing
 * @date 2019-03-20
 *
 * BufferedInputStream:字节缓冲输入流
 *
 *     继承自父类的成员方法:
 *         int read()从输入流中读取数据的下一个字节。
 *         int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *         void close() 关闭此输入流并释放与该流关联的所有系统资源。
 *
 *     构造方法:
 *         BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *         BufferedInputStream(InputStream in, int size) 创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *         参数:
 *             InputStream in:字节输入流
 *                 我们可以传递FileInputStream,缓冲流会给FileInputStream增加一个缓冲区,提高FileInputStream的读取效率
 *             int size:指定缓冲流内部缓冲区的大小,不指定默认
 *
 *     使用步骤(重点):
 *         1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *         2.创建BufferedInputStream对象,构造方法中传递FileInputStream对象,提高FileInputStream对象的读取效率
 *         3.使用BufferedInputStream对象中的方法read,读取文件
 *         4.释放资源
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/chapter11/buffer/a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[3];
        int len;

        //bis.read(bytes)方法返回的是从文本中读取的字节长度，或者如果文本中没有字节了，就返回-1
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        bis.close();

    }
}
