package chapter5;

public class ConstractorTest {
    int foo;

    public ConstractorTest(){
        int foo = 0;
        this.foo = 6;
    }

    public static void main(String[] args){
        System.out.println(new ConstractorTest().foo);
    }
}
