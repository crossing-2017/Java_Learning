package chapter8.maps;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 测试Map的基本方法
 * @author Crossing
 * @date 2019-03-15
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        String ele1 = map.put("zhangsan", "123");
        System.out.println(ele1);
        String ele2 = map.put("zhangsan", "456");
        System.out.println(ele2);
        System.out.println(map);
        map.put("lisi", "456");
        map.put("wangwu", "234");
        map.put("zhaoliu", "678");
        System.out.println(map);
        map.remove("lisi");
        System.out.println(map);
        System.out.println(map.get("zhangsan"));

    }
}
