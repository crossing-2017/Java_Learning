package chapter8.maps;

import java.util.HashMap;
import java.util.Set;

/**
 * Map遍历第二种方式
 * @author Crossing
 * @date 2019-03-15
 */
public class MapIteratorTest2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zhangsan", "123");
        map.put("lisi", "456");
        map.put("wangwu", "234");
        map.put("zhaoliu", "678");
        Set<String> keys = map.keySet();
        for (String key :
                keys) {
            String value = map.get(key);

            System.out.println(key + "=" + value);
        }
    }
}
