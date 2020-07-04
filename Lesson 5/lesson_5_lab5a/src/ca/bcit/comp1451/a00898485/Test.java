package ca.bcit.comp1451.a00898485;

/**
 * Class Test
 *
 * @author Xin Zhao (A00898485) with Kirill Kuklin
 * @version 1.0
 */

public class Test {
    public static void main(String[] args){
        new Test().test();
    }

    public void test() {
        School school = new School();
        school.printPresident();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        school.printStudents();
    }
}