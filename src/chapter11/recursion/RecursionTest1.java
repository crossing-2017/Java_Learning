package chapter11.recursion;

/**
 * 用递归计算1...100的和
 * @author Crossing
 * @date 2019-03-19
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    public static int sum(int num){
        //如果不是1，继续调用方法
        if(num != 1) {
            return num + sum(num - 1);
        }
        //当为1时，就返回1
        return 1;
    }
}
