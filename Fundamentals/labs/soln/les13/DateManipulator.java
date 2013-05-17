
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class DateManipulator {

    Date myDate;
    SimpleDateFormat simpleDF = new SimpleDateFormat("MM/dd/yyyy");

    public void parseDate(String dateString) {
        try {
            String formatDate;
            myDate = simpleDF.parse(dateString);
            System.out.println("Parse successful");
            System.out.println("Date with native format: " + myDate);
            formatDate = simpleDF.format(myDate);
            System.out.println("Formatted date: " + formatDate);
        }
        catch(ParseException ex){
            System.out.println(ex);
        }
    }
}
