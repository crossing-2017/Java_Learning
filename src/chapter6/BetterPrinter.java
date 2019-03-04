package chapter6;

public class BetterPrinter implements Output {

    private String[] printData = new String[MAX_CACHE_LINE * 2];

    private int printNum = 0;
    @Override
    public void out() {
        while (printNum > 0 ){
            System.out.println("告诉打印机正在打印" + printData[0]);

            //把作业整体前进一位， 并将剩下的作业数减1
            System.arraycopy(printData, 1, printData, 0, --printNum);
        }
    }

    @Override
    public void getData(String msg) {
        if(printNum >= MAX_CACHE_LINE * 2){
            System.out.println("队列已满，添加失败");
        }else {
            printData[printNum++] = msg;
        }
    }
}
