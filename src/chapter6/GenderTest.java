package chapter6;

/**
 *  男女性别枚举的实例化
 * @author Crossing
 * @date 2019-03-05
 */
public class GenderTest {

    public static void main(String[] args) {
        Gender female = Enum.valueOf(Gender.class, "FEMALE");
        female.name = "女性";
        System.out.println(female.toString() + " 是 " + female.name);
    }
}
