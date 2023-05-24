package homeworkweek_3;
/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Programme_12_categories {
    public static void main(String[] args) {
        Programme_12_categories obj = new Programme_12_categories();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value : ");
        String value = sc.next();
        obj.inputValue(value);
    }
    public void inputValue(String value){
        if (value.matches("[0-9]+")){
            System.out.println("Your value is a number ");
        } else if (value.matches("[a-zA-Z]+")) {
            System.out.println("Your value is alphabet ");
        }else {
            System.out.println("Your value is symbol ");
        }
    }
}
