package Cacuator;

import java.util.Scanner;

public class Simpe_Intrest_Cacuator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q9- Accept the Principal amount, time & rate of interest and calculate the Simple Interest

        System.out.println("Enter Principal amount");
        float Principal = sc.nextFloat();
        System.out.println("Enter rate of %");
        float rate = sc.nextFloat();
        System.out.println("Enter time in weeks");
        float time = sc.nextFloat();


        float SimpleIntrest  =(Principal*rate*time)/100;

        System.out.println("The Simple Interest is = "+SimpleIntrest);
    }
}
