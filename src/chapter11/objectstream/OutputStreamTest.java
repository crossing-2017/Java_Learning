package chapter11.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象输出流测试
 * @author Crossing
 * @date 2019-03-22
 *
 * 构造方法:
 *         ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream。
 *         参数:
 *             OutputStream out:字节输出流
 *     特有的成员方法:
 *         void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream。
 *
 *     使用步骤:
 *         1.创建ObjectOutputStream对象,构造方法中传递字节输出流
 *         2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
 *         3.释放资源
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象,构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/chapter11/objectstream/person.txt"));
        //2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        oos.writeObject(new Person("小美女",18));
        //3.释放资源
        oos.close();
    }
}
