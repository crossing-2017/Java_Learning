package chapter11.file;

import java.io.File;

/**
 * 对File类中常用的方法测试
 * @author Crossing
 * @date 2019-03-19
 */
public class FileTest1 {
    public static void main(String[] args) {
        show1();
        show();
        show2();
    }


    /**
     * public long length()  ：返回由此File表示的文件的长度。
     * 获取的是构造方法指定的文件的大小,以字节为单位
     * 注意:
     *     文件夹是没有大小概念的,不能获取文件夹的大小
     *     如果构造方法中给出的路径不存在,那么length方法返回0
     */
    private static void show2() {
        File file = new File("props.txt");
        System.out.println(file.length());
    }

    /**
     * public String getName()  ：返回由此File表示的文件或目录的名称。
     * 获取的就是构造方法传递路径的结尾部分(文件/文件夹)
     */
    private static void show1() {
        File file = new File("/Users/crossing/GitHub/Java_Learning/src/chapter11/file/demo01/FileTest.java");

        //public String getName()  ：返回由此File表示的文件或目录的名称。
        System.out.println(file.getName());     // FileTest.java
    }

    /**
     * public String getAbsolutePath() ：返回此File的绝对路径名字符串。
     * 获取的构造方法中传递的路径
     * 无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
     */
    private static void show() {
        File file = new File("chapter11.file.FileTest");

        //public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        System.out.println(file.getAbsoluteFile());     // /Users/crossing/GitHub/Java_Learning/chapter11.file.FileTest
    }
}
