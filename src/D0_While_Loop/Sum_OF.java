package D0_While_Loop;

import java.util.Scanner;

public class Sum_OF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q51- Write a program to print the sum of negative numbers,
        // sum of positive even numbers and
        // the sum of positive odd numbers
        //       from a list of numbers (N) entered by the user.
        //       The list terminates when the user enters a zero.



        System.out.println("Enter number list");
        int n;

        int neg=0;
        int odd=0;
        int eve=0;

       do{
           n=sc.nextInt();
           if(n<=0){
               neg+=n;
           }if (n%2==0&&n>0){
               eve+=n;
           }if (n%2!=0&&n>0){
               odd+=n;
           }
           System.out.println("Enter any number or enter 0 to terminate list");
       }while (n!=0);
        System.out.println(n);

        System.out.println("the sum of negative numbers = "+neg);
        System.out.println("sum of positive even numbers = "+eve);
        System.out.println("the sum of positive odd numbers = "+odd);


    }
}
