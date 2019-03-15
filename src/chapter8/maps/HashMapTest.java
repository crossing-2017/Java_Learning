package chapter8.maps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 统计输入文本中对应字符的个数测试
 * @author Crossing
 * @date 2019-03-15
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String next = scanner.next();
        char[] chars = next.toCharArray();
        int value=0;
        for (char key : chars) {
            if(map.get(key)!= null){
                value++;
                map.put(key, value);
            }else {
                map.put(key, 1);
            }
        }

        System.out.println(map);
    }
}
