package six;

public class HockeyPlayer
{
    private String lastName;
    private int    goalsScored;
    private int    yearBorn;

    /**
     * @param lastName
     * @param goalsScored
     */
    public HockeyPlayer(String lastName, int goalsScored, int yearBorn) {
        this.lastName = lastName;
        this.goalsScored = goalsScored;
        this.yearBorn = yearBorn;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the goalsScored
     */
    public int getGoalsScored() {
        return goalsScored;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "HockeyPlayer [lastName=" + lastName + ", goalsScored=" + goalsScored + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HockeyPlayer other = (HockeyPlayer) obj;
        if (this.lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!this.lastName.equals(other.lastName))
            return false;
        return true;
    }
}