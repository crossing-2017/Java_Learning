package chapter11.recursion;

import java.io.File;

/**
 * 递归打印多级文件夹
 * @author Crossing
 * @date 2019-03-19
 */
public class RecursionTest3 {
    public static void main(String[] args) {
        File file = new File("src/chapter11/file");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()) {
                getAllFile(file);
            }
            System.out.println(file);
        }
    }
}
