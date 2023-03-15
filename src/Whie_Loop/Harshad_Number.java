package Whie_Loop;

import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Q47- Accept a number and check if it is a Harshad number
        //      Harshad number is a number or an integer which is completely divisible by sum of  its digits.
        //      Ex - 24 = Sum of 2+4 = 6 & 24%6 = 0


        int n= sc.nextInt();
        int num=n;
        int sum =0;
        int m=0;

        while (n!=0){
          sum=n%10;
          n=n/10;
          m=m+sum;
        }
        if(num%m==0){
            System.out.println("it is a Harshad number");
        }else {
            System.out.println("it is not a Harshad number");
        }

    }
}
