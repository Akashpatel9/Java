package For_loop;

import java.util.Scanner;

public class Divisible_by {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //Q36- Print all the numbers which are either divisible by 3 or 5 in a range


        System.out.println("Enter number");
        int n = sc.nextInt();

       for(int i=0;i<=n;i++){
           if(i%3==0||i%5==0){
               System.out.println("the numbers which are either divisible by 3 or 5 in a range = "+i);
           }
       }







    }
}
