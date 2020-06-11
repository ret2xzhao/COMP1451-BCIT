package a00898485_lab2a;

import java.util.HashMap;

/**
 * StudentDatabase: The keys to the map will be student names, and the values will be an array of int containing that
 * student's quiz marks.
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/23/2020
 */
public class StudentDatabase {
    // Symbolic Constants:
    public static final int NUM_QUIZZES = 10;
    public static final int MIN_GRADE = 0;
    public static final int MAX_GRADE = 100;

    // Instance Variable:
    private HashMap<String, int[]> quizMarks;

    /**
     * Constructor for objects of class StudentDatabase.
     */
    public StudentDatabase(){
        quizMarks = new HashMap<String, int[]>();
    }

    /**
     * Return the properly-formatted name. The names will be formatted with the first letter in upper case and the 
     * rest in lower case.
     * @param name The name in String to be formatted.
     * @return A formatted name in String.
     */
    private String formatName(String name) {
        name = name.trim();
        String first = "";
        String rest = "";
        if(name != null && name.length() > 0) {
            first = name.substring(0,1).toUpperCase(); // get first letter
            if(name.length() > 1) {
                rest = name.substring(1).toLowerCase(); // get the rest
            }
        } 
        return first + rest;
    }

    /**
     * Add a student to the database and create a new array to hold that student's quiz marks(NUM_QUIZZES quizzes).
     * These marks will by default be set to MIN_GRADE.
     * @param studentName The student's name in String to be added.
     */
    public void addStudent(String studentName) {
        if(studentName != null && !studentName.isEmpty()) {
            boolean ifContain = quizMarks.containsKey(formatName(studentName));
            if(ifContain) {
                System.out.println("Already has this name.");
            }
            else {
                int[] marks = new int[NUM_QUIZZES];
                quizMarks.put(formatName(studentName), marks);
            }
        }
        else {
            System.out.println("ERROR: invalid input.");
        }
    }

    /**
     * @param studentName The student's name in String.
     * @return An array of quiz marks for this student.
     */
    public int[] getQuizzes(String studentName) {
        if(studentName != null && !studentName.isEmpty()) {
            boolean ifContain = quizMarks.containsKey(formatName(studentName));
            if(ifContain) {
                int[] marks = quizMarks.get(formatName(studentName));
                return marks;
            }
            else {
                System.out.println("Sorry, we don't have this student.");
            }
        }
        return null;
    }

    /**
     * Change the mark for the specified student. This method ensures the student exists in the database.
     * It also ensures the quiz to be changed is valid, and the mark is within the range MIN_GRADE to MAX_GRADE.
     * If anything is not valid it displays an appropriate error message.
     * @param studentName The student's name in String.
     * @param whichQuiz Indicate which quiz mark's index in int need to be changed.
     * @param newMark Indicate the new mark in int.
     */
    public void changeQuizMark(String studentName, int whichQuiz, int newMark) {
        if(whichQuiz >= 0 && whichQuiz <= NUM_QUIZZES-1) {
            if(newMark >= MIN_GRADE && newMark <= MAX_GRADE) {
                if(studentName != null && !studentName.isEmpty()) {
                    boolean ifContain = quizMarks.containsKey(formatName(studentName));
                    if(ifContain) {
                        getQuizzes(studentName)[whichQuiz] = newMark;
                    }
                    else {
                        System.out.println("Sorry, we don't have this student.");
                    }
                }
                else {
                    System.out.println("ERROR: Student name input is invalid.");
                }
            }
            else {
                System.out.println("ERROR: Quiz mark input is invalid.");
            }
        }
        else {
            System.out.println("ERROR: Quiz index input is invalid.");
        }
    }

    /**
     * Display the quiz marks for all students in the database.
     */
    public void showQuizMarks() {
        if(quizMarks != null){
            System.out.println("Students in the database:");
            for(String studentName : quizMarks.keySet()){
                int[] theMarks = getQuizzes(studentName);
                System.out.println("Quiz marks for: " + studentName);
                for(int i=0; i<NUM_QUIZZES; i++) {
                    System.out.print(theMarks[i] + " ");
                }
                System.out.println();
            }
        }
    }
}