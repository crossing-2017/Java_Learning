package chapter11.buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


/**
 * 用缓存的方法对文本进行排序
 * @author Crossing
 * @date 2019-03-20
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/chapter11/buffer/in.txt"));
        HashMap<Integer, String> stringHashMap = new HashMap<>();
        ArrayList<Integer> index = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            String[] split = line.split("\\.");
            stringHashMap.put(Integer.parseInt(split[0]), split[1]);
            index.add(Integer.parseInt(split[0]));
        }

        Collections.sort(index);


        BufferedWriter bw = new BufferedWriter(new FileWriter("src/chapter11/buffer/out.txt"));

        for (int i = 0; i < index.size(); i++) {
            Integer integer = index.get(i);
            bw.write(index.get(i) + "." + stringHashMap.get(integer));
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
