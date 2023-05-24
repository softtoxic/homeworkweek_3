package homeworkweek_3;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Programme_7_Commission {
    public int salesId;
    public String sellerName;
    public double commissionRate;
    public double salesAmount;
    public double commission;

    public void enterData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales Id      : ");
        salesId = sc.nextInt();
        System.out.println("Enter seller name   : ");
        sellerName = sc.next();
        System.out.println("Enter sales amount  : ");
        salesAmount = sc.nextDouble();
        System.out.println("Enter basic salary  : ");
        double basicSalary = sc.nextDouble();
        commission(basicSalary);
        data();

    }

    public void commission(double basicSalary) {
        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >=20000) {
            commissionRate = 0.10;
        } else if (salesAmount >=10000) {
            commissionRate = 0.05;
        }else {
            commissionRate = 0.02;
        }
        commission = salesAmount * commissionRate;
        double totalSalary = basicSalary + commission;
        System.out.println(" Total salary is  : " + totalSalary);
            }
            public void data(){
                System.out.println(" Sales Id         : " + salesId);
                System.out.println(" Seller's name    : " + sellerName);
                System.out.println(" Sales amount     : " + salesAmount);
                System.out.println(" Commission rate  : " + (commissionRate*100) + " % ");
                System.out.println(" Commission       : " + commission );
            }

    public static void main(String[] args) {
        Programme_7_Commission commission1 = new Programme_7_Commission();
        commission1.enterData();
    }
}
