package Operators_Pratice;

import java.util.Scanner;

public class B_Scannerr {
    public static void main(String[] args) {

        //Q4- Accept the User's name, age and print in following manner
        //	Ex - Hello Shery, you are 12 years old.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String Name = sc.nextLine();

        System.out.println("Enter Your Age");
        int Age = sc.nextInt();

        System.out.println("Hello "+Name+", you are "+Age+" years old");

    }
}
