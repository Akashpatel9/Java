package Whie_Loop;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q45- Accept a number and check if it is a armstrong number
        //       Ex - 407 = 64 + 0 + 343 = 407
        //              153 = 1 + 125 + 27 = 153


        int n= sc.nextInt();

        // n value is stored in num
        int num=n;

        int sum ;
        double j=0;

        while (n!=0) {
            sum = n % 10;
            j =j+ Math.pow(sum,3);
            n = n / 10;
        }
            if(j==num) {
                System.out.println("it is a armstrong number");
            }else {
                System.out.println("not a armstrong number");
            }

    }
}
