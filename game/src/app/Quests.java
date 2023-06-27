package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Quests {
    ArrayList<Quest> list = new ArrayList<>();
    //this class provides the missions of the game

    public void cityMission(Maxwell maxwel){
        int cc = maxwel.getCurrentCity();
        int mCoins = maxwel.getAmountCoins();
        int mJewel = maxwel.getPowerthreshold();
        for(int i = 0; i < 3; i++){
            boolean bool = allFalse();

            if(bool == true && cc == list.get(i).getOriginCity() && list.get(i).isComplete() == false){
                
                System.out.println("MISSÃO:");
                System.out.println(list.get(i).getMission());
                System.out.println("Prêmio por aceitar MISSÃO:");
                System.out.println(list.get(i).getRewardForAcceptingMission());
                int x = accept();
                if(x == 1){
                    CJ cj= list.get(i).acceptMission();
                    maxwel.setAmountCoins(mCoins + cj.getCoin());
                    maxwel.setPowerthreshold(mJewel + cj.getJewelThreshold());
                }
            }
            if(cc == list.get(i).getDestinationCity() && list.get(i).isComplete() == false && list.get(i).isAccepted() == true){

                System.out.println("Prêmio por terminar a missão");
                //return CJ of question
                CJ cj = list.get(i).getReward();
                list.get(i).setComplete(true);
                list.get(i).setAccepted(false);
                maxwel.setAmountCoins(mCoins + cj.getCoin());
                maxwel.setPowerthreshold(mJewel + cj.getJewelThreshold());
            }
        }
    }

    public void cancel(Maxwell maxwel){
        for(int i = 0; i < 3; i++){
            if(list.get(i).isAccepted() == true){
                list.get(i).setAccepted(false);
                int mCoins = maxwel.getAmountCoins();
                int mJewel = maxwel.getPowerthreshold();
                CJ cj = list.get(i).cancelMission();
                maxwel.setAmountCoins(mCoins + cj.getCoin());
                maxwel.setPowerthreshold(mJewel + cj.getJewelThreshold());
            }
        }
    }
    public void showQuest(Maxwell maxwel){
            for(int i = 0; i < 3; i++){
                if(list.get(i).isAccepted() == true){
                    System.out.println(list.get(i).getMission());
                    System.out.println("Quer cancelar a MISSÃO?");
                    int x = accept();
                    if(x == 1){
                        cancel(maxwel);
                        System.out.println("Missão cancelada.");
                    }
                }
            }
    }

    public int accept(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Aceitar: s/n");
        String string = scn.nextLine();
        if(string.equals("s")){
            return 1;
        }else if(string.equals("n")){
            return 0;
        }
        accept();
        return 0;
    }

    public boolean allFalse(){
        if(list.get(0).isAccepted()==false && list.get(1).isAccepted()==false && list.get(2).isAccepted()==false){
            return true;
        }
        return false;
    }
    
    public Quests(){
        this.list.add(0, new Quest(new CJ(4, 0), new CJ(2, 2), 8, 4, "Vá até a cidade de Grand Duchy of Smalia e receba as luvas do poder"));
        this.list.add(1, new Quest(new CJ(6, 0), new CJ(3, 1), 12, 10, "Vá até a cidade de Principality of kasya e receba as botas do poder"));
        this.list.add(2, new Quest(new CJ(1, 0), new CJ(10, -4), 9, 0, "Vá até Ubud e receba a Glória dos Retornados"));
    }
    @Override
    public String toString() {
        return "Quests [list=" + list + "]";
    }
    
}
