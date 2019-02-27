package chapter6;

/**
 * @author Crossing
 * @date 2019-02-27
 */
public class PrintObject {
    public static void main(String[] args) {
        Person person = new Person("zhangsan");
        System.out.println(person.toString());
    }
}


class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }
}