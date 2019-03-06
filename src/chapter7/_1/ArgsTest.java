package chapter7._1;

/**
 * 对main方法的分析
 * @author Crossing
 * @date 2019-03-06
 */
public class ArgsTest {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String arg :
                args) {
            System.out.println(arg);
        }
    }
}
