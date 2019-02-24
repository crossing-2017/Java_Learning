package Chapter5;

/**
 * @author Crossing
 * @date 2019/02/24
 */
public class ReturnThisTest {
    public int age;

    public ReturnThisTest grow(){
        age++;
        //返回调用该方法的对象
        return this;
    }
    public static void main(String[] args){
        ReturnThisTest rt = new ReturnThisTest();
        rt.grow().grow().grow();
        System.out.println(rt.age);

    }
}
