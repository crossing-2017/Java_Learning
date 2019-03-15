package chapter8.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map遍历第三种方式,使用Entry对象来遍历Map
 * @author Crossing
 * @date 2019-03-15
 */
public class MapIteratorTest3 {
    public static void main(String[] args) {
        //创建Map集合
        HashMap<String, String> map = new HashMap<>();
        map.put("zhangsan", "123");
        map.put("lisi", "456");
        map.put("wangwu", "234");
        map.put("zhaoliu", "678");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry :
                entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
