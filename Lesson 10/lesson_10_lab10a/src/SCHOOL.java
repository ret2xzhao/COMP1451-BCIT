import java.util.HashMap;

/**
 * Class SCHOOL
 *
 * @author Xin Zhao (A00898485) with Rajat
 * @version 1.0
 */

class SCHOOL {
    // Instance Variables:
    public Person president = new Person("KATHY", "kinloch", 1960, gender.female);
    public HashMap<String, Student> students = new HashMap<String, Student>();
    public HashMap<String, BCITSTUDENT> BCITstudents = new HashMap<String, BCITSTUDENT>();

    /**
     * Constructor for objects of class SCHOOL.
     */
    public SCHOOL() {
        Person  p1 = new Person("OPRAH", "WINFREY", 1954, gender.female);
        Person  p2 = new Person("tiger", "woods",   1975, gender.male);
        Student s1 = new Student("MARK", "ZUCKERBERG", 1984, gender.male,   "12345678", "computer science");
        Student s2 = new Student("michelle", "obama",  1964, gender.female, "98765432", "law");
        BCITSTUDENT bcits1 = new BCITSTUDENT("MARKUS", "FRIND",     1979, gender.male,   "A12345678", "computer science", campus.Downtown);
        BCITSTUDENT bcits2 = new BCITSTUDENT("gloria", "macarenko", 1962, gender.female, "A88877777", "journalism",       campus.Burnaby);

        students.put("12345678", s1);
        students.put("98765432", s2);
        BCITstudents.put("A12345678", bcits1);
        BCITstudents.put("A88877777", bcits2);
    }
}