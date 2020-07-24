import java.util.Map;
import java.util.Set;

/**
 * Class RUN
 *
 * @author Xin Zhao (A00898485) with Rajat
 * @version 1.0
 */

class RUN {
    public static void main(String[] args){
        SCHOOL school = new SCHOOL();

        // President:
        if(school.president.GENDER == gender.female) {
            school.president.printFemaleDetails();
        }
        if(school.president.GENDER == gender.male) {
            school.president.printMaleDetails();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        // Student:
        Set<Map.Entry<String, Student>> set1 = school.students.entrySet();
        for(Map.Entry<String, Student> student : set1){
            if(student.getValue().GENDER == gender.female) {
                student.getValue().printFemaleDetails();
            }
            if(student.getValue().GENDER == gender.male) {
                student.getValue().printMaleDetails();
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        // BCITSTUDENT:
        Set<Map.Entry<String, BCITSTUDENT>> set2 = school.BCITstudents.entrySet();
        for(Map.Entry<String, BCITSTUDENT> student : set2){
            if(student.getValue().GENDER == gender.female) {
                student.getValue().printFemaleDetails();
            }
            if(student.getValue().GENDER == gender.male) {
                student.getValue().printMaleDetails();
            }
        }
    }
}