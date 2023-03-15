package For_loop;

import java.util.Scanner;

public class Sum_Fac_Per_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q39- Accept a number and check if it a perfect number or not.
        //      A number whose sum of factors(excluding number itself)

        System.out.println("Enter any num");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n/2;i++) {
            if (n%i==0)
                sum += i;
        }
            if (sum==n){
                System.out.println("per");
            } else {
                System.out.println("not");
            }


    }
}
