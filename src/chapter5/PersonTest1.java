package chapter5;

/**
 * @author Crossing
 * @date 2019-02-24
 */
public class PersonTest1 {
    public static void main(String[] args){
        Person1 p1 = new Person1();
        p1.setAge(12);
        p1.setName("zhangsan");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());

    }
}


class Person1{
    private int age;
    private String name;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}