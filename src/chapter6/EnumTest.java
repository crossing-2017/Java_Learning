package chapter6;

/**
 * 枚举类实现调用测试
 * @author Crossing
 * @date 2019-03-05
 */
public class EnumTest {

    public void jadge(SeasonEnumTest s){
        switch (s){
            case SPRING:
                System.out.println("春暖花开");
                break;
            case SUMMER:
                System.out.println("潮湿炎热");
                break;
            case FALL:
                System.out.println("秋高气爽");
                break;
            case WINTER:
                System.out.println("寒风凛冽");
                break;
        }
    }

    public static void main(String[] args) {
        for (SeasonEnumTest s :
                SeasonEnumTest.values()) {
            System.out.println(s);
        }
        new EnumTest().jadge(SeasonEnumTest.SPRING);
    }
}
