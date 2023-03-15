package Switch_Case_Default;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q55- Restaurant

        int country, indian_dish, russion_dish, chinesh_disss;
        int sum;

        do {
            System.out.println("Welcome Sir/Mam");
            System.out.println("Enter 1 for Indian dish\nEnter 2 for Russian dish\nEnter 3 for Chines dish");
            country = sc.nextInt();

            switch (country) {
                case 1 -> {
                    sum=0;
                    do {
                        System.out.println("1 = Paneer Butter Masal = 210/-Rs\n2 = Shahi Paneer = 250/-Rs");
                        System.out.println("3 = Mushroom Masala = 220/-Rs\n4 = Roti = 10/-Rs");
                        indian_dish = sc.nextInt();

                        switch (indian_dish) {

                            case 1 -> {
                                System.out.println("You selected Paneer Butter Masal");
                                sum+=210;
                            }
                            case 2 -> {
                                System.out.println("You selected Shahi Paneer");
                                sum+=250;
                            }
                            case 3 -> {
                                System.out.println("You selected Mushroom Masala");
                                sum+=220;
                            }
                            case 4 -> {
                                System.out.println("You selected Roti");
                                sum+=10;
                            }
                            default -> System.out.println("Enter correct dish 1 to 4");
                        }
                        System.out.println("Enter 0 to select another from indian menu or enter 1 to terminate");
                        indian_dish = sc.nextInt();

                        System.out.println();
                        if(indian_dish==1){
                            System.out.println("Your total bill is = "+sum);
                        }else {
                            System.out.println("Please try again from main menu or enter 1 to terminate");
                        }
                        System.out.println();

                    } while (indian_dish == 0);

                }
                case 2 -> {
                    sum = 0;
                    do  {
                        System.out.println("1 = Pelmeni = 280/-Rs\n2 = Pirozhki = 100/-Rs");
                        System.out.println("3 = Solyanka = 140/-Rs\n4 = Olivier Salad = 160/-Rs");
                        russion_dish = sc.nextInt();

                        switch (russion_dish) {
                            case 1 ->{
                                System.out.println("You selected Pelmeni");
                                sum+=280;
                            }
                            case 2 -> {
                                System.out.println("You selected Pirozhki");
                                sum+=100;
                            }
                            case 3 -> {
                                System.out.println("You selected Solyanka");
                                sum+=140;
                            }
                            case 4 -> {
                                System.out.println("You selected Olivier Salad");
                                sum+=160;
                            }
                            default -> System.out.println("Enter correct dish 1 to 4");
                        }
                        System.out.println("Enter 0 to select another from russion menu or enter 1 to terminate");
                        russion_dish = sc.nextInt();

                        System.out.println();
                        if(russion_dish==1){
                            System.out.println("Your total bill is = "+sum);
                        }else {
                            System.out.println("Please try again from main menu or enter 1 to terminate");
                        }
                        System.out.println();

                    } while (russion_dish == 0);
                }
                case 3 -> {
                    sum = 0;
                    do {
                        System.out.println("1 = Chowmein = 40/-Rs\n2 = Dimsums = 50/-Rs");
                        System.out.println("3 = Hakka Noodles = 160/-Rs\n4 = Fried Rice = 110/-Rs");
                        chinesh_disss = sc.nextInt();

                        switch (chinesh_disss) {
                            case 1 -> {
                                System.out.println("You selected Chowmein");
                                sum+=40;
                            }
                            case 2 -> {
                                System.out.println("You selected Dimsums");
                                sum+=50;
                            }
                            case 3 -> {
                                System.out.println("You selected Hakka Noodles");
                                sum+=160;
                            }
                            case 4 -> {
                                System.out.println("You selected Fried Rice");
                                sum+=110;
                            }
                            default -> System.out.println("Enter correct dish 1 to 4");
                        }
                        System.out.println("Enter 0 to  select another from repeat chinesh menu or enter 1 to terminate");
                        chinesh_disss = sc.nextInt();

                        System.out.println();
                        if(chinesh_disss==1){
                            System.out.println("Your total bill is = "+sum);
                        }else {
                            System.out.println("Please try again from main menu or enter 1 to terminate");
                        }
                        System.out.println();

                    } while (chinesh_disss == 0);
                }
            }
            System.out.println("Enter 0 to go main menu or enter 1 to terminate");
            country = sc.nextInt();
        } while (country == 0);


    }
}