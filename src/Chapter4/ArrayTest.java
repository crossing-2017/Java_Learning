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

        //foreach循环的表示方法
        for (int array :
                a) {
            System.out.println(array);
        }


        //动态数组

        int[] c = new int[5];
        for(int i=0 ; i< c.length ; i++) {
            System.out.println(c[i]);
        }

        Person[] p = new Person[2];
        Person s1 = new Person();
        s1.age = 12;
        s1.height = 180.2;
        Person s2 = new Person();
        s2.height =120;
        s2.age = 23;
        p[0] = s1;
        p[1] = s2;
        p[0].info();
        p[1].info();


        //二维数组
        int[][] d = new int[4][];
        for (int[] indexs :
                d) {
            indexs = new int[2];
            for (int index:
                 indexs) {
                index = 3;
                System.out.println(index);
            }
        }

        String[][] s = new String[][]{new String[3], {"Hello"}};


    }
}


class Person{
    public int age;
    public double height;
    public void info(){
        System.out.println("年龄是：" + age + ", 身高是：" + height);
    }
}