package helloaish;

import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sums
        System.out.print("enter your number:");
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int  c = sc.nextInt();
        int sumofnumber= a+b+c;
        System.out.println(sumofnumber);
// simple interest
        System.out.print("enter principle value:");
        int p = sc.nextInt();
        System.out.print("enter rate vale:");
        int r = sc.nextInt();
        System.out.print("enter time value:");
        int t = sc.nextInt();
        int si = p*r*t/100;
        System.out.println(si);

    }
}
