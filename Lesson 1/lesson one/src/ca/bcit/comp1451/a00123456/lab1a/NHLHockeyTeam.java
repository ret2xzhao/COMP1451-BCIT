package ca.bcit.comp1451.a00123456.lab1a;

import java.util.ArrayList;
import java.util.Iterator;

public class NHLHockeyTeam {
    private ArrayList<HockeyPlayer> players;

    public NHLHockeyTeam() {
        players = new ArrayList<>();

        players.add(new HockeyPlayer("gretzky", 99, 92));
        players.add(new HockeyPlayer("pettersson", 40, 51));
        players.add(null);
        players.add(new HockeyPlayer("crosby", 97, 50));
        players.add(new HockeyPlayer("sedin", 33, 48));
        players.add(new HockeyPlayer("markstrom", 1, 0));
    }

    public void listAllNHLPLayers(){
        Iterator<HockeyPlayer> it = players.iterator();
        while(it.hasNext()){
            HockeyPlayer player = it.next();
                if(player != null){
                    System.out.println(player.getLastName() + " #" + player.getJerseyNumber() + 
                                       " scored " + player.getNumberOfGoals() + " goals!");
                }
        }
    }
}
