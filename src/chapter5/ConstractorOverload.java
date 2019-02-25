package chapter5;

import java.util.SortedMap;

/**
 * @author Crossing
 * @date 2019-02-25
 */
public class ConstractorOverload {
    public int age;
    public String name;

    public ConstractorOverload(int age){
        this.age = age;
    }

    /**
     * d当有多个构造器并且含有相同形参时，可以这样调用另一个构造器
     * @param age
     * @param name
     */
    public ConstractorOverload(int age, String name){
        this(age);
        this.name = name;
    }


    public static void main(String[] args) {
        ConstractorOverload overload = new ConstractorOverload(12);
        ConstractorOverload overload1 = new ConstractorOverload(12, "Crossing");

        System.out.println(overload.age + " " + overload.name);
        System.out.println(overload1.age + " " + overload1.name);
    }
}
