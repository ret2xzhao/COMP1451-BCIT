package ca.bcit.comp1451.a00898485;

/**
 *
 * @author Xin Zhao (A00898485) with Darshit Falgunbhai
 * @version 1.0
 */

public class Test
{
    public static void main(String[] args)
    {
        new Test().test();
    }

    public void test()
    {
        Date date1  = new Date(1600, "January", 1);   // Saturday
        Date date2  = new Date(1700, "January", 1);   // Friday
        Date date3  = new Date(1900, "February", 28); // Wednesday
        Date date4  = new Date(1904, "February", 29); // Monday
        Date date5  = new Date(1950, "March", 20);    // Monday
        Date date6  = new Date(1960, "December", 31); // Saturday
        Date date7  = new Date(1989, "August", 16);   // Wednesday
        Date date8  = new Date(2012, "October", 31);  // Wednesday
        Date date9  = new Date(2014, "March", 1);     // Saturday
        Date date10 = new Date(2020, "June", 18);     // Thursday

        System.out.println("------------------------------------------------");

        date1.displayDate();
        date2.displayDate();
        date3.displayDate();
        date4.displayDate();
        date5.displayDate();
        date6.displayDate();
        date7.displayDate();
        date8.displayDate();
        date9.displayDate();
        date10.displayDate();
    }
}