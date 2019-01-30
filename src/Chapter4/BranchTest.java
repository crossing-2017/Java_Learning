package Chapter4;

public class BranchTest {
    public static void main(String[] args) {
        int score = 60;
        switch (score){
            case 60:
                System.out.println("及格");
                break;
            case 80:
                System.out.println("优秀");
                break;
            default:
                System.out.println("不及格");
        }
        //System.out.println(s);
    }
}
