package For_loop;

import java.util.Scanner;

public class Hello_N_Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q29- Accept an integer and Print hello world n times


        System.out.println("Enter how much time you print");
        int h = sc.nextInt();

        for(int i=0;i<h;i++){
            System.out.println("Hello World");
        }

    }
}
