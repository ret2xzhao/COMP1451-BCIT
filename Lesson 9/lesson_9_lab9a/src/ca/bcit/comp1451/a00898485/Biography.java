package ca.bcit.comp1451.a00898485;

/**
 * class Biography
 *
 * @author Xin Zhao (A00898485) with Man Lee
 * @version 1.0
 */

final public class Biography extends Book{
    // Instance Variables:
    private Name subject;

    /**
     * Constructor for objects of class Biography.
     * @param  authorName    A  Name to set the author's name of a Biography.
     * @param  title         A  String to set the title of a Biography.
     * @param  yearPublished An integer to set the year published of a Biography.
     * @param  subject       A  Name to set the subject of the Biography.
     * @throws InvalidArgumentException
     * @throws InvalidBookDateException
     */
    public Biography(Name authorName, String title, int yearPublished, Name subject)
        throws InvalidArgumentException, InvalidBookDateException {
        super(authorName, title, yearPublished);
        setSubject(subject);
    }

    /**
     * @return The subject of a Biography in Name.
     */
    final public Name getSubject() {
        return this.subject;
    }

    /**
     * Sets the subject of a Biography.
     * @param subject A Name to set the subject of a Biography.
     * @throws InvalidArgumentException
     */
    final public void setSubject(Name subject) throws InvalidArgumentException {
        if(subject == null) {
            throw new InvalidArgumentException("Error: Invalid Biography::subject.");
        }
        else {
            this.subject = subject;
        }
    }

    /**
     * @return An integer to indicate the hash code value for the object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
        Biography other = (Biography) obj;
        if (this.getSubject() == null) {
            if (other.getSubject() != null)
                return false;
        }
        if(this.getSubject().equals(other.getSubject())){
            return true;
        }
        else {
            return false;
        }
    }
}