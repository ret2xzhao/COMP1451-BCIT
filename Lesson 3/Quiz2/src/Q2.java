import java.util.Scanner;

public class Q2 {
    /**
     * 2.Write a method with the signature int getUserInputInt() which returns the value of the integer a user typed in the
     * console, and returns -1 if the user typed a non-integer String.
     */
    public Q2() {}

    public int getUserInputInt() {
        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in);

        int userInt;
        String userString;
        System.out.print("Input the number:");

        if(keyboardScanner.hasNextInt()) // integer
        {
            userInt = keyboardScanner.nextInt();
            System.out.println("You input is " + userInt);
            return userInt;
        }
        else // not an integer
        {
            userString = keyboardScanner.next();
            System.err.println(userString + " is an error");
            return -1;
        }
    }
}