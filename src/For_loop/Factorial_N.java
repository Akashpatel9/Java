package For_loop;

import java.util.Scanner;

public class Factorial_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q34- Factorial of a number



        System.out.println("Enter number");
        int n = sc.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a number is ="+fact);


    }
}
