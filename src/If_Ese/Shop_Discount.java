package If_Ese;

import java.util.Scanner;

public class Shop_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //23- Shop discount - Description on Graphic      }

        System.out.println("Enter amount");
        int amount = sc.nextInt();
        double price ;


        //discount formula = (amount-discount/100*amount)

        if(amount<=5000){
            System.out.println(amount);
        } else if (amount>5001&&amount<=7000) {

            price = amount-0.1*amount;

            System.out.println("The discounted price "+price);
        }else if (amount>7001&&amount<=10000) {

            price = amount-0.2*amount;

            System.out.println("The discounted price "+price);
        }else if (amount>10000) {

            price = amount-0.3*amount;

            System.out.println("The discounted price "+price);
        }

    }
}
