package conditionstatements;

import java.util.Scanner;

public class largestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first  value : ");
        int num1 = sc.nextInt();
        System.out.println("enter your Second  value : ");
        int num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println("The largest number is:" + num1);
        }else {
            System.out.println("The largest number is:" + num2);
        }
        sc.close();
    }
}
