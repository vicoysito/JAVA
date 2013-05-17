/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victordespinosavazquez
 */
public class Person {
    
    int years=1, days;
    long min,seg,mili;
    
    public void calculateAge(){
    
        days = years*365;
        seg = days *24*60*60;
        min = seg /60;
        mili = seg * 1000;
    
        System.out.println("You are "+ years + " years old");
        System.out.println("You are "+ days + " days old");
        System.out.println("You are "+ min + " minutes old");
        System.out.println("You are "+ seg + " seconds old");
        System.out.println("You are "+ mili + " milliseconds old");
    
    }
    
    
}
