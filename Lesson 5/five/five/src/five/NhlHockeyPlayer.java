package five;

public class NhlHockeyPlayer extends Athlete
{
    public NhlHockeyPlayer(String firstName, String lastName, int yearBorn, String teamName, String sport) 
    {
        super(firstName, lastName, yearBorn, teamName, sport);
    }

    public NhlHockeyPlayer()
    {
        super(200);
    }
}