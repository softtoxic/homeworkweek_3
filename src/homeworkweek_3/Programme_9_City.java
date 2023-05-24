package homeworkweek_3;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry. Using switch statement
 */

import java.util.Scanner;

public class Programme_9_City {
    public void cityName(String alphabet) {
        switch (alphabet) {
            case "A":
                System.out.println("City name is Ahmedabad");
                break;
            case "B":
                System.out.println(" City name is : Bhavnagar");
                break;
            case "C":
                System.out.println("City name is : Chicago");
                break;
            case "D":
                System.out.println("City name is : Doha");
                break;
            case "E":
                System.out.println(" City name is : Edmonton");
                break;
            case "F":
                System.out.println(" City name is : Franca");
                break;
            default:
                System.out.println("Invalid data");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one alphabet from A to F");
        String name = sc.nextLine();
        Programme_9_City obj = new Programme_9_City();
        obj.cityName(name);
    }
}
