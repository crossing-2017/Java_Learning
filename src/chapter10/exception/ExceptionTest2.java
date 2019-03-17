package chapter10.exception;

/**
 * 异常产生过程解析
 * @author Crossing
 * @date 2019-03-17
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int element = getElement(array, 2);
        System.out.println(element );

    }


    public static int getElement(int[] array , int index){
        return array[index];
    }
}
