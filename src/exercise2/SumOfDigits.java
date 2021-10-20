package exercise2;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number(from 0 to 999:");
        int number = input.nextInt();
        int a = number%10;
        int b = (number/10)%10;
        int c = number/100;
        System.out.println("Sum of digits:" + (a+b+c)) ;

    }
}