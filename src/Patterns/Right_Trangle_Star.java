package Patterns;

import java.util.Scanner;

public class Right_Trangle_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q56- Right Triangle - Star

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
