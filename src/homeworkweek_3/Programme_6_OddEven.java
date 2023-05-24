package homeworkweek_3;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */


import java.util.Scanner;

public class Programme_6_OddEven {
    public void oddEven (int N){
        if (N % 2 == 0){
            System.out.println(N + "   Number is an even number");
        }else {
            System.out.println(N + "   Number is an odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int N = sc.nextInt();
        Programme_6_OddEven obj = new Programme_6_OddEven();
        obj.oddEven(N);
    }

}
