package homeworkweek_3;
/**
 *  Write a Java program to test if an array contains a specific value.
 */

import java.util.Scanner;

public class Programme_20_ArrayValue {
    public int[] array;
    public Programme_20_ArrayValue(int[] array){
        this.array = array;
    }
    public boolean contains(int value){
        for (int number : array){
            if (number == value){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter final value : ");
        int finalValue = sc.nextInt();
        Programme_20_ArrayValue obj = new Programme_20_ArrayValue(array);
        boolean containValue = obj.contains(finalValue);
        if (containValue){
            System.out.println("The array contains value is : " + finalValue);
        }else{
            System.out.println("The array does not contains value :" + finalValue);
        }

    }
}
