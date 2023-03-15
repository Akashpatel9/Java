package D0_While_Loop;

import java.util.Scanner;

public class Choice_Based_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q50- Make a choice based calculator using do while

        int cas;

        int a , b ;

        do{
            System.out.println("Enter number 1");
            a = sc.nextInt();
            System.out.println("Enter number 2");
            b = sc.nextInt();
            System.out.println("Enter 1 for=+ , Enter 2 for=- , Enter 3 for=* , Enter 4 for=/ , Enter 5 for=%");
            cas= sc.nextInt();

            switch (cas){
                case 1 -> System.out.println(a+b);
                case 2 -> System.out.println(a-b);
                case 3 -> System.out.println(a*b);
                case 4 -> {
                    if(b==0) {
                        System.out.println("Enter correct value");
                    }else {
                        System.out.println(a/b);
                    }
                }
                case 5 -> {
                    if(b==0) {
                        System.out.println("Enter correct value");
                    }else {
                        System.out.println(a%b);
                    }
                }
                default -> System.out.println("Please enter operators 1 to 5");
            }
            System.out.println();
            System.out.println("Enter 0 to repeat");
            cas = sc.nextInt();

        }while (cas==0);


    }
}
