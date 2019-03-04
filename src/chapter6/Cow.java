package chapter6;

/**
 * 测试内部类
 * @author Crossing
 * @date 2019-03-04
 */
public class Cow {
    private double weight;

    public Cow(){};

    public Cow(double weight){
        this.weight = weight;
    }

    private class CowLeg{
        private double length;
        private String color;

        public CowLeg(){}

        public CowLeg(double length, String color){
            this.length = length;
            this.color = color;
        }


        public double getLength(){
            return length;
        }

        public void setLength(double length){
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }


        public void info(){
            System.out.println("体重 = " + weight + ", 腿长 = " + length + ", 颜色 = " + color);
        }


    }


    public void test(double length, String color){
        CowLeg cowLeg = new CowLeg(length, color);
        cowLeg.info();
    }


    public static void main(String[] args) {
        Cow cow = new Cow(345);
        cow.test(23, "红色");
    }

}
