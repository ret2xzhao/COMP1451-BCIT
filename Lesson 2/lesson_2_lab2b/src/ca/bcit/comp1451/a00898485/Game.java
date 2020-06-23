package ca.bcit.comp1451.a00898485;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Including two games. One is guessTheDate() and the other one is guessTheBirthdateDay().
 * 
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Game
{
    // Symbolic Constants:
    public static final int MIN_YEAR_GUESS_DATE = 1600;  // For guessTheDate()
    public static final int MAX_YEAR_GUESS_DATE = 2199;  // For guessTheDate()
    public static final int MIN_YEAR_GUESS_BIRTH = 1900; // For guessTheBirthdateDay()
    public static final int MAX_YEAR_GUESS_BIRTH = 2019; // For guessTheBirthdateDay()
    public static final int MIN_MONTH = 1;
    public static final int MAX_MONTH = 12;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;
    public static final String QUIT = "Q";

    // Instance Variables:
    private HashMap<Integer, String> monthOrder;
    private int userYear;
    private int userMonth;
    private int userDay;
    private static int guessYear;
    private static int guessMonth;
    private static int guessDay;
    private static String dayOfTheWeek;
    private static int FLAG = 1;

    /**
     * Constructor of class Game.
     */
    public Game()
    {
        setMonthOrder();
    }

    /**
     * Store items in "Month Order in integer / Month" pairs.
     */
    public void setMonthOrder()
    {
        monthOrder = new HashMap<Integer, String>();
        if(monthOrder != null)
        {
            monthOrder.put(1, "January");
            monthOrder.put(2, "February");
            monthOrder.put(3, "March");
            monthOrder.put(4, "April");
            monthOrder.put(5, "May");
            monthOrder.put(6, "June");
            monthOrder.put(7, "July");
            monthOrder.put(8, "August");
            monthOrder.put(9, "September");
            monthOrder.put(10, "October");
            monthOrder.put(11, "November");
            monthOrder.put(12, "December");
            // System.out.println("HashMap monthOrder is created.");
        }
        else
        {
            System.out.println("HashMap monthOrder is failed to create.");
        }
    }

    /**
     * @param maxYear An integer to set up the upper bound.
     * @param minYear An integer to set up the lower bound.
     * @return A (pseudo-)randomly-chosen Date between minYear and maxYear, inclusive.
     */
    public Date getRandomDate(int maxYear, int minYear)
    {
        Random  random = new Random();

        int year = random.nextInt(maxYear-minYear+1) + minYear;
        int month = random.nextInt(MAX_MONTH) + MIN_MONTH; // Month: 1-12
        int day = 0;

        switch (month)
        {
            // February:
            case 2:
            {
                if(isLeapYear(year))
                {
                    day = random.nextInt(MAX_DAY-2) + MIN_DAY; // Day: 1-29
                }
                else
                {
                    day = random.nextInt(MAX_DAY-3) + MIN_DAY; // Day: 1-28
                }
                break;
            }
            // Months have 31 days:
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                day = random.nextInt(MAX_DAY) + MIN_DAY; // Day: 1-31
                break;
            }
            // Months have 30 days:
            case 4:
            case 6:
            case 9:
            case 11:
            {
                day = random.nextInt(MAX_DAY-1) + MIN_DAY; // Day: 1-30
            }
        }
        Date randomDate = new Date(year, monthOrder.get(month), day);
        return randomDate;
    }

    /**
     *  Tries to guess the year, then the month, and then the day that is chosen by getRandomDate(). Each time the user
     *  is wrong, tell them ¡°higher¡± or ¡°lower¡± as appropriate. At any time, if the user types q or Q, the game will quit.
     */
    public void guessTheDate()
    {
        while(FLAG == 1)
        {
            // Set up a random date.
            Date date = getRandomDate(MAX_YEAR_GUESS_DATE, MIN_YEAR_GUESS_DATE);
            guessYear = date.getYear();
            guessMonth = date.getMonth();
            guessDay = date.getDay();
            dayOfTheWeek = date.getDayOfTheWeek();

            // Begin to guess.
            guessTheYear();
            if(FLAG == 2)
            {
                FLAG = 1;
            }
        }
    }

    /**
     *  Helper function of guessTheDate() to guess the year.
     */
    public void guessTheYear()
    {
        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in); // System.in by default is keyboard 
        boolean keepPlaying;
        keepPlaying = true;
        String userString;

        System.out.println("-------------------------------------------------------------");
        System.out.println("New game! Guess Date:");
        System.out.println("Year range: " + MIN_YEAR_GUESS_DATE + "-" + MAX_YEAR_GUESS_DATE +
                           ". Please guess the year (or Q to quit): ");
        while(keepPlaying)
        {
            if(keyboardScanner.hasNext())
            {
                if(keyboardScanner.hasNextInt())
                {
                    userYear = keyboardScanner.nextInt();
                    if(userYear < guessYear && userYear >= MIN_YEAR_GUESS_DATE)
                    {
                        System.out.println("Wrong: Higher.");
                    }
                    else if(userYear > guessYear && userYear <= MAX_YEAR_GUESS_DATE)
                    {
                        System.out.println("Wrong: Lower.");
                    }
                    else if(userYear == guessYear)
                    {
                        System.out.println("Correct.");
                        guessTheMonth();
                        return;
                    }
                    else
                    {
                        System.out.println("Wrong: " + userYear + " is not a valid year.");
                    }
                }
                else // not an integer
                {
                    userString = keyboardScanner.next();
                    if(userString.equalsIgnoreCase(QUIT))
                    {
                        keepPlaying = false;
                        FLAG = 0;
                        System.out.println("The game is over. Thank you.");
                        return;
                    }
                    else
                    {
                        System.out.println("Wrong: " + userString + " is not a valid year.");
                    }
                }
            }
            if(FLAG == 0 || FLAG == 2)
            {
                return;
            }
            System.out.println("Please guess the year (or Q to quit): ");
        }
    }

    /**
     *  Helper function of guessTheDate() to guess the month.
     */
    public void guessTheMonth() {
        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in); // System.in by default is keyboard 
        boolean keepPlaying;
        keepPlaying = true;
        String userString;

        System.out.println("Month range: " + MIN_MONTH + "-" + MAX_MONTH + ". Please guess the month (or Q to quit): ");
        while(keepPlaying){
            if(keyboardScanner.hasNext()){
                if(keyboardScanner.hasNextInt()){
                    userMonth = keyboardScanner.nextInt();
                    if(userMonth < guessMonth && userMonth >= MIN_MONTH)
                    {
                        System.out.println("Wrong: Higher.");
                    }
                    else if(userMonth > guessMonth && userMonth <= MAX_MONTH)
                    {
                        System.out.println("Wrong: Lower.");
                    }
                    else if(userMonth == guessMonth)
                    {
                        System.out.println("Correct.");
                        guessTheDay();
                        return;
                    }
                    else
                    {
                        System.out.println("Wrong: " + userMonth + " is not a valid month.");
                    }
                }
                else // not an integer
                {
                    userString = keyboardScanner.next();
                    if(userString.equalsIgnoreCase(QUIT))
                    {
                        keepPlaying = false;
                        FLAG = 0;
                        System.out.println("The game is over. Thank you.");
                        return;
                    }
                    else
                    {
                        System.out.println("Wrong: " + userString + " is not a valid month.");
                    }
                }
            }
            if(FLAG == 0 || FLAG == 2)
            {
                return;
            }
            System.out.println("Please guess the month (or Q to quit): ");
        }
    }

    /**
     *  Helper function of guessTheDate() to guess the day.
     */
    public void guessTheDay() {
        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in); // System.in by default is keyboard
        boolean keepPlaying;
        keepPlaying = true;
        String userString;

        System.out.println("If month is 1,3,5,7,8,10,12.     Day range: 1-31.\n" +
                           "If month is 4,6,9,11.            Day range: 1-30.\n" +
                           "If month is 2 of a leap year.    Day range: 1-29.\n" +
                           "If month is 2 of a regular year. Day range: 1-28.");
        System.out.println("Please guess the day (or Q to quit): ");
        while(keepPlaying){
            if(keyboardScanner.hasNext()){
                if(keyboardScanner.hasNextInt()){
                    userDay = keyboardScanner.nextInt();
                    switch (guessMonth)
                    {
                        // February:
                        case 2:
                        {
                            if(isLeapYear(guessYear)) // Leap year:
                            {
                                validateAndCheckInputDay(2);
                            }
                            else
                            {
                                validateAndCheckInputDay(3);
                            }
                            break;
                        }
                        // Months have 31 days:
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        {
                            validateAndCheckInputDay(0);
                            break;
                        }
                        // Months have 30 days:
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                        {
                            validateAndCheckInputDay(1);
                        }
                    }
                }
                else // not an integer
                {
                    userString = keyboardScanner.next();
                    if(userString.equalsIgnoreCase(QUIT))
                    {
                        keepPlaying = false;
                        FLAG = 0;
                        System.out.println("The game is over. Thank you.");
                        return;
                    }
                    else
                    {
                        System.out.println("Wrong: " + userString + " is not a valid day.");
                    }
                }
            }
            if(FLAG == 0 || FLAG == 2)
            {
                return;
            }
            System.out.println("Please guess the day (or Q to quit): ");
        }
    }

    /**
     * Validates and checks the input day.
     * @param offset An integer to be offset from the days of a specified month.
     */
    private void validateAndCheckInputDay(int offset) {
        if(userDay < guessDay && userDay >= MIN_DAY)
        {
            System.out.println("Wrong: Higher.");
        }
        else if(userDay > guessDay && userDay <= MAX_DAY-offset)
        {
            System.out.println("Wrong: Lower.");
        }
        else if(userDay == guessDay)
        {
            System.out.print("Correct.");
            System.out.println("The date was " + monthOrder.get(guessMonth) + " " + guessDay + ", " + guessYear + ".");
            System.out.println("It's a " + dayOfTheWeek + ".");
            FLAG = 2;
            return;
        }
        else
        {
            System.out.println("Wrong: " + userDay + " is not a valid day.");
        }
    }

    /**
     *  Tries to guess the day of the week on which a given date fell. Only use dates between January 1, 1900 and 
     *  January 1 of the current year.
     */
    public void guessTheBirthdateDay()
    {
        System.out.println("----------------------------------------------------");
        int counter = 0;
        for(int i=1; i<=5; i++)
        {
            Date random = getRandomDate(MAX_YEAR_GUESS_BIRTH, MIN_YEAR_GUESS_BIRTH);
            String dayOfTheWeek = random.getDayOfTheWeek();
            System.out.println("Date #" + i + ": What day of the week was " + monthOrder.get(random.getMonth()) + " " 
                               + random.getDay() + ", " + random.getYear() + ": ");
            Scanner keyboardScanner = new Scanner(System.in);
            String userString;

            if(keyboardScanner.hasNext()){
                userString = keyboardScanner.next();
                if(userString.equals(dayOfTheWeek))
                {
                    counter = counter + 1;	
                    System.out.println("Correct.");
                }	
                else
                {
                    System.out.println("Wrong: It was a " + dayOfTheWeek + ".");
                }
            }
        }
        System.out.print("You scored " + counter + " out of 5. Game over.");
    }

    /**
     * Returns true (e.g. for 1996, 2000, 2012, etc) or false (e.g. for 1900, 2011, etc) depending on whether a year is a
     * leap year or not.
     * @return a boolean depending on whether a year is a leap year or not.
     */
    private boolean isLeapYear(int year)
    {
        boolean leapYear;
        if (year % 4 != 0)
        {
            leapYear = false;
        } 
        else if (year % 400 == 0)
        {
            leapYear = true;
        }
        else if (year % 100 == 0)
        {
            leapYear = false;
        }
        else
        {
            leapYear = true;
        }
        return leapYear;
    }
}