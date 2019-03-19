package chapter11.file;

import java.io.File;

/**
 * 测试File类中的一些判断方法
 * @author Crossing
 * @date 2019-03-19
 *
 * File类判断功能的方法
 *         - public boolean exists() ：此File表示的文件或目录是否实际存在。
 *         - public boolean isDirectory() ：此File表示的是否为目录。
 *         - public boolean isFile() ：此File表示的是否为文件。
 *
 * 都比较简单，所以就做了第一个
 */
public class FileTest2 {
    public static void main(String[] args) {
        File file = new File("props.txt");
        System.out.println(file.exists());
    }
}
