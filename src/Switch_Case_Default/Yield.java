package Switch_Case_Default;

import java.util.Scanner;

public class Yield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);


       String res  =  switch(ch){

            case 'a' ,'e','i','o','u'-> {
                System.out.println("fdhg");
                yield "vowel";
            }
            case 'A','E','I','O','U' -> "vowel";

            default ->"Consonent";

        };
       System.out.println(res);


    }
}
