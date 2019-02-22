package Chapter4;

public class ArrayTest {
    public static void main(String args[]){
        // 静态数组
        int[] a;
        a = new int[]{1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        for(int i=0 ; i< a.length ; i++) {
            System.out.println(a[i]);
        }


        //动态数组

        int[] c = new int[5];
        for(int i=0 ; i< c.length ; i++) {
            System.out.println(c[i]);
        }
    }
}
