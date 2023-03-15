package For_loop;

import java.util.Scanner;

public class Sum_Of_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q38- Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43


        System.out.println("Enter num");

        int n = sc.nextInt();
        int sum = 0;

        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        System.out.println("The sum of all factors of a number = "+sum);

    }
}
