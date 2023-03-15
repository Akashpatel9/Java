package Patterns;

import java.util.Scanner;

public class Diamond_Or_Kite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q64- Diamond or Kite

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=i;j<=n-1;j++){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();

        }for (int i=1;i<=n-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }for (int k=n-1;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
