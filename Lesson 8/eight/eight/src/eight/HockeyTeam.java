package eight;

import java.util.ArrayList;
import java.util.Collections;

public class HockeyTeam {
    private ArrayList<HockeyPlayer> players;

    public HockeyTeam() {
        players = new ArrayList<HockeyPlayer>();
        players.add(new HockeyPlayer(500, 1965, 11000000.00, "lemieux"));
        players.add(new HockeyPlayer(894, 1960, 10000000.00, "gretzky"));
        players.add(new HockeyPlayer(400, 1990, 8000000.00,  "crosby"));
        players.add(new HockeyPlayer(398, 1998, 7000000.00,  "mcdavid"));
        players.add(new HockeyPlayer(0,   1950, 2000000.00,  "goaltender"));
        System.out.println(players);
        Collections.sort(players);
        System.out.println(players);
    }
}