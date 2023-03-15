package Patterns;

import java.util.Scanner;

public class Mirrared_Tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q60- Mirrored Right Triangle



        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=i;j<=n-1;j++){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
