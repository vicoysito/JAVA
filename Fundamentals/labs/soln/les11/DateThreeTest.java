/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DateThreeTest {

    public static void main(String args[]) {
        DateThree dateObj = new DateThree();
        dateObj.setMonth(6);
        dateObj.setDay(12);
        dateObj.setYear(2011);

        System.out.println("The date is: " + dateObj.getMonth() + "/" 
                + dateObj.getDay() + "/" + dateObj.getYear());

        // Challenge Practice 11-2
        //Test with valid values for  month, day and year 
        dateObj.setDate(30, 12, 2011);
        dateObj.displayDate();

        //Test with invalid value for month 14
        dateObj.setDate(30, 14, 2011);
        dateObj.displayDate();

        //Test with invalid value for day 35
        dateObj.setDate(35, 5, 2011);
        dateObj.displayDate();

        //Test with invalid value for year 200
        dateObj.setDate(30, 10, 200);
        dateObj.displayDate();
    } // end main
} // end class
