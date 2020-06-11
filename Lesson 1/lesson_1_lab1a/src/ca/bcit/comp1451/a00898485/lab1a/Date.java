package ca.bcit.comp1451.a00898485.lab1a;

/**
 * Date has instance variables for year, month and day.
 * 
 * @author Xin Zhao (A00898485) with Hirohide Shishido
 * @version 1.0
 */

public class Date
{
    // Instance Variables:
    private int year;
    private int month;
    private int day;

    // Symbolic Constants:
    public static final int CURRENT_YEAR = 2020;
    public static final int MIN_YEAR = 1;
    public static final int MAX_MONTH = 12;
    public static final int MIN_MONTH = 1;
    public static final int MAX_DAY = 31;
    public static final int MIN_DAY = 1;

    /**
     * Constructor for objects of class Date.
     * @param year An int to set the year.
     * @param month An int to set the month.
     * @param day An int to set the day.
     */
    public Date(int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    /**
     * Sets the year.
     * @param year An int to set the year.
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
     * @return the year as an int.
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Sets the month.
     * @param month An int to set the month.
     */
    public void setMonth(int month)
    {
        if(month >= MIN_MONTH && month <= MAX_MONTH)
        {
            this.month = month;
        }
        else
        {
            throw new IllegalArgumentException("ERROR: Invalid Input: month.");
        }
    }

    /**
     * Gets the month.
     * @return the month as an int.
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Sets the day.
     * @param day An int to set the day.
     */
    public void setDay(int day)
    {
        if(day >= MIN_DAY && day <= MAX_DAY)
        {
            this.day = day;
        }
        else
        {
            throw new IllegalArgumentException("ERROR: Invalid Input: day.");
        }
    }

    /**
     * Gets the day.
     * @return the day as an int.
     */
    public int getDay()
    {
        return day;
    }
    
    /**
     * Return a String in the format of yyyy-mm-dd.
     * @return the date as a String.
     */
    public String getDate()
    {
        String date = this.getYear() + "-" + formatNumber(this.getMonth()) + "-" + formatNumber(this.getDay());
        return date;
    }

    /**
     * Return a String in the format of 0X if the month or the day is single digit number.
     * @return the number as a String.
     */
    public String formatNumber(int number)
    {
        if(number < 10)
        {
            return String.format("0%d", number);
        }
        else
        {
            return String.format("%d", number);
        }
    }
}