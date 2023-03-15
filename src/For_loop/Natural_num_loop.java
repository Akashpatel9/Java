package For_loop;

import java.util.Scanner;

public class Natural_num_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q30- Print natural number up to n.

        System.out.println("Enter n number ");
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            System.out.println(i);
        }



    }
}
