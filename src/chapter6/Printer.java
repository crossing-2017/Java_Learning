package chapter6;

/**
 * 对多个接口的实现测试
 * @author Crossing
 * @date 2019-03-02
 */
public class Printer implements Output, Product{

    private String[] printData = new String[MAX_CACHE_LINE];
    private int dataNum = 0;


    @Override
    public void out() {
        while (dataNum > 0){
            System.out.println("打印机打印：" + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if(dataNum >= MAX_CACHE_LINE){
            System.out.println("输出队列已满，添加失败");
        }else {
            System.out.println(msg);
        }
    }

    @Override
    public int getProductTime() {
        return 45;
    }

    public static void main(String[] args) {
        Output op = new Printer();

        op.getData("java");
    }
}
