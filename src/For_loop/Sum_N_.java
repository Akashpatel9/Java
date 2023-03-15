package For_loop;

import java.util.Scanner;

public class Sum_N_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q33- Sum up to n terms.


        System.out.println("Enter N Number");
        int sum =0;
        int n = sc.nextInt();

        for (int i=0;i<=n;i++){
            sum+=i;
        }System.out.println(sum);



    }
}
