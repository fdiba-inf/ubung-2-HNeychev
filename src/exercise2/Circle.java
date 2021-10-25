package exercise2;

import java.util.Scanner;
import java.lang.Math;
public class Circle {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter r: ");
        double number = input.nextDouble ();
        double pi=Math.PI;
        System.out.println("Circumference: "+ (2*pi)*number);
        System.out.println("Area: "+ pi*(number*number));
    }
}