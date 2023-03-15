package If_Ese;

import java.util.Scanner;

public class Even_OR_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q14- Accept an integer and check whether it is an even number or odd.

        System.out.println("Enter Number");
        int a = sc.nextInt();

        if (a%2==0){
            System.out.println("it is a even number");
        }else {
            System.out.println("it is a odd number");
        }


    }
}
