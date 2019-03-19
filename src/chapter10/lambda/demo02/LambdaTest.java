package chapter10.lambda.demo02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 测试有参有返回值的Lambda表达式
 * @author Crossing
 * @date 2019-03-19
 */
public class LambdaTest {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19)
        };

        //匿名内部类操作
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        //使用Lambda表达式,简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2) ->{
                return o1.getAge() - o2.getAge();

        });

        //优化省略Lambda
        Arrays.sort(arr, (o1, o2)->o1.getAge()-o2.getAge());

        //使用Comparator.comparingInt()方法近一步简化
        Arrays.sort(arr, Comparator.comparingInt(Person::getAge));

        for (Person p :
                arr) {
            System.out.println(p);
        }
    }
}
