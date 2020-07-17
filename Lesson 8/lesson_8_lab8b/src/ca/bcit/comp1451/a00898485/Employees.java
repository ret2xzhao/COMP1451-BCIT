package ca.bcit.comp1451.a00898485;

import java.util.ArrayList;
import java.util.Collections;

/**
 * class Employees
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Employees {
    // Instance Variables:
    private ArrayList<Employee>            employees = new ArrayList<Employee>(20);
    private ArrayList<HockeyPlayer>        hockeyPlayers;
    private ArrayList<Professor>           professors;
    private ArrayList<Parent>              parents;
    private ArrayList<GasStationAttendant> gasStationAttendants;

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

    /**
     * Initializes the ArrayList of HockeyPlayer.
     */
    public void initHockeyPlayer() {
        hockeyPlayers = new ArrayList<HockeyPlayer>();
        hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky",  894));
        hockeyPlayers.add(new HockeyPlayer("Who Ever",       0));
        hockeyPlayers.add(new HockeyPlayer("Brent Gretzky",  1));
        hockeyPlayers.add(new HockeyPlayer("Pavel Bure",     437));
        hockeyPlayers.add(new HockeyPlayer("Jason Harrison", 0));
    }

    /**
     * Displays the HockeyPlayer before and after sorting.
     */
    public void displayHockeyPlayer() {
        initHockeyPlayer();
        for(HockeyPlayer h: hockeyPlayers) {
            System.out.println(((HockeyPlayer) h).getClass().getSimpleName() + "          " + ((HockeyPlayer) h).getName() 
                                 + " scored " + ((HockeyPlayer) h).getNumberOfGoals() + " goals");
        }
        Collections.sort(hockeyPlayers);
        System.out.println();
        for(HockeyPlayer h: hockeyPlayers) {
            System.out.println(((HockeyPlayer) h).getClass().getSimpleName() + "          " + ((HockeyPlayer) h).getName() 
                                 + " scored " + ((HockeyPlayer) h).getNumberOfGoals() + " goals");
        }
    }

    /**
     * Initializes the ArrayList of Professor.
     */
    public void initProfessor() {
        professors = new ArrayList<Professor>();
        professors.add(new Professor("Albert Einstein", "Physics"));
        professors.add(new Professor("Jason Harrison",  "Computer Systems"));
        professors.add(new Professor("Richard Feynman", "Physics"));
        professors.add(new Professor("BCIT Instructor", "Computer Systems"));
        professors.add(new Professor("Kurt Godel",      "Logic"));
    }

    /**
     * Displays the Professor before and after sorting.
     */
    public void displayProfessor() {
        initProfessor();
        for(Professor p: professors) {
            System.out.println(((Professor) p).getClass().getSimpleName() + "             " + ((Professor) p).getName() 
                                 + " teaches " + ((Professor) p).getTeachingMajor());
        }
        Collections.sort(professors);
        System.out.println();
        for(Professor p: professors) {
            System.out.println(((Professor) p).getClass().getSimpleName() + "             " + ((Professor) p).getName() 
                                 + " teaches " + ((Professor) p).getTeachingMajor());
        }
    }

    /**
     * Initializes the ArrayList of Parent.
     */
    public void initParent() {
        parents = new ArrayList<Parent>();
        parents.add(new Parent("Tiger Woods", 1));
        parents.add(new Parent("Super Mom",   168));
        parents.add(new Parent("Lazy Larry",  20));
        parents.add(new Parent("Ex Hausted",  168));
        parents.add(new Parent("Super Dad",   167));
    }

    /**
     * Displays the Parent before and after sorting.
     */
    public void displayParent() {
        initParent();
        for(Parent p: parents) {
            System.out.println(((Parent) p).getClass().getSimpleName() + "                " + ((Parent) p).getName() 
                                 + " spends " + ((Parent) p).getNumberOfHoursSpentPerWeekWithKids() + " hour/week with kids");
        }
        Collections.sort(parents);
        System.out.println();
        for(Parent p: parents) {
            System.out.println(((Parent) p).getClass().getSimpleName() + "                " + ((Parent) p).getName() 
                                 + " spends " + ((Parent) p).getNumberOfHoursSpentPerWeekWithKids() + " hour/week with kids");
        }
    }

    /**
     * Initializes the ArrayList of GasStationAttendant.
     */
    public void initGasStationAttendant() {
        gasStationAttendants = new ArrayList<GasStationAttendant>();
        gasStationAttendants.add(new GasStationAttendant("Joe Smith",         10));
        gasStationAttendants.add(new GasStationAttendant("Tony Baloney",      100));
        gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 100));
        gasStationAttendants.add(new GasStationAttendant("Mary Fairy",        101));
        gasStationAttendants.add(new GasStationAttendant("Bee See",           1));
    }

    /**
     * Displays the GasStationAttendant before and after sorting.
     */
    public void displayGasStationAttendant() {
        initGasStationAttendant();
        for(GasStationAttendant g: gasStationAttendants) {
            System.out.println(((GasStationAttendant) g).getClass().getSimpleName() + "   " + ((GasStationAttendant) g).getName() 
                                 + " steals " + ((GasStationAttendant) g).getnumberOfDollarsStolenPerDay() + " dollars a day");
        }
        Collections.sort(gasStationAttendants);
        System.out.println();
        for(GasStationAttendant g: gasStationAttendants) {
            System.out.println(((GasStationAttendant) g).getClass().getSimpleName() + "   " + ((GasStationAttendant) g).getName() 
                                 + " steals " + ((GasStationAttendant) g).getnumberOfDollarsStolenPerDay() + " dollars a day");
        }
    }

    /**
     * Displays the HockeyPlayers both scored the same number of goals.
     */
    public void hockeyPlayerCompareAndDisplay() {
        initHockeyPlayer();
        for(int i=0; i<hockeyPlayers.size(); i++) {
            for(int j=i; j<hockeyPlayers.size(); j++) {
                if(hockeyPlayers.get(i).equals(hockeyPlayers.get(j)) && !hockeyPlayers.get(i).getName().equals(hockeyPlayers.get(j).getName())) {
                    System.out.println(hockeyPlayers.get(i).getName() + " is equal to " + hockeyPlayers.get(j).getName() 
                                       + ", they both scored " + hockeyPlayers.get(i).getNumberOfGoals() + " goals.");
                }
            }
        }
    }

    /**
     * Displays the Professors both teach the same major.
     */
    public void professorCompareAndDisplay() {
        initProfessor();
        for(int i=0; i<professors.size(); i++) {
            for(int j=i; j<professors.size(); j++) {
                if(professors.get(i).equals(professors.get(j)) && !professors.get(i).getName().equals(professors.get(j).getName())) {
                    System.out.println(professors.get(i).getName() + " is equal to " + professors.get(j).getName() 
                                       + ", they both teach " + professors.get(i).getTeachingMajor() + ".");
                }
            }
        }
    }

    /**
     * Displays the Parents both have the same number of hours spent per week with kids.
     */
    public void parentCompareAndDisplay() {
        initParent();
        for(int i=0; i<parents.size(); i++) {
            for(int j=i; j<parents.size(); j++) {
                if(parents.get(i).equals(parents.get(j)) && !parents.get(i).getName().equals(parents.get(j).getName())) {
                    System.out.println(parents.get(i).getName() + " is equal to " + parents.get(j).getName() 
                                       + ", they both have the same number of hours: " + parents.get(i).getNumberOfHoursSpentPerWeekWithKids() + ".");
                }
            }
        }
    }

    /**
     * Displays the GasStationAttendant both steal the same amount of dollars per day.
     */
    public void gasStationAttendantCompareAndDisplay() {
        initGasStationAttendant();
        for(int i=0; i<gasStationAttendants.size(); i++) {
            for(int j=i; j<gasStationAttendants.size(); j++) {
                if(gasStationAttendants.get(i).equals(gasStationAttendants.get(j)) && !gasStationAttendants.get(i).getName().equals(gasStationAttendants.get(j).getName())) {
                    System.out.println(gasStationAttendants.get(i).getName() + " is equal to " + gasStationAttendants.get(j).getName() 
                                       + ", they both steal the same amount " + gasStationAttendants.get(i).getnumberOfDollarsStolenPerDay() + ".");
                }
            }
        }
    }
}