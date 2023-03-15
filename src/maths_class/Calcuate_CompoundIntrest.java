package maths_class;

import java.util.Scanner;

public class Calcuate_CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q16- Accept the parameters and calculate the Compound Interest & print it on STDOUT (Use Math class methods)

        System.out.println("Enter principal amount");
        int principalamount = sc.nextInt();
        System.out.println("Enter time");
        float time = sc.nextFloat();
        System.out.println("Enter rate");
        float rate = sc.nextFloat();

        double compoundintrest  = principalamount*Math.pow((1+rate/100), time)-principalamount;




    }
}
