package chapter8._3;

/**
 * 测试可变参数类
 * @author Crossing
 * @date 2019-03-15
 */
public class Varargs {


    private static int multi(int... nums){
        int sum =0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(multi(1, 2, 3));

    }
}



