package app;

import java.util.ArrayList;

public class Quests {
    //this class provides the missions of the game
    ArrayList<Quest> quests = new ArrayList<>();
    //chose the quest
    public Quest quest(int i){
        quests.add(0, new Quest(new CJ(4, 0), new CJ(2, 2), 8, 4, "Vá até a cidade de Grand Duchy of Smalia e receba as luvas do poder"));
        quests.add(1, new Quest(new CJ(6, 0), new CJ(3, 1), 12, 10, "Vá até a cidade de Principality of kasya e receba as botas do poder"));
        quests.add(2, new Quest(new CJ(1, 0), new CJ(10, -4), 9, 0, "Vá até Ubud e receba a Glória dos Retornados"));
        return quests.get(i);
    }
}
