
/*
Question : Write a Java program to get and display information (year, month, day, hour, minute)
                    of a default calendar
*/
package JAVA.Game;

import java.util.*;

public class Today_Calender 
{
    public static void main(String[] args) 
    {
        Calendar cal = Calendar.getInstance();

        System.out.println("Year: " + cal.get(Calendar.YEAR));

        System.out.println("Month: " + cal.get(Calendar.MONTH));

        System.out.println("Day: " + cal.get(Calendar.DATE));

        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
    }
}
