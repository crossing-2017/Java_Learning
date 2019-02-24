package chapter5;

/**
 * @author Crossing
 * @date 2019-02-24
 */
public class ReferenceTransferTest {

    /**
     * 含有static方法的方法只能调用static方法，所以这里要加static
     */
    public static void swap(DataWrap dp){
        int temp;
        temp = dp.a;
        dp.a = dp.b;
        dp.b = temp;
        System.out.println("a = " + dp.a + ", b = " + dp.b);
        dp = null;
    }

    public static void main(String[] args){
        DataWrap dp = new DataWrap();
        dp.a = 8;
        dp.b = 4;
        System.out.println("a = " + dp.a + ", b = " + dp.b);
        swap(dp);
        System.out.println("a = " + dp.a + ", b = " + dp.b);
    }
}


class DataWrap{
    int a;
    int b;
}