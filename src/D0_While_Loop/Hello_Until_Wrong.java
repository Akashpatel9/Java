package D0_While_Loop;

import java.util.Scanner;

public class Hello_Until_Wrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Q49- Print hello until user gives wrong input using do while

        int n ;

        do {
            System.out.println("HeLLo WorLd");
            System.out.println("Press 0 to repeat");
            n= sc.nextInt();
        }while (n==0);






    }
}
