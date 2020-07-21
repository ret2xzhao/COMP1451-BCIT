/**
 * class Author
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Author {
    // Instance Variables:
    private Date     birthDate;
    private Name     name;
    private BookType genre;
    private String   pseudonym;

    /**
     * Constructor for objects of class Author.
     * @param birthDate A Date to set the birth date of the Author.
     * @param name      A Name to set the name of the Author.
     * @param genre     A BookType to set the genre of the Author.
     * @param pseudonym A String to set the pseudonym of the Author.
     */
    public Author(Date birthDate, Name name, BookType genre, String pseudonym) {
        setBirthDate(birthDate);
        setName(name);
        setGenre(genre);
        setPseudonym(pseudonym);
    }

    /**
     * @return The birth date of the Author.
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    /**
     * Sets the birth date of the Author.
     * @param birthDate A Date to set the birth date of the Author.
     */
    public void setBirthDate(Date birthDate) {
        if(birthDate != null) {
            this.birthDate = birthDate;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Author::birthDate.");
        }
    }

    /**
     * @return The name of the Author.
     */
    public Name getName() {
        return this.name;
    }

    /**
     * Sets the name of the Author.
     * @param name A Name to set the name of the Author.
     */
    public void setName(Name name) {
        if(name != null) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Author::name.");
        }
    }

    /**
     * @return The genre of the Author.
     */
    public BookType getGenre() {
        return this.genre;
    }

    /**
     * Sets the genre of the Author.
     * @param genre A BookType to set the genre of the Author.
     */
    public void setGenre(BookType genre) {
        if(genre != null) {
            this.genre = genre;		
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Author::genre.");
        }
    }

    /**
     * @return The pseudonym of the Author.
     */
    public String getPseudonym() {
        return this.pseudonym;
    }

    /**
     * Sets the pseudonym of the Author.
     * @param pseudonym A String to set the pseudonym of the Author.
     */
    public void setPseudonym(String pseudonym) {
        if(pseudonym != null) {
            this.pseudonym = pseudonym;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Author::pseudonym.");
        }
    }
}