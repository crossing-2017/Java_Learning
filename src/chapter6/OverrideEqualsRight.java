package chapter6;

/**
 * @author Crossing
 * @date 2019-02-28
 * @return 重写equals方法
 */
public class OverrideEqualsRight {
    public static void main(String[] args) {
        Person1 person1 = new Person1("孙悟空", "123456789");
        Person1 person2 = new Person1("孙行者", "123456789");
        Person1 person3 = new Person1("孙悟饭", "234566");

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

    }
}


class Person1{
    public String name;
    String id;

    public Person1(){}

    public Person1(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj != null && (obj.getClass() == Person1.class)){
            Person1 person1 = (Person1) obj;
            return this.getId().equals(person1.getId());
        }
        return false;
    }
}

