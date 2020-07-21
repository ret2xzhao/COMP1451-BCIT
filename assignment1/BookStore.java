import java.util.Collection;
import java.util.Iterator;

/**
 * class BookStore
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class BookStore extends Store{
    // Instance Variables:
    private BookType specialty;

    /**
     * Constructor for objects of class BookStore.
     * @param streetAddress An Address to set the street address of the BookStore.
     * @param name          A  String to set the name of the BookStore.
     * @param specialty     A  BookType to set the specialty of the BookStore.
     */
    public BookStore(Address streetAddress, String name, BookType specialty) {
        super(streetAddress, name);
        setSpecialty(specialty);
        addBooks();
    }

    /**
     * Constructor for objects of class BookStore.
     * @param streetAddress An Address to set the street address of the BookStore.
     * @param name          A  String to set the name of the BookStore.
     * @param specialty     A  String to set the specialty of the BookStore.
     */
    public BookStore(Address streetAddress, String name, String specialty) {
        super(streetAddress, name);
        setSpecialty(specialty);
        addBooks();
    }

    /**
     * Sets the specialty of the BookStore.
     * @param specialty A BookType to set the specialty of the BookStore.
     */
    public void setSpecialty(BookType specialty) {
        if(specialty != null) {
            this.specialty = specialty;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid BookStore::specialty.");
        }
    }

    /**
     * Sets the specialty of the BookStore.
     * @param specialty A String to set the specialty of the BookStore.
     */
    public void setSpecialty(String specialty) {
        if(specialty != null && !specialty.trim().isEmpty()) {
            this.specialty = BookType.get(specialty);
        }
        else {
            throw new IllegalArgumentException("Error: Invalid BookStore::specialty.");
        }
    }

    /**
     * @return The specialty of the book store in BookType.
     */
    public BookType getSpecialty() {
        return this.specialty;
    }

    /**
     * Adds books to its (parent¡¯s) HashMap. The key is the Book Item¡¯s uniqueID String; and the value is the Book.
     */
    private void addBooks(){
        Date birthDate = new Date(1919, 1, 1);
        Name name = new Name("Jerome", "David", "Salinger");
        BookType genre = BookType.get("fiction");
        Author author = new Author(birthDate, name, genre, "JD");
        Date datePublished = new Date(1951, 5, 14);
        String title = "The Catcher in the Rye";
        Book b = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1948, 1, 31);
        title = "A Perfect Day for Bananafish";
        genre = BookType.get("fiction");
        b = new Book(1, 11, 12, "2345", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1945, 12, 12);
        title = "A Boy in France";
        genre = BookType.get("fiction");
        b = new Book(2, 33, 35, "3456", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1963, 9, 3);
        name = new Name("Malcolm", "Gladwell");
        genre = BookType.get("nonfiction");
        author = new Author(birthDate, name, genre, "");
        datePublished = new Date(2008, 11, 18);
        title = "Outliers";
        b = new Book(2.1, 2, 6, "4567", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(2000, 3, 1);
        title = "The Tipping Point";
        genre = BookType.get("nonfiction");
        b = new Book(0.5, 3, 5, "5678", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1919, 11, 26);
        name = new Name("Frederik", "Pohl");
        genre = BookType.get("sciencefiction");
        author = new Author(birthDate, name, genre, "Paul Dennis Lavond");
        datePublished = new Date(1977, 7, 4);
        title = "Gateway";
        b = new Book(0.01, 4, 4, "6789", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1937, 10, 6);
        title = "Elegy to a Dead Planet: Luna";
        genre = BookType.get("sciencefiction");
        b = new Book(0.1, 5, 11, "abcd", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1918, 5, 11);
        name = new Name("Richard", "Phillips", "Feynman");
        genre = BookType.get("reference");
        author = new Author(birthDate, name, genre, "");
        datePublished = new Date(1942, 5, 20);
        title = "Principle of Least Action in Quantum Mechanics";
        b = new Book(0.8, 15, 30, "efgh", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1964, 6, 30);
        title = "The Messenger Lectures";
        genre = BookType.get("reference");
        b = new Book(0.6, 44, 45.5, "ijkl", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1985, 11, 1);
        title = "Surely You're Joking Mr. Feynman";
        genre = BookType.get("nonfiction");
        b = new Book(1.0, 3, 13, "mnop", author, datePublished, title, genre);
        addItem(b);
    }

    /**
     * Displays all books written by authors over a specific age.
     * @param ageInYears An integer to indicate a specific age.
     */
    public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears){
        Collection<Item> books = getCollectionOfItems(); // From the Store class
        Iterator  <Item> it    = books.iterator();
        boolean displayedSome  = false;
        while(it.hasNext()){
            Book b = (Book) it.next();
            int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
            if(ageYears > ageInYears){
                System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + " at age "
                                   + ageYears + ", which is more than " + ageInYears);
                displayedSome = true;
            }
        }      
        if(displayedSome == false){
            System.out.println("No books by authors over age " + ageInYears);  
        }
    }

    /**
     * Displays all books written by every author.
     */
    public void displayAllBooksByEveryAuthor() {
        Collection<Item> books = getCollectionOfItems();
        Iterator  <Item> it    = books.iterator();
        while(it.hasNext()) {
            Book b = (Book) it.next();
            System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " in " + b.getYearPublished());
        }      
    }

    /**
     * Displays all books written by author's last name.
     * @param lastName A String to indicate the last name of the author.
     */
    public void displayAllBooksByAuthor(String lastName) {
        if(lastName != null) {
            lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
            Collection<Item> books = getCollectionOfItems();
            Iterator  <Item> it    = books.iterator();
            while(it.hasNext()) {
                Book b = (Book) it.next();
                if(b.getAuthor().getName().getLastName().equals(lastName)) {
                    System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle());
                }
            }
        }
    }

    /**
     * Displays all books written before an indicated year.
     * @param year An integer to indicate a year.
     */
    public void displayAllBooksWrittenBefore(int year) {
        Collection<Item> books = getCollectionOfItems();
        Iterator  <Item> it    = books.iterator();
        while(it.hasNext()){
            Book b = (Book) it.next();
            int writtenYear = b.getDatePublished().getYear();
            if(writtenYear < year){
                System.out.println(b.getTitle() + " was published in " + b.getDatePublished().getYear() + ", which is before " + year);
            }
        }
    }

    /**
     * Displays all books written by the indicated author's pseudonym.
     * @param pseudonym A String to indicate the pseudonym of the author.
     */
    public void displayTitlesOfBooksWrittenBy(String pseudonym) {
        if(pseudonym != null) {
            Collection<Item> books = getCollectionOfItems();
            Iterator  <Item> it    = books.iterator();
            while(it.hasNext()) {
                Book b = (Book) it.next();
                if(b.getAuthor().getPseudonym().equals(pseudonym)) {
                    System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " as " + pseudonym);
                }
            }
        }
    }

    /**
     * Displays all books belongs to the indicated genre.
     * @param genre A String to indicate the genre of a book.
     */
    public void displayAllBooksForGenre(String genre) {
        if(genre != null) {
            genre = genre.substring(0).toLowerCase();
            Collection<Item> books = getCollectionOfItems();
            Iterator  <Item> it    = books.iterator();
            while(it.hasNext()) {
                Book b = (Book) it.next();
                if(b.getGenreString().equals(genre)) {
                    System.out.println(b.getTitle() + " is a " + genre + " book written by " + b.getAuthor().getName().getLastName());
                }
            }
        }
    }

    /**
     * Displays total weight of all books in Kg.
     */
    public void displayTotalWeightKgOfAllBooks() {
        double totalWeight = 0.0;
        Collection<Item> books = getCollectionOfItems();
        Iterator  <Item> it    = books.iterator();
        while(it.hasNext()) {
            Book b = (Book) it.next();
            totalWeight = totalWeight + b.getWeightKg();
        }
        System.out.println("total kg of books: " + totalWeight);
    }

    /**
     * Displays all books written by the authors born on a specific day of the week.
     * @param dayOfTheWeek A String to indicate the day of the week.
     */
    public void displayAllBooksWrittenByAuthorsBornOn(String dayOfTheWeek) {
        if(dayOfTheWeek != null) {
            dayOfTheWeek = dayOfTheWeek.toUpperCase().charAt(0) + dayOfTheWeek.substring(1).toLowerCase();
            Collection<Item> books = getCollectionOfItems();
            Iterator  <Item> it    = books.iterator();
            boolean ifBorn = false;
            while(it.hasNext()) {
                Book b = (Book) it.next();
                if(b.getAuthor().getBirthDate().getDayOfTheWeek().equals(dayOfTheWeek)) {
                    ifBorn = true;
                    System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + ", who was born on a " + dayOfTheWeek);
                }
            }
            if(ifBorn == false) {
                System.out.println("No authors were born on a " + dayOfTheWeek);
            }
        }
    }

    /**
     * Displays all books published on a specific day of the week.
     * @param dayOfTheWeek A String to indicate the day of the week.
     */
    public void displayAllBooksPublishedOn(String dayOfTheWeek) {
        if(dayOfTheWeek != null) {
            dayOfTheWeek = dayOfTheWeek.toUpperCase().charAt(0) + dayOfTheWeek.substring(1).toLowerCase();
            Collection<Item> books = getCollectionOfItems();
            Iterator  <Item> it    = books.iterator();
            boolean ifPublished = false;
            while(it.hasNext()) {
                Book b = (Book) it.next();
                if(b.getDatePublished().getDayOfTheWeek().equals(dayOfTheWeek)) {
                    ifPublished = true;
                    System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + ", which was published on a " + dayOfTheWeek);
                }
            }
            if(ifPublished == false) {
                System.out.println("No books were published on a " + dayOfTheWeek);
            }
        }
    }

    /**
     * Displays all books written by authors with a pseudonym.
     */
    public void displayAllBooksWrittenByAuthorsWithAPseudonym() {
        Collection<Item> books = getCollectionOfItems();
        Iterator  <Item> it    = books.iterator();
        while(it.hasNext()) {
            Book b = (Book) it.next();
            if(!b.getAuthor().getPseudonym().trim().equals("")) {
                System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " as " + b.getAuthor().getPseudonym());
            }
        }
    }

    /**
     * Displays the book with the biggest percentage of mark up.
     */
    public void displayBookWithBiggestPercentageMarkup() {
        Collection<Item> books = getCollectionOfItems();
        Iterator  <Item> it    = books.iterator();
        double biggestMarkup = 0.0;
        double temp;
        String title  = null;
        String author = null;
        while(it.hasNext()) {
            Book b = (Book) it.next();
            temp = (b.getSuggestedRetailPriceDollars() - b.getManufacturingPriceDollars()) / b.getManufacturingPriceDollars();
            if(temp > biggestMarkup) {
                biggestMarkup = temp;
                title  = b.getTitle();
                author = b.getAuthor().getName().getLastName();
            }
        }
        String strDouble = String.format("%.14f", biggestMarkup * 100).substring(0, 17);
        System.out.println("Highest markup is " + strDouble + "%, for " + title + " by " + author);
    }

    /**
     * Displays all books written outside the specialty.
     */
    public void displayAllBooksWrittenOutsideSpecialty() {
        Collection<Item> books = getCollectionOfItems();
        Iterator  <Item> it    = books.iterator();
        while(it.hasNext()) {
            Book b = (Book) it.next();
            if(!b.getGenreString().equals(b.getAuthor().getGenre().getTheBookType())) {
                System.out.println(b.getAuthor().getName().getLastName() + " usually wrote " + b.getAuthor().getGenre().getTheBookType() + " but wrote " + b.getTitle() + " which is " + b.getGenreString());
            }
        }
    }
}