package chapter7._3;

/**
 * 简单实现clone接口的功能
 * @author Crossing
 * @date 2019-03-06
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(20);

        User user2 = user1.clone();

        //false
        System.out.println(user1.equals(user2));
        //true
        System.out.println(user1.address == user2.address);

        String j1 = new String("java");
        String j2 = new String("java");
        System.out.println(j1.equals(j2));
    }
}


class Address{
    String detail;
    public Address(String detail){
        this.detail = detail;
    }
}


class User implements Cloneable{
    int age;
    Address address;


    public User(int age){
        this.age = age;
        address = new Address("北航");
    }

    //调用super.clone()来实现clone方法
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}