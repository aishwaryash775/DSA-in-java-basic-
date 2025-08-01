package conditionstatements;

import java.util.Scanner;

public class javabasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("enter your age:" +age );
        if (age>=18) {
            System.out.println("adult : vote,drive");
        }
        else if (age> 13 && age <18 ) {
            System.out.println("teenage");
        } else {
            System.out.println("not adult");
        }

    }
    }
