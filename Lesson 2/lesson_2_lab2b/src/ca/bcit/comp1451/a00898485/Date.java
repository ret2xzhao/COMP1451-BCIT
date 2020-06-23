package ca.bcit.comp1451.a00898485;

import java.util.HashMap;

/**
 * Get the day of the week for a specified date.
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Date
{
    // Instance Variables:
    private int year;
    private int month;
    private int day;
    private HashMap<String, Integer> monthCodes;
    private HashMap<Integer, String> weekCodes;
    private HashMap<String, Integer> monthsOfYear;
    private String monthHandle; // After assigning String month to monthHandle, then String month will be converted to integer

    // Symbolic Constants:
    public static final int CURRENT_YEAR = 2199;
    public static final int MIN_YEAR = 1600;
    public static final int MAX_DAY = 31;
    public static final int MIN_DAY = 1;

    /**
     * Constructor for objects of class Date.
     * @param year An integer to set the year.
     * @param month A String to set the month.
     * @param day An integer to set the day.
     */
    public Date(int year, String month, int day)
    {
        setMonthsOfYear();
        setYear(year);
        setMonth(month);
        setDay(day);
        setDayOfWeek();
        setMonthCode();
    }

    /**
     *  Store items in "Month / Month Order in integer" pairs.
     */
    public void setMonthsOfYear()
    {
        monthsOfYear = new HashMap<String, Integer>();
        if(monthsOfYear != null)
        {
            monthsOfYear.put("January", 1);
            monthsOfYear.put("February", 2);
            monthsOfYear.put("March", 3);
            monthsOfYear.put("April", 4);
            monthsOfYear.put("May", 5);
            monthsOfYear.put("June", 6);
            monthsOfYear.put("July", 7);
            monthsOfYear.put("August", 8);
            monthsOfYear.put("September", 9);
            monthsOfYear.put("October", 10);
            monthsOfYear.put("November", 11);
            monthsOfYear.put("December", 12);
            // System.out.println("HashMap monthsOfYear is created.");
        }
        else
        {
            System.out.println("HashMap monthsOfYear is failed to create.");
        }
    }

    /**
     *  Store items in "Day Order in integer / Day of the week" pairs.
     */
    public void setDayOfWeek()
    {
        weekCodes = new HashMap<Integer, String>();
        if(weekCodes != null)
        {
            weekCodes.put(0, "Saturday");
            weekCodes.put(1, "Sunday");
            weekCodes.put(2, "Monday");
            weekCodes.put(3, "Tuesday");
            weekCodes.put(4, "Wednesday");
            weekCodes.put(5, "Thursday");
            weekCodes.put(6, "Friday");
            // System.out.println("HashMap weekCodes is created.");
        }
        else
        {
            System.out.println("HashMap weekCodes is failed to create.");
        }
    }

    /**
     *  Store items in "Month / Month Code" pairs.
     */
    public void setMonthCode()
    {
        monthCodes = new HashMap<String, Integer>();
        if(monthCodes != null)
        {
            monthCodes.put("January", 1);
            monthCodes.put("February", 4);
            monthCodes.put("March", 4);
            monthCodes.put("April", 0);
            monthCodes.put("May", 2);
            monthCodes.put("June", 5);
            monthCodes.put("July", 0);
            monthCodes.put("August", 3);
            monthCodes.put("September", 6);
            monthCodes.put("October", 1);
            monthCodes.put("November", 4);
            monthCodes.put("December", 6);
            // System.out.println("HashMap monthCodess is created.");
        }
        else
        {
            System.out.println("HashMap monthCodes is failed to create.");
        }
    }

    /**
     * Sets the year.
     * @param year An integer to set the year.
     */
    public void setYear(int year)
    {
        if(year >= MIN_YEAR && year <= CURRENT_YEAR)
        {
            this.year = year;
        }
        else
        {
            throw new IllegalArgumentException("ERROR: Invalid Input: year.");
        }
    }

    /**
     * Gets the year.
     * @return the year as an integer.
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Sets the month.
     * @param month An String to set the month.
     */
    public void setMonth(String month)
    {
        monthHandle = month;
        if(month != null && !month.isEmpty())
        {
            boolean ifContain = monthsOfYear.containsKey(month);
            if(ifContain)
            {
                this.month = monthsOfYear.get(month);
            }
        }
        else
        {
            System.out.println("ERROR: Invalid Input: month.");
        }
    }

    /**
     * Gets the month.
     * @return the month as an integer.
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Sets the day.
     * @param day An integer to set the day.
     */
    public void setDay(int day)
    {
        if(day < MIN_DAY || day > MAX_DAY)
        {
            System.out.println("ERROR: Invalid Input: day.");
        }
        switch (this.month)
        {
            // February:
            case 2:
            {
                boolean leapYear = isLeapYear();
                if ((day <= 28) || (leapYear && day == 29))
                {
                    this.day = day;
                }
                else
                {
                    System.out.println("ERROR: Invalid Input: day.");
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
                this.day = day;
                break;
            }
            // Months have 30 days:
            case 4:
            case 6:
            case 9:
            case 11:
            {
                if (day <= 30)
                {
                    this.day = day;
                }
                else
                {
                    System.out.println("ERROR: Invalid Input: day.");
                }
            }
        }
    }

    /**
     * Gets the day.
     * @return the day as an integer
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Returns true (e.g. for 1996, 2000, 2012, etc) or false (e.g. for 1900, 2011, etc) depending on whether a year is a
     * leap year or not.
     * @return a boolean depending on whether a year is a leap year or not.
     */
    private boolean isLeapYear()
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

    /**
     * Returns the day of the week (e.g. "Wednesday") for a specified date (e.g. October 31, 2012).
     * @return the day of the week as a String.
     */
    public String getDayOfTheWeek()
    {
        int monthCode;
        // Step 1: Only look at the last two digits of the year and determine how many 12s fit in it:
        int lastTwoDigit = year % 100;
        int countTwelve = lastTwoDigit / 12;

        // Step 2: Look at the remainder of this division:
        int remainder = lastTwoDigit - countTwelve * 12;

        // Step 3: How many 4s fit into that remainder:
        int countFour = remainder / 4;

        // Step 4: Add the day of the month:
        // Step 5: Add the month code
        monthCode = monthCodes.get(monthHandle);

        // Special offsets:
        boolean leapYear = isLeapYear(); 
        if(leapYear && (month == 1 || month == 2)) {monthCode = monthCode - 1;}
        if((year / 100 == 16) || (year / 100 == 20)) {monthCode = monthCode + 6;}
        else if((year / 100 == 17) || (year / 100 == 21)) {monthCode = monthCode + 4;}
        else if(year / 100 == 18) {monthCode = monthCode + 2;}

        // Step 6: Add all of the above numbers, then mod by 7:
        int total = countTwelve + remainder + countFour + this.day + monthCode;
        int result = total % 7;

        return weekCodes.get(result);
    }

    /**
     * Print the day of the week for a specified date.
     */
    public void displayDate()
    {
        System.out.println("Date: " + monthHandle + " " + day + ", " + year);
        System.out.println("The day of the week is " + getDayOfTheWeek());
        System.out.println("------------------------------------------------");
    }
}