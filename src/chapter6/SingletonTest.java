package chapter6;

/**
 * @author Crossing
 * @date 2019-02-28
 * @return 单例类测试
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        //Singleton instance1 = Singleton.getInstance();
        //System.out.println(instance == instance1);
        System.out.println(instance);
    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
