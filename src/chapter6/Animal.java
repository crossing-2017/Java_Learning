package chapter6;

/**
 * @author Crossing
 * @date 2019-02-28
 * @return 测试不可变类
 */
public class Animal {
    private final Name name;
    public Animal(Name name){
        //this.name = name;
        //修改后，无论Name类怎么设置，还是初试的变量值
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName() {
        //return name;
        // 这里的巧妙之处在于无论接下来setName会怎么写，总是返回一开始的哪个name
        return new Name(name.getFirstName(), name.getLastName());
    }

    public static void main(String[] args) {
        Name name = new Name("zhangsan", "lisi");
        Animal animal = new Animal(name);
        //按照注释的语句修改，这里的set就不起作用了
        animal.getName().setFirstName("wangwu");
        System.out.println(name.getFirstName());
    }
}

class Name{
    public String firstName;
    public String lastName;
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}