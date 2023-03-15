package If_Ese;

import java.util.Scanner;

public class Valid_For_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q15- Accept name and age from the user. Check if the user is a valid voter or not.
        //      Vaid - Hello Shery, You are a valid voter.
        //      Invalid - Sorry Shery, you can't cast the vote.
        //	Part 2 - Print after how many years the user will be eligible


        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>18&&age<100){
            System.out.println("Hello "+name+", You are a valid voter");
        }else {
            System.out.println("Sorry "+name+", you can't cast the vote");
            System.out.println("After "+(18-age)+" years "+name+" will be eligible");
        }


    }
}
