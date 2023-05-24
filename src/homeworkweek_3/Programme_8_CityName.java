package homeworkweek_3;
/**
 *  Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme_8_CityName {
    public void cityName(String name){
        if (name.equals("A")){
            System.out.println(" City name is : Ahmedabad");
        }else if (name.equals("B")){
            System.out.println(" City name is : Bhavnagar");
        } else if (name.equals("C")) {
            System.out.println(" City name is : Chicago");
        } else if (name.equals("D")) {
            System.out.println(" City name is : Doha" );
        } else if (name.equals("E")) {
            System.out.println(" City name is : Edmonton");
        } else if (name.equals("F")) {
            System.out.println(" City nam eis : Franca");
        }else {
            System.out.println(" We don't have any city like that");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet from A to F : ");
        String city = sc.nextLine();
        Programme_8_CityName obj = new Programme_8_CityName();
        obj.cityName(city);
    }
}
