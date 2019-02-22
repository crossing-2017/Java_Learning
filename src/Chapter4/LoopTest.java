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

        //break跳出外层循环
        //outer作为标示符
        outer:
        for(int i=0 ; i<10 ; i++){
            for(int j=0 ; j<10 ; j++){
                System.out.println("i的值是：" + i + " j的值是：" + j);
                if(j==1){
                    //跳出外层循环
                    break outer;
                }
            }
        }

        //continue跳出外层循环
        outer:
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                if(j==1){
                    //跳出外层循环
                     continue outer;
                }
                System.out.println("i的值是：" + i + " j的值是：" + j);
            }
        }
        System.out.println("循环结束！");
    }
}
