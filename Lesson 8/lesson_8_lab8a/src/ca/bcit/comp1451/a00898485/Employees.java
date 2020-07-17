package ca.bcit.comp1451.a00898485;

import java.util.ArrayList;

/**
 * class Employees
 *
 * @author Xin Zhao (A00898485) with Nazar Poverlo
 * @version 1.0
 */

public class Employees {
    // Instance Variables:
    private ArrayList<Employee> employees = new ArrayList<Employee>(20);

    /**
     * Constructor for objects of class Employees.
     */
    public Employees() {
        employees.add(new HockeyPlayer("Wayne Gretzky",  894));
        employees.add(new HockeyPlayer("Who Ever",       0));
        employees.add(new HockeyPlayer("Brent Gretzky",  1));
        employees.add(new HockeyPlayer("Pavel Bure",     437));
        employees.add(new HockeyPlayer("Jason Harrison", 0));

        employees.add(new Professor("Albert Einstein", "Physics"));
        employees.add(new Professor("Jason Harrison",  "Computer Systems"));
        employees.add(new Professor("Richard Feynman", "Physics"));
        employees.add(new Professor("BCIT Instructor", "Computer Systems"));
        employees.add(new Professor("Kurt Godel",      "Logic"));

        employees.add(new Parent("Tiger Woods", 1));
        employees.add(new Parent("Super Mom",   168));
        employees.add(new Parent("Lazy Larry",  20));
        employees.add(new Parent("Ex Hausted",  168));
        employees.add(new Parent("Super Dad",   167));

        employees.add(new GasStationAttendant("Joe Smith",         10));
        employees.add(new GasStationAttendant("Tony Baloney",      100));
        employees.add(new GasStationAttendant("Benjamin Franklin", 100));
        employees.add(new GasStationAttendant("Mary Fairy",        101));
        employees.add(new GasStationAttendant("Bee See",           1));
    }

    /**
     * Displays the information of all the employees.
     */
    public void displayInfo() {
        for(Employee e: employees) {
            if(e instanceof HockeyPlayer) {
                System.out.println(((HockeyPlayer) e).getClass().getSimpleName() + "          " + ((HockeyPlayer) e).getName() 
                                     + " scored " + ((HockeyPlayer) e).getNumberOfGoals() + " goals");
            }
            if(e instanceof Professor) {
                System.out.println(((Professor) e).getClass().getSimpleName() + "             " + ((Professor) e).getName() 
                                     + " teaches " + ((Professor) e).getTeachingMajor());
            }
            if(e instanceof Parent) {
                System.out.println(((Parent) e).getClass().getSimpleName() + "                " + ((Parent) e).getName() 
                                     + " spends " + ((Parent) e).getNumberOfHoursSpentPerWeekWithKids() + " hour/week with kids");
            }
            if(e instanceof GasStationAttendant) {
                System.out.println(((GasStationAttendant) e).getClass().getSimpleName() + "   " + ((GasStationAttendant) e).getName() 
                                     + " steals " + ((GasStationAttendant) e).getnumberOfDollarsStolenPerDay() + " dollars a day");
            }
        }
    }
}