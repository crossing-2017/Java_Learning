public class Test {
    public static void main(String [] args){
        String str1 = "123";
        short s = 2;
        s = (short) (s + 1) ;
        int a = Integer.parseInt(str1);
        System.out.println(a);
        System.out.println(Float.POSITIVE_INFINITY == 5/0.0);

        double d = 3.2;
        double d1 = Math.pow(d, 5);
        double v = Math.random();
        double cos = Math.cos(d);
        System.out.println(d1);
        System.out.println(v);
        System.out.println(cos);
        int a1 = -4;
        System.out.println(a1>>2);      //算术右移
        System.out.println(a1>>>2);     //逻辑右移
    }
}


