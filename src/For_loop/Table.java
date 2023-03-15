package For_loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q32- Take a number as input and print its table
        //       5 * 1 = 5
        //       5 * 2 = 10 ... up to 10 terms


        System.out.println("Enter number ");
        int n = sc.nextInt();
        int t;

        for(int i=1;i<=10;i++){
           t= n*i;
            System.out.println(n+" * "+i+" = "+t);
        }





    }
}
