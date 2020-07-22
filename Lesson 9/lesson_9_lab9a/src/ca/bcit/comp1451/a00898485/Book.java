package ca.bcit.comp1451.a00898485;

/**
 * class Book
 *
 * @author Xin Zhao (A00898485) with Man Lee
 * @version 1.0
 */

public class Book implements Comparable<Book>{
    // Symbolic Constants:
    public static final int MAX_YEAR = 2016;
    public static final int MIN_YEAR = 0;

    // Instance Variables:
    private   Name   authorName;
    protected String title;
    private   int    yearPublished;

    /**
     * Constructor for objects of class Book.
     * @param  authorName    A  Name to set the author's name of a Book.
     * @param  title         A  String to set the title of a Book.
     * @param  yearPublished An integer to set the year published of a Book.
     * @throws InvalidArgumentException
     * @throws InvalidBookDateException
     */
    public Book(Name authorName, String title, int yearPublished) throws InvalidArgumentException, InvalidBookDateException{
        setAuthorName(authorName);
        setTitle(title);
        setYearPublished(yearPublished);
    }

    /**
     * @return The author's name of a Book in Name.
     */
    final public Name getAuthorName() {
        return this.authorName;
    }

    /**
     * Sets the author's name of a Book.
     * @param authorName A Name to set the author's name of a Book.
     * @throws InvalidArgumentException
     */
    final public void setAuthorName(Name authorName) throws InvalidArgumentException {
        if(authorName == null) {
            throw new InvalidArgumentException("Error: Invalid Book::authorName.");
        }
        else {
            this.authorName = authorName;
        }
    }

    /**
     * @return The title of a Book in String.
     */
    final public String getTitle() {
        return this.title;
    }

    /**
     * Sets the title of a Book.
     * @param title A String to set the title of a Book.
     * @throws InvalidArgumentException 
     */
    final public void setTitle(String title) throws InvalidArgumentException {
        if(title == null || title.trim().isEmpty()) {
            throw new InvalidArgumentException("Error: Invalid Book::title.");
        }
        else {
            this.title = title.toUpperCase().charAt(0) + title.substring(1).toLowerCase();
        }
    }

    /**
     * @return The year published of a Book in integer.
     */
    final public int getYearPublished() {
        return this.yearPublished;
    }

    /**
     * Sets the year published of a Book.
     * @param yearPublished An integer to set the year published of a Book.
     * @throws InvalidBookDateException
     */
    final public void setYearPublished(int yearPublished) throws InvalidBookDateException {
        if(yearPublished > MAX_YEAR || yearPublished < MIN_YEAR) {
            throw new InvalidBookDateException("Error: Invalid Book::yearPublished.");
        }
        this.yearPublished = yearPublished;
    }

    /**
     * @return An integer to indicate the hash code value for the object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + yearPublished;
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * @return A boolean to indicate if this object is the same as the obj argument.
     * @param obj The reference Object with which to compare.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (authorName == null) {
            if (other.authorName != null)
                return false;
        } else if (!authorName.equals(other.authorName))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (yearPublished != other.yearPublished)
            return false;
        return true;
    }

    /**
     * Returns a string representation of the object.
     */
    @Override
    public String toString() {
        return "Book [authorName=" + this.authorName.getFullName() + ", title=" + title + ", yearPublished=" + yearPublished + "]";
    }

    /**
     * @return An integer to indicate the Book with the more-recent book is bigger.
     * @param  other The reference Book with which to compare.
     */
    @Override
    public int compareTo(Book other) {
        return (int)(this.getYearPublished() - other.getYearPublished());
    }
}