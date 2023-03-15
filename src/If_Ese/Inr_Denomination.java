package If_Ese;

import java.util.Scanner;

public class Inr_Denomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q25-System.out.println(bill);

        System.out.println("Enter your amount");
        long inr = sc.nextLong();

        long notes =0L;

        if(inr>=2000){
            notes = inr/2000;
            System.out.println("2000 => "+notes);
            inr=2000%inr;
        }if(inr>=500){
            notes = inr/500;
            System.out.println("500 => "+notes);
            inr=500%inr;
        }if(inr>=200){
            notes = inr/200;
            System.out.println("200 => "+notes);
            inr=200%inr;
        }if(inr>=100){
            notes = inr/100;
            System.out.println("100 => "+notes);
            inr=100%inr;
        }if(inr>=50){
            notes = inr/50;
            System.out.println("50 => "+notes);
            inr=50%inr;
        }if(inr>=20){
            notes = inr/20;
            System.out.println("20 => "+notes);
            inr=20%inr;
        }if(inr>=10){
            notes = inr/10;
            System.out.println("10 => "+notes);
            inr=10%inr;
        }if(inr>=5){
            notes = inr/5;
            System.out.println("5 => "+notes);
            inr=5%inr;
        }if(inr>=2){
            notes = inr/2;
            System.out.println("2 => "+notes);
            inr=2%inr;
        }if(inr>=1){
            notes = inr;
            System.out.println("1 => "+notes);
        }





    }
}
