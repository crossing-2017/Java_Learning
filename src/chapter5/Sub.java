package chapter5;

/**
 * @author Crossing
 * @date 2019-02-25
 */
public class Sub extends Base{
    public String name;
    public Sub(double size, String color, String name) {
        super(size, color);
        this.name = name;
    }

    public static void main(String[] args) {
        Sub sub = new Sub(23, "hongse", "zhangsan");
        System.out.println(sub.size + " " + sub.color + " " + sub.name);
    }
}

/**
 * 重载父类构造器
 */
class Base{
    public double size;
    public String color;

    public Base(double size, String color){
        this.size = size;
        this.color = color;
    }
}
