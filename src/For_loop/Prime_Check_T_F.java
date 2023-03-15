package For_loop;

import java.util.Scanner;

public class Prime_Check_T_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q42- Check if the number is Prime or not.

        int n = sc.nextInt();
        boolean isprime = true;


        if (n == 1) {
            System.out.println("false");
        } else if (n == 2) {
            System.out.println("true");
        } else if (n % 2 == 0) {
            System.out.println("false");
        } else {
            for (int i = 3; i <n/2; i += 2) {
                if (n % i == 0){
                    isprime = false;
                break;
            }
            }
            System.out.println(isprime);
        }







    }
}
