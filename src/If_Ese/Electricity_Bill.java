package If_Ese;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q24 Bijli Bill - Description on Graphic

        double bill =0;

        System.out.println("Enter your bill");
        double unit= sc.nextDouble();

       /* if(unit<=100){
            bill=unit *4.2;
            System.out.println("Your bijli bill is = "+bill);
        } else if (unit>=101&&unit<=200) {
            bill=100*4.2+((unit-100)*6);
            System.out.println("Your bijli bill is = "+bill);
        } else if (unit>=201&&unit<=400) {
            bill = 100*4.2+100*6+(unit-200)*8;
            System.out.println("Your bijli bill is = "+bill);
        }else if(unit>=400){
            bill = 100*4.2+100*6+100*8+(unit-400)*13;
            System.out.println("Your bijli bill is = "+bill);
        }



        */

        //Shot form


        if(unit>400){
            bill= bill+(unit-400)*13;
            unit=400;
        }
        if(unit>=200){
            bill= bill+(unit-200)*8;
            unit=200;
        }
        if(unit>=100){
            bill= bill+(unit-100)*6;
            unit=100;
        }
        if(unit<100){
            bill=(bill+100)*4.2;
        }
        System.out.println(bill);



    }
}
