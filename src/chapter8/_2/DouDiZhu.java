package chapter8._2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 一个斗地主的小游戏用集合实现
 * @author Crossing
 * @date 2019-03-14
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> pokers = new ArrayList<>();
        //先把大王和小王存储到poker集合中
        pokers.add("大王");
        pokers.add("小王");
        //定义两个数组,一个数组存储牌的花色,一个数组存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};


        //循环嵌套遍历两个数组,组装52张牌
        for (String color :
                colors) {
            for (String number :
                    numbers) {
                pokers.add(color + number);
            }
        }

        /*
            2.洗牌
            使用集合的工具类Collections中的方法
            static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
         */
        Collections.shuffle(pokers);


        /*
            3.发牌
         */
        //定义4个集合,存储玩家的牌和底牌
        ArrayList<String> diPai = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();


        for (int i = 0; i < pokers.size(); i++) {
            String p = pokers.get(i);
            if(i >= 51){
                diPai.add(p);
            }else if(i % 3 == 0){
                player1.add(p);
            }else if(i % 3 == 1){
                player2.add(p);
            }else if(i % 3 == 2){
                player3.add(p);
            }

        }


        //4.看牌
        System.out.println("刘德华:"+player1);
        System.out.println("周润发:"+player2);
        System.out.println("周星驰:"+player3);
        System.out.println("底牌:"+diPai);
    }

}
