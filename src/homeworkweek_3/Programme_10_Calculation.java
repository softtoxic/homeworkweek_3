package homeworkweek_3;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Programme_10_Calculation {
    public static void operation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float N1 = sc.nextFloat();
        System.out.println("Enter the second number : ");
        float N2 = sc.nextFloat();
        System.out.println("Enter any one operator ( +, -, *, /)  :  ");
        char symbol = sc.next().charAt(0);
        float result;
        if (symbol == '+') {
            result = N1 + N2;
            System.out.println("The addition is : " + result);
        } else if (symbol == '-') {
            result = N1 - N2;
            System.out.println("The subtraction is : " + result);
        } else if (symbol == '*') {
            result = N1 * N2;
            System.out.println("The multiplication is : " + result);

        }else if (symbol == '/') {
            result = N1 / N2;
            System.out.println("The division is : " + result);
        }else{
            System.out.println("Your input symbol is no correct ");
        }
    }

    public static void main(String[] args) {
        operation();
    }
}
