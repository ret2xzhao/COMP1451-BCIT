package ca.bcit.comp1451.a00898485;

import java.util.Random;

/**
 *
 * @author Xin Zhao (A00898485) with Rajat
 * @version 1.0
 */

public class Mathematics
{
    // Symbolic Constants:
    public static final double PI = 3.14159;
    public static final double ONE_FOOT_TO_KILOMETER_RATIO = 0.0003048;
    public static final int OFFSET = 11;
    public static final int FIFTEEN = 15;

    /**
     * Constructor for objects of class Mathematics.
     */
    public Mathematics()
    {}

    /**
     * @param radius A double to set the radius of a circle.
     * @return The area of a circle.
     */
    public static double getCircleArea(double radius)
    {
        double area = PI * radius * radius;
        return area;
    }

    /**
     * @param length A double to set the length of a square.
     * @return The area of a square.
     */
    public double getSquareArea(double length)
    {
        double area = length * length;
        return area;
    }

    /**
     * @param a A double number.
     * @param b A double number.
     * @return The sum of two double numbers.
     */
    public double add(double a, double b)
    {
        double sum = a + b;
        return sum;
    }

    /**
     * @param a A double number.
     * @param b A double number.
     * @return The product of two double numbers.
     */
    public double times(double a, double b)
    {
        double product = a * b;
        return product;
    }

    /**
     * @param a A double number.
     * @param b A double number.
     * @return The difference of two double numbers.
     */
    public double subtract(double a, double b)
    {
        double difference = a - b;
        return difference;
    }

    /**
     * @param a A double number.
     * @param b A double number.
     * @return The division of two double numbers.
     */
    public int divide(double a, double b)
    {
        int division;
        if(b == 0)
        {
            return 0;
        }
        else
        {
            division = (int) (a / b);
        }
        return division;
    }

    /**
     * @param number An integer number.
     * @return The absolute value of an integer number.
     */
    public int absoluteValue(int number)
    {
        if(number >= 0)
        {
            return number;
        }
        else
        {
            return -number;
        }
    }

    /**
     * @return a random number between ten and twenty but not fifteen.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen()
    {
        int result;
        Random r = new Random();
        do
        {
            result = r.nextInt(OFFSET) + OFFSET-1;
        }while(result == FIFTEEN);
        return result;
    }

    /**
     * @param number A double number.
     * @return A double number that convert the input number from feet to kilometers.
     */
    public double convertFeetToKilometers(double number)
    {
        double result = number * ONE_FOOT_TO_KILOMETER_RATIO;
        return result;
    }

    /**
     * @param number An integer number.
     * @return An Integer double the input number.
     */
    public Integer doubleTheNumber(int number)
    {
        Integer answer = (Integer)(number * 2);
        return answer;
    }
}