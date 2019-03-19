package chapter11.recursion;

import java.io.File;

/**
 * 遍历多级文件夹，并输出其中的java文件
 * @author Crossing
 * @date 2019-03-19
 */
public class RecursionTest4 {
    public static void main(String[] args) {
        File file = new File("src/chapter11/file");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()) {
                getAllFile(file);
            }
            //将字符串全部转换为小写
            String name = file.getName().toLowerCase();
            if(name.endsWith(".java")) {
                System.out.println(file);
            }
        }
    }
}
