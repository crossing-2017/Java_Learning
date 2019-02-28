package chapter6;


import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

/**
 * @author Crossing
 * @date 2019-02-28
 * @return final关键字修饰引用类型
 */
public class FinalReferenceTest {
    public static void main(String[] args) {
        final int[] iArr = {2, 4,  6 , 3, 1, 8, 12};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = 34;
        System.out.println(Arrays.toString(iArr));

        final Person2 person2 = new Person2("zhangsan");
        person2.setName("lisi");
        System.out.println(person2.getName());
    }
}


class Person2{
    private String name;
    public Person2(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}