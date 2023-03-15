package If_Ese;

import java.util.Scanner;

public class Equal_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q10- Take 3 int inputs from user and check and print the result.
        //	all are equal
        //	any of two are equal
        //	( use && || )


        System.out.println("Enter input 1");
        int input1 = sc.nextInt();
        System.out.println("Enter input 2");
        int input2 = sc.nextInt();
        System.out.println("Enter input 3");
        int input3 = sc.nextInt();

        if(input1==input2&&input1==input3){
            System.out.println("All are equal");
        } else if (input1 == input2 || input1 == input3 || input3==input2) {
            System.out.println("Any of two are equal");
        }else {
            System.out.println("not any equal");
        }


    }
}
