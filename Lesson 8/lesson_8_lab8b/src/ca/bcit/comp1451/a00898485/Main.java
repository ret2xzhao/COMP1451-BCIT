package ca.bcit.comp1451.a00898485;

/**
 * class Main
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Employees e = new Employees();
        e.displayInfo();
        System.out.println("------------------------------------------------------------------------------------------------");
        e.displayHockeyPlayer();
        System.out.println("------------------------------------------------------------------------------------------------");
        e.displayProfessor();
        System.out.println("------------------------------------------------------------------------------------------------");
        e.displayParent();
        System.out.println("------------------------------------------------------------------------------------------------");
        e.displayGasStationAttendant();
        System.out.println("------------------------------------------------------------------------------------------------");
        e.hockeyPlayerCompareAndDisplay();
        e.professorCompareAndDisplay();
        e.parentCompareAndDisplay();
        e.gasStationAttendantCompareAndDisplay();
    }
}