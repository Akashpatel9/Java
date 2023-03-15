package Whie_Loop;

import java.util.Scanner;

public class Sum_Seperate_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q 41- Sum of digits of a number, 936 = 18

        System.out.println("Enter digits");
        int n= sc.nextInt();
        int sum = 0;

        while (n!=0) {
            sum = sum+n%10;
            n=n/10;
        }System.out.println("Sum of digits of a number = "+sum);




    }
}
