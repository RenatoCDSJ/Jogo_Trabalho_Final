package app;

public class Game {
    public void play(){
        boolean vivo = true;
        Dialogues dialogues = new Dialogues();
        Quests quests = new Quests();
        //System.out.println(quests.list.get(0));
        //loop
        //show the history
        //show the coins, jewel power and jewel threshold
        //show TesteGraph
        //show merchant
        //if the current city have a quest on the city show the quest
        dialogues.inicio();
        while(!vivo){
            dialogues.clearTerminal();
            
        }
        
    }
}
