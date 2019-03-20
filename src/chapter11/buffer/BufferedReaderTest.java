package chapter11.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 关于BufferedReader的学习
 * @author Crossing
 * @date 2019-03-20
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("src/chapter11/buffer/a.txt");
        BufferedReader br = new BufferedReader(fr);

        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        br.close();
    }
}
