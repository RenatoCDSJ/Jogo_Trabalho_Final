package app;

import java.util.Scanner;

public class Merchant {
    //talks of the merchant
    //the merchant will need have in the parameters the coins of Maxwel
    public void talk(Maxwell maxwel){

        System.out.println("Deseja trocar suas moedas por limiar da joia?");//get the anwser of player
        int trade = trade();
        
        Tree tree = new Tree();
        CJ cj = tree.TreeMap(new CDT(maxwel.getAmountCoins(), 1, trade));
        int mCoins = maxwel.getAmountCoins();
        int mJewel = maxwel.getPowerthreshold();
        maxwel.setAmountCoins(mCoins + cj.getCoin());
        maxwel.setPowerthreshold(mJewel + cj.getJewelThreshold());
    }
    public int trade(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Aceitar: s/n");
        String string = scn.nextLine();
        if(string.equals("s")){
            return 1;
        }else if(string.equals("n")){
            return 0;
        }
        trade();
        return 0;
    }
}
