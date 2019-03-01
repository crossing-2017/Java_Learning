package chapter6;

/**
 * 新建一个关于形状的抽象类，有抽象函数的一定是抽象类，但是抽象类中可以不含抽象方法
 * @author Crossing
 * @date 2019-02-28
 */
public abstract class Shape {
    {
        System.out.println("执行Shape的初始化块");
    }
    //定义一个形状的颜色
    private String color;
    //定义一个周长计算的抽象方法
    public abstract double calPerimeter();

    //定义一个返回形状的抽象方法
    public abstract String getType();


    public Shape(){};

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
