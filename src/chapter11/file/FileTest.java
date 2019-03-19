package chapter11.file;

import java.io.File;

/**
 * 关于文件学习的第一个测试
 * @author Crossing
 * @date 2019-03-19
 *
 *
 * java.io.File类
 *     文件和目录路径名的抽象表示形式。
 *     java把电脑中的文件和文件夹(目录)封装为了一个File类,我们可以使用File类对文件和文件夹进行操作
 *     我们可以使用File类的方法
 *         创建一个文件/文件夹
 *         删除文件/文件夹
 *         获取文件/文件夹
 *         判断文件/文件夹是否存在
 *         对文件夹进行遍历
 *         获取文件的大小
 *     File类是一个与系统无关的类,任何的操作系统都可以使用这个类中的方法
 *
 *     重点:记住这三个单词
 *         file:文件
 *         directory:文件夹/目录
 *         path:路径
 */
public class FileTest {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        //路径分隔符 windows:分号;  Mac和linux:冒号:
        System.out.println(pathSeparator);



        // 文件名称分隔符 windows:反斜杠\  Mac和linux:正斜杠/
        String separator = File.separator;
        System.out.println(separator);
    }
}
