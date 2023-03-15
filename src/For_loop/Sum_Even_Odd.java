package For_loop;

import java.util.Scanner;

public class Sum_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q35- Print the sum of all even & odd numbers in a range separately.


        System.out.println("Enter number ");
        int n= sc.nextInt();
        int evensum =0;
        int oddsum=0;


        for (int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddsum += i;
            }
        }
        System.out.println("sum of all even="+evensum);
        System.out.println("sum of all odd ="+oddsum);




    }
}
