/**
 * class Book
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Book extends Item{
    // Instance Variables:
    private Author   author;
    private Date     datePublished;
    private String   title;
    private BookType genre;

    /**
     * Constructor for objects of class Book.
     * @param weightKg                    A  double to set the weight in Kg of the Book.
     * @param manufacturingPriceDollars   A  double to set the manufacturing price dollars of the Book.
     * @param suggestedRetailPriceDollars A  double to set the suggested retail price dollars of the Book.
     * @param ISBN                        A  String to set the ISBN of the Book.
     * @param author                      An Author to set the author of the Book.
     * @param datePublished               A  Date to set the date published of the Book.
     * @param title                       A  String to set the title of the Book.
     * @param genre                       A  BookType to set the book type of the Book.
     */
    public Book(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars, String ISBN,
                Author author, Date datePublished, String title, BookType genre) {
        super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars, ISBN);
        setAuthor(author);
        setDatePublished(datePublished);
        setTitle(title);
        setGenre(genre);
    }

    /**
     * @return The author of the Book in Author.
     */
    public Author getAuthor() {
        return this.author;
    }

    /**
     * Sets the author of the Book.
     * @param author An Author to set the author of the Book.
     */
    public void setAuthor(Author author) {
        if(author != null) {
            this.author = author;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Book::author.");
        }
    }

    /**
     * @return The date published of the Book in Date.
     */
    public Date getDatePublished() {
        return this.datePublished;
    }

    /**
     * Sets the date published of the Book.
     * @param datePublished A Date to set the date published of the Book.
     */
    public void setDatePublished(Date datePublished) {
        if(datePublished != null) {
            this.datePublished = datePublished;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Book::datePublished.");
        }
    }

    /**
     * @return The title of the Book in String.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the title of the Book.
     * @param title A String to set the title of the Book.
     */
    public void setTitle(String title) {
        if(title != null && !title.trim().isEmpty()) {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Book::title.");
        }
    }

    /**
     * @return The book type of the Book in BookType.
     */
    public BookType getGenre() {
        return this.genre;
    }

    /**
     * Sets the book type of the Book.
     * @param genre A BookType to set the book type of the Book.
     */
    public void setGenre(BookType genre) {
        if(genre != null) {
            this.genre = genre;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Book::genre.");
        }
    }

    /**
     * @return The ISBN of the Book in String.
     */
    public String getISBN(){
        return this.getUniqueID();
    }

    /**
     * Sets the ISBN of the Book.
     * @param ISBN A String to set the ISBN of the Book.
     */
    public void setISBN(String ISBN){
        if(ISBN != null && !ISBN.trim().isEmpty()) {
            this.setUniqueID(ISBN);
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Book::ISBN.");
        }
    }

    /**
     * @return The year published of the Book in integer.
     */
    public int getYearPublished() {
        return this.getDatePublished().getYear();
    }

    /**
     * @return The full name of the author of the Book in String.
     */
    public String getAuthorFullName() {
        return this.getAuthor().getName().getFullName();
    }

    /**
     * @return A String such as "fiction" when its BookType is BookType.FICTION (return genre.getTheBookType();).
     */
    public String getGenreString(){
        return genre.getTheBookType();
    }
}