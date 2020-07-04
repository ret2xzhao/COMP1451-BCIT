package ca.bcit.comp1451.a00898485;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

/**
 * Class School
 *
 * @author Xin Zhao (A00898485) with Kirill Kuklin
 * @version 1.0
 */

public class School {
    // Instance Variables:
    private Person president = new Person("KATHY", "kinloch", 1960, Gender.FEMALE);
    private HashMap<String, Student> students = new HashMap<String, Student>();

    /**
     * Constructor for objects of class School.
     */
    public School() {
        Person  p1 = new Person("OPRAH", "WINFREY", 1954, Gender.FEMALE);
        Person  p2 = new Person("tiger", "woods", 1975, Gender.MALE);
        Student s1 = new Student("MARK", "ZUCKERBERG", 1984, Gender.MALE, "12345678", "computer science");
        Student s2 = new Student("michelle", "obama", 1964, Gender.FEMALE, "98765432", "law");
        BCITStudent bcits1 = new BCITStudent("MARKUS", "FRIND", 1979, Gender.MALE, "A98765432", "computer science", Campus.Downtown);
        BCITStudent bcits2 = new BCITStudent("gloria", "macarenko", 1962, Gender.FEMALE, "A88877777", "journalism", Campus.Burnaby);

        students.put("12345678", s1);
        students.put("98765432", s2);
        students.put("A98765432", bcits1);
        students.put("A88877777", bcits2);
    }

    /**
     * Prints the details of the president.
     */
    public void printPresident() {
        president.printDetails();
    }

    /**
     * Prints the details of all the students.
     */
    public void printStudents() {
        Set<Map.Entry<String, Student>> set = students.entrySet();
        for(Map.Entry<String, Student> student : set){
            student.getValue().printDetails();
        }
    }
}