package chapter11.recursion;

/**
 * 用递归计算n!
 * @author Crossing
 * @date 2019-03-19
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        System.out.println(jc(10));
    }

    private static int jc(int n) {
        if(n == 1 ){
            return 1;
        }
        return  n * jc(n - 1);
    }
}
