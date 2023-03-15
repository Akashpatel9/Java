package Patterns;

import java.util.Scanner;

public class V_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q65- V - Min Height = 3

        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n*2;j++){
                if(j==i||j==n*2-i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
