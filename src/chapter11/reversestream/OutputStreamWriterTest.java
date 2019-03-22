package chapter11.reversestream;

/**
 * 不同编码格式之间的转换
 * @author Crossing
 * @date 2019-03-22
 *
 * java.io.OutputStreamWriter extends Writer
 *     OutputStreamWriter: 是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。(编码:把能看懂的变成看不懂)
 *
 * 构造方法:
 *         OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter。
 *         OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
 *         参数:
 *             OutputStream out:字节输出流,可以用来写转换之后的字节到文件中
 *             String charsetName:指定的编码表名称,不区分大小写,可以是utf-8/UTF-8,gbk/GBK,...不指定默认使用UTF-8
 *     使用步骤:
 *         1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
 *         2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
 *         3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
 *         4.释放资源
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) {

    }
}
