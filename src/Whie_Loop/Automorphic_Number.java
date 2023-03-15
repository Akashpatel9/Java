package Whie_Loop;

import java.util.Scanner;

public class Automorphic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q48- Automorphic number 5 = 25 = 625 = 390625

        int n= sc.nextInt();

        int fact_nu,fact_sq=0;

        int com_nu=0;
        int com_sq=0;

        int squar=(int)Math.pow(n,2);


        while (n!=0){
           fact_sq =squar%10;
           fact_nu =n%10;

           com_nu=com_nu*10+fact_nu;
           com_sq=com_sq*10+fact_sq;

            squar/=10;
            n/=10;
        }
        if(com_sq==com_nu){
            System.out.println("it is");
        }else {
            System.out.println("not");
        }





    }
}
