package String;

import java.util.Scanner;

class Saperate{
    public void seprtae(String c){
        for (int i=0;i<c.length();i++){
            System.out.println(c.charAt(i));
        }
    }
}
public class Print_Each_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.next();
        Saperate s = new Saperate();
        s.seprtae(c);

    }
}
