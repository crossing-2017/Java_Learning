package chapter5;

/**
 * @author Crossing
 * @date 2019-02-24
 */
public class Recursive {
    public static int function(int x){
        if(x == 0){
            return 1;
        }else if(x == 1){
            return 4;
        }else {
            return 2 * function(x - 1) + function( x - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(function(10));
    }
}
