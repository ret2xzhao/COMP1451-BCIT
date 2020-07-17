package ca.bcit.comp1451.a00898485;

/**
 * interface Employable
 *
 * @author Xin Zhao (A00898485) with Nazar Poverlo
 * @version 1.0
 */

public interface Employable {
    public String getDressCode();
    public boolean isPaidSalary();
    public boolean postSecondaryEducationRequired();
    public String getWorkVerb();
    default public boolean getsPaid(){
        return true;
    }
}