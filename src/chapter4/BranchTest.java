package chapter4;

public class BranchTest {
    public static void main(String[] args) {
        String score = "123";
        switch (score){
            case "123":
                System.out.println("及格");
                break;
            case "456":
                System.out.println("优秀");
                break;
            default:
                System.out.println("不及格");
        }
        //System.out.println(s);
    }
}
