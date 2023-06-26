package app;

import java.util.Scanner;

public class Merchant {
    //talks of the merchant
    //the merchant will need have in the parameters the coins of Maxwel
    public void talk(){

        System.out.println("Quantas moedas de transporte você tem?");//get coins of Maxwel

        System.out.println("Deseja trocar suas moedas por limiar na joia?");//get the anwser of player
        int trade = trade();
        System.out.println("De onde você vem, e para onde você vai?");//get the TesteGraph code to choose the city
        

    }
    public int trade(){
        Scanner scn = new Scanner(System.in);
        String anwser = scn.nextLine();
        if(anwser.equals("s")){
            return 1;
        }else if(anwser.equals("n")){
            return 0;
        }else{
            trade();
        }
        return 0;
    }
}
