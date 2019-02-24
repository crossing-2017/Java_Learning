package chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gobang {
    private static int BOARD_SIZE = 10;
    private String[][] board;

    //初始化棋盘
    public void initboard(){
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for (int i=0 ; i<BOARD_SIZE ; i++){
            for(int j=0 ; j<BOARD_SIZE ; j++){
                board[i][j] = "+ ";
            }
        }
    }

    //打印棋盘
    public void printBoard(){
        for (int i=0 ; i<BOARD_SIZE ; i++){
            for(int j=0 ; j<BOARD_SIZE ; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("\n");
        }
    }


    //主函数
    public static void main (String args[])throws Exception{
        Gobang gobang = new Gobang();
        gobang.initboard();
        gobang.printBoard();
        System.out.println("请输入你的下棋的坐标， 以x,y的格式：");
        //用于键盘输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null){
            String[] posStrArr = input.split(",");
            int xPos = Integer.parseInt(posStrArr[0]);
            int yPos = Integer.parseInt(posStrArr[1]);
            gobang.board[yPos - 1][xPos - 1] = "O ";
            gobang.printBoard();
            System.out.println("请输入你的下棋的坐标， 以x,y的格式：");
        }
    }
}
