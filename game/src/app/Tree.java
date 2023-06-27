package app;

import java.util.ArrayList;
import java.util.TreeMap;

public class Tree {
    //this class contains functions that use CDT(CoinDistanceTrade) and return CJ(CoinJewelthreshold)

    public CJ TreeMap(CDT cdt){
        TreeMap<Integer, Integer> choices = new TreeMap<>();
        //coins
        choices.put(20, 5);
        //distance
        choices.put(10, 3);
        choices.put(30, 3);
        //trade
        choices.put(5, 1);
        choices.put(15, 1);
        choices.put(25, 1);
        choices.put(35, 1);
        //reward
        choices.put(4, 0);
        choices.put(6, 1);
        choices.put(14, 2);
        choices.put(16, 3);
        choices.put(24, 4);
        choices.put(26, 5);
        choices.put(34, 6);
        choices.put(36, 7);
        
        //key's TreeMap
        Integer key = 20;
        //System.out.println("key: "+ key);
        //System.out.println("Choice key: "+ choices.get(key));
        key = coin(key, cdt.getCoin(), choices.get(key));
        //System.out.println("key: "+ key);
        //System.out.println("Choice key: "+ choices.get(key));
        key = distance(key, cdt.getDistance(), choices.get(key));
        //System.out.println("key: "+ key);
        //System.out.println("Choice key: "+ choices.get(key));
        key = trade(key, cdt.getTrade(), choices.get(key));
        //System.out.println("key: "+ key);
        //System.out.println("Choice key: "+ choices.get(key));
        CJ cj =reward(choices.get(key));
        System.out.println(reward(choices.get(key)));
        return cj;
    }

    private static Integer coin(Integer key, Integer coins, Integer coinsChoice){
        //checks if the coin's Maxwell is greter or less than 5, changes the key and returns
        if(coins < coinsChoice){
            return key - 10;
        }else{
            return key + 10;
        }
    }

    private static Integer distance(Integer key, Integer distance, Integer distanceChoice){
        //checks if the city distance is greter or less than 3, changes the key and returns
        if(distance < distanceChoice){
            return key - 5;
        }else{
            return key + 5;
        }
    }

    private static Integer trade(Integer key, Integer trade, Integer tradeChoice){
        //checks if the Maxwell trade is equal or diferent from the value 0 or 1
        if(trade == tradeChoice){
            return key - 1;
        }else{
            return key + 1;
        }
    }

    private static CJ reward(Integer i){
        ArrayList<CJ> reward = new ArrayList<>();
        reward.add(0, new CJ(-1, 1));
        reward.add(1, new CJ(2, 0));//Trocado coin com a "esta"
        reward.add(2, new CJ(-1, 2));
        reward.add(3, new CJ(-1, 0));//"esta"
        reward.add(4, new CJ(-3, 2));
        reward.add(5, new CJ(-2, 0));
        reward.add(6, new CJ(-1, 3));
        reward.add(7, new CJ(-3, 0));
        return reward.get(i);
    }
    
}
