package chapter6;

/**
 * @author Crossing
 * @date 2019-02-28
 * @return 测试toString方法
 */
public class ToStringTest {
    public static void main(String[] args) {
        Apple apple = new Apple(23.3, "红色");
        System.out.println(apple);
    }
}


class Apple{
    public double weight;
    public String color;

    public Apple(double weight, String color){
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString(){
        return "颜色是：" + color + ", 重量是：" + weight;
    }
}
