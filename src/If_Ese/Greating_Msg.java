package If_Ese;

import java.util.Scanner;

public class Greating_Msg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q12- Accept the gender from the user as char and print the respective greeting message
        //     Ex - Good Morning Sir (on the basis of gender)

        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);

        if(gender=='M'||gender=='m'){
            System.out.println("Good Morning Sir");
        }else if(gender=='F'||gender=='f'){
            System.out.println("Good Morning Mam");
        }else {
            System.out.println("Incorrect input");
        }



    }
}
