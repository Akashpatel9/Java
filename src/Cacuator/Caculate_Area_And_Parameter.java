package Cacuator;

import java.util.Scanner;

public class Caculate_Area_And_Parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q5- Accept the length and width of a rectangle. Calculate & print the area and perimeter.

        System.out.println("Enter the length of the rectangle");
        float length = sc.nextFloat();

        System.out.println("Enter the width of the rectangle");
        float width = sc.nextFloat();

        float area = length*width;
        float parimeter = 2*(length+width);

        System.out.println("The area of the rectangle is = "+area);
        System.out.println("The perimeter  of the rectangle is = "+parimeter);


    }
}
