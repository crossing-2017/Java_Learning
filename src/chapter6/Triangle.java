package chapter6;

/**
 * Shape的一个实现类
 * @author Crossing
 * @date 2019-02-28
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSide(a, b, c);
    }

    public void setSide(double a, double b, double c){
        if(a >= b + c || b >= a + c || c >= a + b){
            System.out.println("三角形的第三边大于其他两边之和");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return "三角形";
    }

    public static void main(String[] args) {

    }
}
