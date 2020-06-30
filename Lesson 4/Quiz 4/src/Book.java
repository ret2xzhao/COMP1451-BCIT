// Quiz 4:
// Xin Zhao(A00898485)

public class Book {
    // Symbolic Constants:
    public static final String FIRST_BOOK_PUBLISHED_YEAR = "1455";

    // Instance Variables:
    private int yearPublished;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(int yearPublished, String title, String authorFirstName, String authorLastName) {
        setYearPublished(yearPublished);
        setTitle(title);
        setAuthorFirstName(authorFirstName);
        setAuthorLastName(authorLastName);
    }

    public void setYearPublished(int yearPublished) {
        if(yearPublished >= 0)
        {
            this.yearPublished = yearPublished;
        }
        else
        {
            System.out.println("Error: Invalid yearPublished.");
        }
    }

    public void setTitle(String title) {
        if(title != null && !title.isEmpty())
        {
            this.title = title.toUpperCase().charAt(0) + title.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid title.");
        }
    }

    public void setAuthorFirstName(String authorFirstName) {
        if(authorFirstName != null && !authorFirstName.isEmpty())
        {
            this.authorFirstName = authorFirstName.toUpperCase().charAt(0) + authorFirstName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid authorFirstName.");
        }
    }

    public void setAuthorLastName(String authorLastName) {
        if(authorLastName != null && !authorLastName.isEmpty())
        {
            this.authorLastName = authorLastName.toUpperCase().charAt(0) + authorLastName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid authorLastName.");
        }
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName.substring(0, authorLastName.length()-1).toLowerCase()
                                        + authorLastName.toUpperCase().charAt((authorLastName.length()-1));
    }

    public static String getActivity() {
        String activity = "Reading";
        return activity;
    }

    public String getDetails() {
        String details = this.title.toUpperCase() + " WAS PUBLISHED BY " + this.authorFirstName.toUpperCase() + " " 
                         + this.authorLastName.toUpperCase() + " IN " + this.getYearPublished() + "!"; 
        return details;
    }

    public String getAuthorInitials()
    {
        return authorFirstName.toUpperCase().charAt(0) + "." + authorLastName.toUpperCase().charAt(0) + ".";
    }
}