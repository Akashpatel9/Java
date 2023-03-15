package maths_class;

import java.util.Scanner;

public class Area_Using_Herons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q17- Accept the three sides of triangle and calculate the area using herons formula

        System.out.println("Enter side 1 of triangle");
        int s1 = sc.nextInt();
        System.out.println("Enter side 2 of triangle");
        int s2 = sc.nextInt();
        System.out.println("Enter side 3 of triangle");
        int s3 = sc.nextInt();


        //Semi perimeter
        int sp = s1+s2+s3/2;

        double Area = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));


        System.out.println("The Area of the triangle is "+Area);


    }
}
