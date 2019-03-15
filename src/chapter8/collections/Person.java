package chapter8.collections;

import java.util.Objects;

/**
 *  创建类，用来测试Collections的sort方法，如果是引用类型的话，则要继承Comparable接口，调用里面的compareTo的方法
 * @author Crossing
 * @date 2019-03-15
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * this-参数为升序
     * @param o
     * @return
     */
    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }
}
