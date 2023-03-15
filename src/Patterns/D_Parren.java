package Patterns;

import java.util.Scanner;

public class D_Parren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc .nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n+2;j++){
                if(j==1 || i==1&&j<=n || i==n&&j<=n || j==n+2&&i>1&&i<n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
