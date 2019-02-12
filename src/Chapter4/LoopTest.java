package Chapter4;

public class LoopTest {
    public static void main(String [] args){
        int count1 = 0, count2 = 0, count3 = 0;
        // do-while循环语句
        do {
            System.out.println(count1);
            count1++;
        }while (count1 < 10);

        //while循环语句
        while(count2 < 10){
            System.out.println(count2);
            count2++;
        }

        //for循环语句
        for(;count3 < 10; count3++){
            System.out.println(count3);
        }
        System.out.println("循环结束！");
    }
}
