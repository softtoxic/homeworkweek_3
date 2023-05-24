package homeworkweek_3;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class Programme_16_NumberStatus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        double number = sc.nextInt();
        numberType(number);
    }
    public static void numberType(double number){
        if (number > 0){
            System.out.println("The number is positive");
        } else if (number<0) {
            System.out.println("The number is negative");
        }else {
            System.out.println("Number is 0");
        }
    }

}
