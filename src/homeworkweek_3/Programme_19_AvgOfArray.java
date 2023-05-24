package homeworkweek_3;

import java.util.Scanner;

/**
 *  Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_AvgOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array : ");
        int number = sc.nextInt();
        int[] array = new int[number];
        System.out.println("Enter number : ");
        for (int i = 0; i < number; i++){
            array[i] = sc.nextInt();
        }
        double average = averageOfArray(array);
        System.out.println(" Average value is : " + average);

    }
    public static double averageOfArray(int[] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return (double) sum / array.length;
    }
}
