package For_loop;

import java.util.Scanner;

public class N_To_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q31- Reverse for loop. Print n to 1.


        System.out.println("Enter n number");
        int n = sc.nextInt();

        for(int i=n;i>0;i--){
            System.out.println(i);
        }



    }
}
