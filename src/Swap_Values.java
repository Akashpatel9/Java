import java.util.Scanner;

public class Swap_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q28- Accept two numbers from user and swap their values


        System.out.println("Enter number 1");
        double n1 = sc.nextDouble();
        System.out.println("Enter number 2");
        double n2 = sc.nextDouble();

        double temp=0;


        temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("Your swapped number1 value is = "+n1);
        System.out.println("Your swapped number2 value is = "+n2);




    }
}
