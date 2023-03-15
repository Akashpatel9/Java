package Switch_Case_Default;

import java.util.Scanner;

public class Vowel_Con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q53- Question 27 using Switch


        char ch = sc.next().charAt(0);

         switch(ch) {

             case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");

             case 'A', 'E', 'I', 'O', 'U' -> System.out.println("vowel");

             default -> System.out.println("Consonent");

         }
        System.out.println(ch);


    }
}
