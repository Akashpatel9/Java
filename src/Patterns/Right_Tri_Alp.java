package Patterns;

import java.util.Scanner;

public class Right_Tri_Alp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print((char)(j+64)+" ");


        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char c = (char)(j+64);
                System.out.print(c);
            }
            System.out.println();
        }


    }
}
