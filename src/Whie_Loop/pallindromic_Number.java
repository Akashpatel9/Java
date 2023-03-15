package Whie_Loop;

import java.util.Scanner;

public class pallindromic_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Q44- Accept a number and check if it is a pallindromic number (If number and its reverse are equal)
        //       Ex - 12321 - Rerverse - 12321

        int n= sc.nextInt();
        int num=n;


        int sum;
        int temp=0;

        while (n!=0){
            sum = n%10;
            temp= temp*10+sum;
            n=n/10;
        }
        if(temp==num){
            System.out.println("it is a pallindromic number");
        }else {
            System.out.println("it is not a pallindromic number");
        }






    }
}
