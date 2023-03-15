package If_Ese;

import java.util.Scanner;

public class Quadratic_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q18- Accept the value of a, b, c - The values in a quadratic equation and find its roots.


        System.out.println("Enter value of a");
        double a = sc.nextDouble();
        System.out.println("Enter value of b");
        double b = sc.nextDouble();
        System.out.println("Enter value of c");
        double c = sc.nextDouble();


        double d = Math.pow(b, 2);
        double e = d - 4 * a * c;        double z, x, x2 ,x3= 0;

        if (e > 0.0) {
            z = Math.sqrt(e);
            x = (b - z) / (2 * a);
            x2 = (b + z) / (2 * a);
            System.out.println("x = " + x);
            System.out.println("x = " + x2);
        }
        else if (e == 0.0) {
             x3 = -b / 2 * a;
            System.out.println(x3);
        }
        else {
            System.out.println("not re");
        }


    }
}
