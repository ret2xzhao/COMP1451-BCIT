package eight;

public class HockeyPlayer implements Comparable<HockeyPlayer> {
    private int numberOfGoals;
    private int yearBorn;
    private double annualSalaryUsd;
    private String lastName;

    public HockeyPlayer(int numberOfGoals, int yearBorn, double annualSalaryUsd, String lastName) {
        this.numberOfGoals = numberOfGoals;
        this.yearBorn = yearBorn;
        this.annualSalaryUsd = annualSalaryUsd;
        this.lastName = lastName;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public double getAnnualSalaryUsd() {
        return annualSalaryUsd;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(HockeyPlayer that) {
        // if this is > that, return + integer
        // if this is == to that, return 0
        // if this is < that, return - integer
        return (int)(this.annualSalaryUsd - that.annualSalaryUsd);
    }

    @Override
    public String toString() {
        return "HockeyPlayer [numberOfGoals=" + numberOfGoals + ", yearBorn=" + yearBorn + ", annualSalaryUsd="
               + annualSalaryUsd + ", lastName=" + lastName + "]\n";
    }
}