package app;

import java.util.Scanner;

public class Merchant {
    //talks of the merchant
    //the merchant will need have in the parameters the coins of Maxwel
    public CJ talk(int coin){

        System.out.println("Deseja trocar suas moedas por limiar da joia?");//get the anwser of player
        int trade = trade();
        
        Tree tree = new Tree();
        CJ cj = tree.TreeMap(new CDT(coin, 1, trade));
        return cj;
    }
    public int trade(){
        Scanner scn = new Scanner(System.in);
        String anwser = scn.nextLine();
        if(anwser.equals("s")){
            scn.close();
            return 1;
        }else if(anwser.equals("n")){
            scn.close();
            return 0;
        }else{
            trade();
        }
        scn.close();
        return 0;
    }
}
