package chapter10.exception;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 实现自定义异常测试
 * @author Crossing
 * @date 2019-03-18
 */
public class RegisterExceptionTest {


    static ArrayList<String> userNames = new ArrayList<>();



    public static void checkName(String name){
        for (String username :
                userNames) {
            if (name.equals(username)){
                try {
                    throw new RegisterException("用户名已存在");
                } catch (RegisterException e) {
                    System.out.println(e);
                    return;
                }
            }

        }
        userNames.add(name);
        System.out.println("恭喜你，用户名添加成功");
    }

    public static void main(String[] args) {
        System.out.println("请输入用户名");

        userNames.add("张三");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        checkName(next);

    }
}
