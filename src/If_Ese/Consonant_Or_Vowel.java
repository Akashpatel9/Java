package If_Ese;

import java.util.Scanner;

public class Consonant_Or_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q27- Accept an english alphabet from user and check if it is a consonant or a vowel;

        System.out.println("Enter any Alphabet");
        char al= sc.next().charAt(0);


        /*

        if(al=='A'||al=='a'||al=='E'||al=='e'||al=='I'||al=='i'||al=='O'||al=='o'||al=='U'||al=='u'){
            System.out.println("This Alphabet is Vowel");
        }else if(al=='B'||al=='b'||al=='C'||al=='c'||al=='D'||al=='d'||al=='F'||al=='f'||al=='G'||al=='g'){
            System.out.println("This Alphabet is Consonant");
        }else if(al=='H'||al=='h'||al=='J'||al=='j'||al=='K'||al=='k'||al=='L'||al=='l'||al=='M'||al=='m'){
            System.out.println("This Alphabet is Consonant");
        }else if(al=='N'||al=='n'||al=='P'||al=='For_loop.print_Prime_nu'||al=='Q'||al=='q'||al=='R'||al=='r'||al=='S'||al=='s'){
            System.out.println("This Alphabet is Consonant");
        }else if(al=='T'||al=='t'||al=='V'||al=='v'||al=='W'||al=='w'||al=='X'||al=='x'||al=='Y'||al=='y'){
            System.out.println("This Alphabet is Consonant");
        } else if (al=='Z'||al=='z') {
            System.out.println("This Alphabet is Consonant");
        }else {
            System.out.println("Please enter correct input");
        }

        */

                      //or



        if(al=='A'||al=='a'||al=='E'||al=='e'||al=='I'||al=='i'||al=='O'||al=='o'||al=='U'||al=='u') {
            System.out.println("This Alphabet is Vowel");
        }else if(al>='B'&&al<='Z'||al>='b'&&al<='z'){
            System.out.println("This Alphabet is Consonant ");
        }else {
            System.out.println("Please enter correct input");
        }




    }
}
