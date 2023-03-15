package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "car";
        String b = "ra";

        boolean ans = false;

        if (a.length() == b.length()) {
            a.toUpperCase();
            b.toUpperCase();

            char[] arra = a.toCharArray();
            char[] arrb = b.toCharArray();
            Arrays.sort(arra);
            Arrays.sort(arrb);


            if(Arrays.equals(arra,arrb)){
                System.out.println("equla");
            }else {
                System.out.println("not");
            }
        }else {
            System.out.println("not");
        }

    }
}
