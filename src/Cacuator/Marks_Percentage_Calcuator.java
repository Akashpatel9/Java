package Cacuator;

import java.util.Scanner;

public class Marks_Percentage_Calcuator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q7- Accept the marks of Robert in three subjects Maths, Computer, English respectively (each out of 100 ),
        //    Write a program to calculate his total marks and percentage marks.

        System.out.println("Enter maths marks");
        float maths = sc.nextFloat();
        System.out.println("Enter english marks");
        float english = sc.nextFloat();
        System.out.println("Enter computer marks");
        float computer = sc.nextFloat();

        float total = maths+english+computer;
        float percentage = (total/300)*100;
        System.out.println("His total marks = "+total+" and percentage = "+percentage);



    }
}
