/**
 *
 */
package ca.bcit.comp1451.a00123456.lab1a;

/**
 * @author jason
 * @version 1.0
 */
public class HockeyPlayer{
    private final String lastName;
    private int   jerseyNumber;
    private int   numberOfGoals;

    public static final int LOWEST_JERSEY_NUM = 0;
    public static final int HIGHEST_JERSEY_NUM = 99;

    public static final int MIN_GOALS = 0;
    public static final int MAX_GOALS = 92;

    /**
     * @param lastName the last name of the hockey player
     * @param jerseyNumber the number of the jersey of this hockey player
     * @param numberOfGoals the number of goals scored this year by this hockey player
     */
    public HockeyPlayer(final String lastName, final int jerseyNumber, final int numberOfGoals){
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("last name cannot be empty");
        }
        if(jerseyNumber < LOWEST_JERSEY_NUM || jerseyNumber > HIGHEST_JERSEY_NUM){
            throw new IllegalArgumentException("invalid jersey number; must be between " +
                                                LOWEST_JERSEY_NUM + " and " + HIGHEST_JERSEY_NUM);
        }
        if(numberOfGoals < MIN_GOALS || numberOfGoals > MAX_GOALS){
            throw new IllegalArgumentException("invalid # of goals; must be between " +
                                                MIN_GOALS + " and " + MAX_GOALS);
        }
        this.lastName      = lastName;
        this.jerseyNumber  = jerseyNumber;
        this.numberOfGoals = numberOfGoals;
}

    /**
     * @return the last Name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * @return the jersey Number
     */
    public int getJerseyNumber(){
        return jerseyNumber;
    }

    /**
     * @return the number of Goals
     */
    public int getNumberOfGoals(){
        return numberOfGoals;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(final int jerseyNumber){
        if(jerseyNumber < LOWEST_JERSEY_NUM || jerseyNumber > HIGHEST_JERSEY_NUM){
            throw new IllegalArgumentException("invalid jersey number; must be between " +
                                                LOWEST_JERSEY_NUM + " and " + HIGHEST_JERSEY_NUM);
        }
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * @param numberOfGoals the numberOfGoals to set
     */
    public void setNumberOfGoals(final int numberOfGoals){
        if(numberOfGoals < MIN_GOALS || numberOfGoals > MAX_GOALS){
            throw new IllegalArgumentException("invalid # of goals; must be between " +
                                                MIN_GOALS + " and " + MAX_GOALS);
        }
        this.numberOfGoals = numberOfGoals;
    }
}
