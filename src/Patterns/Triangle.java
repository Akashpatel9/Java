package Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Q62 - Triangle

        int n = sc.nextInt();


        for(int i=1;i<=n;i++){
            for (int j=i;j<=n-1;j++){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
