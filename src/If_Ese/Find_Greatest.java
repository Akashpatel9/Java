package If_Ese;

import java.util.Scanner;

public class Find_Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q11- Accept two numbers and print the greatest between them

        System.out.println("Enter 1 number");
        double number1 = sc.nextDouble();
        System.out.println("Enter 1 number");
        double number2 = sc.nextDouble();

        if(number1>number2){
            System.out.println(number1+" is greatest number");
        }else {
            System.out.println(number2+" is greatest number");
        }



    }
}
