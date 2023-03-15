package For_loop;

import java.util.Scanner;

public class Prime_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to check prime or not");
        int n =sc.nextInt();

        int count=0;

        if(n==1||n==0){
            System.out.println("not prime");
        }else {
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }if (count==1){
                System.out.println("it is prime");
            }else {
                System.out.println("not prime");
            }
        }

    }
}
