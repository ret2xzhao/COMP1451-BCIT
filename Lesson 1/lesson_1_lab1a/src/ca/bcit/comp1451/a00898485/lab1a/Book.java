package ca.bcit.comp1451.a00898485.lab1a;

/**
 * Book has instance variables for title and datePublished.
 * 
 * @author Xin Zhao (A00898485) with Hirohide Shishido
 * @version 1.0
 */

public class Book
{
    // Instance Variables:
    private String title;
    private Date datePublished;

    /**
     * First Constructor for objects of class Book.
     * @param title A String to set the title.
     * @param datePublished A Date reference to set the date published.
     */
    public Book(String title, Date datePublished)
    {
        setTitle(title);
        setDatePublished(datePublished);
    }

    /**
     * Second Constructor for objects of class Book.
     * @param title A String to set the title.
     * @param year An int to set the year.
     * @param month An int to set the month.
     * @param day An int to set the day.
     */
    public Book(String title, int year, int month, int day)
    {
        setTitle(title);
        this.datePublished = new Date(year, month, day);
    }

    /**
     * Sets the title.
     * @param title A String to set the title.
     */
    public void setTitle(String title)
    {
        if(title != null && !title.isEmpty())
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("ERROR: Invalid Input: title.");
        }
    }

    /**
     * Gets the title.
     * @return the title as a String.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets the datePublished.
     * @param datePublished A Date reference to set the date published.
     */
    public void setDatePublished(Date datePublished)
    {
        if(datePublished != null)
        {
            this.datePublished = datePublished;
        }
        else
        {
            throw new IllegalArgumentException("ERROR: Invalid Input: datePublished.");
        }
    }

    /**
     * Gets the datePublished.
     * @return the datePublished as a Date reference.
     */
    public Date getDatePublished()
    {
        return datePublished;
    }
}