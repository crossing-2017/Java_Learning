package chapter5;

/**
 * @author Crossing
 * @date 2019-02-24
 */
public class PersonTest {
    public static void main(String[] args) {
        System.out.println(Person.eyeNums);
        Person person = new Person();
        person.age = 12;
        //不应该用实例调用类中的静态变量
        //person.eyeNums = 2;
    }
}

class Person{
    public int age;
    public static int eyeNums;
}