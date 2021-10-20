package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //a,b,c-chisla ot uravnenie
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();

        //d-determinanta
        double d = b*b - 4.0*(a * c );
        double x1, x2, x;
        
        if(a!=0){
            if (d>=0){
                x1= (-b + Math.sqrt(d)) / (2*a);
                x2= (-b - Math.sqrt(d)) / (2*a);
                System.out.println(x1 + " , " +  x2 );
                
            }else{
                System.out.println("Imaginary values");
            }
        }else if(b!=0){
            x= -c/b;
            System.out.println(x);

        }else if (c!=0){
            System.out.println("No values");

        }else{
            System.out.println("Many values");


        }


    }
}
