package ca.bcit.comp1451.a00123456.lab1a;

public class HockeyTeam {
    public static final int NUM_PLAYERS_PER_TEAM = 23;
    private HockeyPlayer[] players;

    public HockeyTeam() {
        players = new HockeyPlayer[NUM_PLAYERS_PER_TEAM];

        players[0]  = new HockeyPlayer("gretzky", 99, 92);
        players[14] = new HockeyPlayer("pettersson", 40, 51);
        players[11] = new HockeyPlayer("crosby", 97, 50);
        players[2]  = new HockeyPlayer("sedin", 33, 48);
        players[20] = new HockeyPlayer("markstrom", 1, 0);
    }

    public void displayAllPlayerInfo(){
        for(HockeyPlayer player: players){
            if(player != null){
                System.out.println(player.getLastName() + " #" + player.getJerseyNumber() + 
                                   " scored " + player.getNumberOfGoals() + " goals!");
            }
        }
    }
}
