package Cacuator;

import java.util.Scanner;

public class Fahrenheit_To_Celsius_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q8- Write a program to accept temperature in Fahrenheit & convert into Celsius.

        System.out.println("Enter Temperature in Fahrenheit");
        float Fahrenheit = sc.nextFloat();

        float Celsius = (Fahrenheit-32)*5/9;

        System.out.println("temperature in Celsius = "+ Celsius);



    }
}
