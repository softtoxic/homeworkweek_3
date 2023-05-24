package homeworkweek_3;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int Year = sc.nextInt();
        if (isLeapYear(Year)){
            System.out.println(Year + " is a leap year ");
        }else {
            System.out.println(Year + " is not a leap year ");
        }
    }
    public static boolean isLeapYear(int Year) {
if (Year % 4 == 0){
    if (Year % 100 == 0) {
        return Year % 400 == 0;
    }else{
            return true;

        }
    }else {
        return false;
    }
    }
}
