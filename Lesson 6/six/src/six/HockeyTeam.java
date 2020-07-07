package six;

import java.util.ArrayList;
import java.util.List;

public class HockeyTeam
{
    public static void main(String[] args)
    {
        List<HockeyPlayer> players = new ArrayList<>();
        players.add(new HockeyPlayer("gretzky", 892, 1960));
        players.add(new HockeyPlayer("crosby", 500, 1980));
        players.add(new HockeyPlayer("sedin", 400, 1980));
        players.add(new HockeyPlayer("lemieux", 892, 1961));
        System.out.println(players.get(0).equals(players.get(3)));
        System.out.println(players.get(0).hashCode());
        System.out.println(players.get(0).toString());
        System.out.println(players.get(3).hashCode());
        System.out.println(players.get(3).toString());
    }
}