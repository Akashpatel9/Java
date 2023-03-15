package Whie_Loop;

import java.util.Scanner;

public class Seprate_Each_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int d=10;

    while (n>0) {
        System.out.println(n%d);
        n=n/d;
    }






    }
}
