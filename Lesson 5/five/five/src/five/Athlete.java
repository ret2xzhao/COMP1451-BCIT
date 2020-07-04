package five;

public class Athlete extends Human
{
    private String firstName;
    private String lastName;
    private int    yearBorn;
    private String teamName;
    private String sport;

    /**
     * @param firstName
     * @param lastName
     * @param yearBorn
     * @param teamName
     * @param sport
     */
    public Athlete(String firstName, String lastName, int yearBorn, String teamName, String sport)
    {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.yearBorn  = yearBorn;
        this.teamName  = teamName;
        this.sport     = sport;
    }

    public Athlete(double weightKg)
    {

    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the yearBorn
     */
    public int getYearBorn() {
        return yearBorn;
    }

    /**
     * @param yearBorn the yearBorn to set
     */
    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(String sport) {
        this.sport = sport;
    }	
}