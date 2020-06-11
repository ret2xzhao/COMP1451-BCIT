package a00898485_lab2a;

/**
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/23/2020
 * 
 */

public class Driver{
    /**
     * @param args
     */
    public static void main(String[] args){
        new Driver().test();
    }

    /**
     * Creates students and add their quiz marks to the database for testing.
     */
    public void test(){
        // Initializing a StudentDatabase:
        StudentDatabase studentDatabase = new StudentDatabase();

        // Adding two students to our database:
        studentDatabase.addStudent(" JEFF BEZOS");
        studentDatabase.addStudent("bILL GATES");
        studentDatabase.addStudent("BILL GATES");
        studentDatabase.showQuizMarks();
        studentDatabase.getQuizzes("ABC");
        System.out.println();

        // Changing quiz marks for student1:
        studentDatabase.changeQuizMark("JEFF BEZOS", -1, 100);
        studentDatabase.changeQuizMark("JEFF BEZOS", 10, 100);
        studentDatabase.changeQuizMark("JEFF BEZOS", 0, 101);
        studentDatabase.changeQuizMark("JEFF BEZOS", 2, -1);
        studentDatabase.changeQuizMark("JEFF BEZOS", 3, 100);
        studentDatabase.changeQuizMark("", 7, 94);
        studentDatabase.changeQuizMark(null, 8, 93);
        studentDatabase.changeQuizMark("JEFF BEZOS", 9, 93);

        // Changing quiz marks for student2:
        studentDatabase.changeQuizMark("BILL GATES", 2, 97);
        studentDatabase.changeQuizMark("BILL GATES", 3, 98);
        studentDatabase.changeQuizMark("BILL GATES", 7, 99);
        System.out.println();

        // Changing quiz mark for a non-exist student
        studentDatabase.changeQuizMark("non-exist", 7, 99);
        System.out.println();

        // Displaying the quiz marks for all students in the database:
        studentDatabase.showQuizMarks();
    }
}