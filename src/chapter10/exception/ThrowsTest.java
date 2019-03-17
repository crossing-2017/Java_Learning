package chapter10.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的第一种方式
 * @author Crossing
 * @date 2019-03-17
 */
public class ThrowsTest {

    public static void readFile(String fileName)throws IOException{
        if(!"123".equals(fileName)){
            throw new FileNotFoundException("发现的文件不是所要的文件名");
        }
        if(!fileName.endsWith("3")){
            throw new IOException("文件不是以3结尾的");
        }
    }

    public static void main(String[] args) throws IOException {
        readFile("123 ");
    }
}
