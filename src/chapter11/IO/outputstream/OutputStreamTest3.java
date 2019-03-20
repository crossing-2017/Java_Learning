package chapter11.IO.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件中字符续写和换行
 * @author Crossing
 * @date 2019-03-20
 */
public class OutputStreamTest3 {
    public static void main(String[] args) throws IOException {
        /**
         * 参数:
         *     String name,File file:写入数据的目的地
         *     boolean append:追加写开关
         *     true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
         *     false:创建一个新文件,覆盖源文件
         */
        FileOutputStream fos = new FileOutputStream("src/chapter11/IO/c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            //换行
            fos.write("\n".getBytes());
        }
        fos.close();
    }
}
