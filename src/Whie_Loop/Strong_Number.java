package Whie_Loop;

import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q 46- Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
        //       Ex- 145 = 1! + 4! + 5! = 145

                int n= sc.nextInt();
                int num =n;

                int remainder ;
                int Sum=0;

                while (n>0) {
                    int fact=1;
                    remainder = n % 10;
                    for (int i=1;i<=remainder;i++) {
                        fact*=i;
                    }
                    Sum = Sum+fact;
                    n = n / 10;
                }
                    if (Sum==num) {
                        System.out.println("it is a strong number");
                    } else {
                        System.out.println("it is not a strong number ");
                    }




    }
}
