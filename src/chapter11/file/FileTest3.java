package chapter11.file;

import java.io.File;
import java.io.IOException;

/**
 * 关于File类中的增删文件和文件夹的方法
 * @author Crossing
 * @date 2019-03-19
 *
 *
 * File类创建删除功能的方法
 *         - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *         - public boolean delete() ：删除由此File表示的文件或目录。
 *         - public boolean mkdir() ：创建由此File表示的目录。
 *         - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class FileTest3 {
    public static void main(String[] args) {
        show03();
    }

    private static void show03() {
        //123文件夹中有文件所以这里delete会错误
        File file = new File("src/chapter11/file/123");
        boolean delete = file.delete();
        /*false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false*/
        System.out.println(delete);     //true
    }


    /**
     * Mac下用相对路径添加文件夹
     *
     * public boolean mkdir() ：创建单级空文件夹
     *        public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
     *        创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
     *         返回值:布尔值
     *             true:文件夹不存在,创建文件夹,返回true
     *             false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
     *         注意:
     *             1.此方法只能创建文件夹,不能创建文件
     */
    private static void show02() {
        File file = new File("src/chapter11/file/123");

        File file1 = new File("src/chapter11/file/234/345");

        System.out.println(file.mkdir());
        System.out.println(file1.mkdirs());
    }

    /**
     * Mac下用相对路径添加文件
     *
     *
     *  public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     *         创建文件的路径和名称在构造方法中给出(构造方法的参数)
     *         返回值:布尔值
     *             true:文件不存在,创建文件,返回true
     *             false:文件存在,不会创建,返回false
     *         注意:
     *             1.此方法只能创建文件,不能创建文件夹
     *             2.创建文件的路径必须存在,否则会抛出异常
     *
     *         public boolean createNewFile() throws IOException
     *         createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
     */
    private static void show01() {

        //Mac下相对路径添加文件
        File file = new File("src/chapter11/file/b.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
