package If_Ese;

import java.util.Scanner;

public class Gratest_Among_Them {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q20- Accept three numbers and print the greatest among them


        System.out.println("Enter number of a");
        int a = sc.nextInt();
        System.out.println("Enter number of b");
        int b = sc.nextInt();
        System.out.println("Enter number of c");
        int c = sc.nextInt();

        System.out.println();

        if (a>b&&a>c){
            System.out.println("the greatest among them = "+a);
        } else if (b>a&&b>c) {
            System.out.println("the greatest among them = "+b);
        }else {
            System.out.println("the greatest among them = "+c);
        }

    }
}
