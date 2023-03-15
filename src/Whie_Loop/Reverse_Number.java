package Whie_Loop;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q43- Accept a number and print its reverse

        int n = 1800;
        int sum , r =0;

        while(n!=0){
            sum=n%10;
            r=r*10+sum;
            n=n/10;
        }
        System.out.println(r);

    }
}
