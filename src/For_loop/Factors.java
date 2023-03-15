package For_loop;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("the factors of a number is = "+i);
            }
        }





    }
}
