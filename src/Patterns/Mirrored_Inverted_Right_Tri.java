package Patterns;

import java.util.Scanner;

public class Mirrored_Inverted_Right_Tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q61- Mirrored Inverted Right Triangle

        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
