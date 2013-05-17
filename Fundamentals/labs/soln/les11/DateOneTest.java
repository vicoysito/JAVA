/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DateOneTest {

  public static void main(String args[]) {
    DateOne date =  new DateOne();
    date.day = 28;
    date.month = 07;
    date.year = 2011;
    System.out.println("DateOne: "+ date.day+ "/" +date.month  
          + "/" + date.year);
    
  }// end main

} // end class

