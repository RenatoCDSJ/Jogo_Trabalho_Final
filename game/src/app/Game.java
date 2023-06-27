package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {



    public void play(){
        Scanner scanner = new Scanner(System.in);
        Maxwell max = new Maxwell();
        boolean morreu = false; //se ficar true significa que foi de F
        Dialogues dialogues = new Dialogues();
        Graphtools gt = new Graphtools();
        Merchant merchant = new Merchant();
        Quests quests = new Quests();
        //System.out.println(quests.list.get(0));
        //loop
        //show the history
        //show the coins, jewel power and jewel threshold
        //show TesteGraph
        //show merchant
        //if the current city have a quest on the city show the quest
        dialogues.inicio();
        while(!morreu){
            dialogues.clearTerminal();
            max.getAll();
            System.out.println("======================");
            System.out.println("Selecione o que deseja fazer agora: \n");
            System.out.println("1- Ver Mapa");
            System.out.println("2- Ver Missão");
            System.out.println("3- Mudar de cidade");
            System.out.println("======================");
            System.out.println("Sua Escolha: ");
            try {
                int escolha = scanner.nextInt();
                if (escolha == 1) {
					dialogues.showMap();
                }else if(escolha == 2){
                    quests.showQuest(max); //ver missao
                }else if(escolha == 3){
                    gt.descocamento(max); //mudança de cidade
                    merchant.talk(max); //mercador
                    if(max.getAmountCoins() > 0 && max.getPowerJewl() < max.getPowerthreshold()){
                        quests.cityMission(max); //missão
                        dialogues.clearTerminal(); //limpar terminal
                        //olhar se a joia ta negativa e transformar em 0
                    }else{
                        System.out.println("Maxwell Morreu, fim de jogo");
                        morreu = true;
                    }
                    
                    
                }else {
                    System.out.println("Escolha inválida. Tente novamente.\n\n\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine(); 
            }
        }
        
    }
}
