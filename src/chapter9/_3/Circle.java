package chapter9._3;

import java.awt.*;

/**
 * 继承抽象父类
 * @author Crossing
 * @date 2019-03-10
 */
public class Circle extends Shape{
    @Override
    public void draw(Canvas c) {
        System.out.println("在画布" + c + "画一个圆");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        //circle.draw();
    }
}
