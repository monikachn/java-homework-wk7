package homeworkwk7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not.
 */
public class LeapYearOrNotPro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a year");
        int year = input.nextInt();
        input.close();
        boolean x =(year % 4)==0;
        boolean y = (year% 100)!=0;
        boolean z =(year% 100 == 0) && (year % 400 == 0);
        if (x && (y || z)){
            System.out.println( year  + "This is leap year" );
        }else {
            System.out.println( year  + "This is not leap year" );
        }

    }


}
