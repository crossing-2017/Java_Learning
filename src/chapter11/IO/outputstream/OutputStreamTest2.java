package chapter11.IO.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 一次写多个字节的方法
 * @author Crossing
 * @date 2019-03-20
 */
public class OutputStreamTest2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/chapter11/IO/b.txt");

        /**
         * public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
         * 一次写多个字节:
         *     如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
         *     如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
         */
        fos.write(new byte[]{49, 48, 48});
        fos.close();
    }
}
