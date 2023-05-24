package homeworkweek_3;
/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme_1_OddEven {
    public static String isOddOrEven(int N){
        String result = (N % 2 == 0)? "even" : "odd";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int N =sc.nextInt();
        String result = isOddOrEven(N);
        System.out.println(N+ " is an " + result + " number ");
    }
}
