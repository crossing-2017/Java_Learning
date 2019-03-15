package chapter8.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 有序版本的斗地主
 * @author Crossing
 * @date 2019-03-15
 */
public class DouDiZhuWithOrder {

  private static HashMap<Integer, String> pokers = new HashMap<>();


    public static void main(String[] args) {

        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //定义两个数组,一个数组存储牌的花色,一个数组存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        int index = 0;

        pokers.put(index, "大王");
        pokerIndex.add(index++);
        pokers.put(index, "小王");
        pokerIndex.add(index++);

        for (String color :
                colors) {
            for (String number :
                    numbers) {
                pokerIndex.add(index);
                pokers.put(index++, color + number);
            }
        }


        Collections.shuffle(pokerIndex);

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();


        for (int i = 0; i < pokerIndex.size(); i++) {
                if(i >= 51){
                    diPai.add(pokerIndex.get(i));
                }else if(i % 3 == 0){
                    player1.add(pokerIndex.get(i));
                }else if(i % 3 == 1){
                    player2.add(pokerIndex.get(i));
                }else if(i % 3 == 2){
                    player3.add(pokerIndex.get(i));
                }
        }

        System.out.println("刘德华:"+ getPoker(player1));
        System.out.println("周润发:"+ getPoker(player2));
        System.out.println("周星驰:"+ getPoker(player3));
        System.out.println("底牌:"+ getPoker(diPai));

    }


    static ArrayList<String> getPoker(ArrayList<Integer> indexs){
        Collections.sort(indexs);
        ArrayList<String> poker = new ArrayList<>();

        for (Integer index :
                indexs) {
            poker.add(pokers.get(index));
        }
        return poker;
    }
}


