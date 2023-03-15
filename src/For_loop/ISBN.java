package For_loop;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Q26.The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book.


        System.out.println("Input the ISBN code");
         long n= sc.nextLong();


        int i;
        long d,f,sum=0;

        for(i=1;i<10;i++) {
            d = n % 10;
            n = n / 10;
            f = d * i;
            sum += f;
        }if(i!=10){
            System.out.println("Illegal ISBN");
        }
            else if (sum % 11 == 0) {
                System.out.println("Legal ISBN");
            } else{ System.out.println("Illegal ISBN");
        }



    }
}
