package chapter7._2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * 此类是用来调用系统功能的一些方法
 * @author Crossing
 * @date 2019-03-06
 */
public class SystemTest {
    public static void main(String[] args) throws Exception{
        //获取系统的所有环境变量
        Map<String, String > env = System.getenv();
        for (String name :
                env.keySet()) {
            System.out.println(name + "-->" + env.get(name));
        }

        //获取指定环境变量
        System.out.println(System.getenv("HOME"));

        //获取所有的系统属性
        Properties properties = System.getProperties();
        //将所有的系统属性保存到props.txt文件中
        properties.store(new FileOutputStream("props.txt"), "System.props");

        //获取指定饿的系统属性
        System.out.println(System.getProperty("os.name"));
    }
}
