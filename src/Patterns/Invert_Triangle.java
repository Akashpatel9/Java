package Patterns;

import java.util.Scanner;

public class Invert_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q63- Inverted Triangle

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=1;j<=i-1;j++) {
                System.out.print(" ");
            }for (int j=n;j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
