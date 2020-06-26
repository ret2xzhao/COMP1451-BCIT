package four;

public class Name
{
    private String first;
    private String last;

    public Name(String first, String last)
    {
        this.first = first;
        this.last  = last;
    }

    public String getFirst()
    {
        return first;
    }

    public String getLast()
    {
        return last;
    }

    public String getFullName()
    {
        return first.toUpperCase().charAt(0) + first.substring(1).toLowerCase() + " " +
               last.toUpperCase().charAt(0) + last.substring(1).toLowerCase();
    }

    public String getInitials()
    {
        return first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0) + ".";
    }

    public String getLastFirst()
    {
        return last.toUpperCase().charAt(0) + last.substring(1).toLowerCase() +
               ", " + first.toUpperCase().charAt(0) + first.substring(1).toLowerCase();
    }

    /**
     * @param first The first to set
     */
    public void setFirst(String first)
    {
        this.first = first;
    }

    /**
     * @param last The last to set
     */
    public void setLast(String last)
    {
        this.last = last;
    }
}