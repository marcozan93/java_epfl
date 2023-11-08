package Coursera;

import java.util.Scanner;

public class Degree2 {
    public static void main(String[] args) {
        System.out.print("Please enter the a coefficient of your polynomial: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        System.out.print("Enter the b coefficient of your polynomial: ");
        double b = input.nextDouble();

        System.out.print("Enter the c coefficient of your polynomial: ");
        double c = input.nextDouble();

        double delta = b*b -4.0*a*c;

        System.out.println("Your polynomial is in the form of " + a + "x^2 + " + b + "x + " + c);
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta))/2*a;
            double x2 = (-b - Math.sqrt(delta))/2*a;

            if (x1 == x2) {
                System.out.println("There are two coincidental solutions = " + x1);
            } else {
                System.out.print("There are two unique results: " + x1 + " and " + x2);
            }

        } else {
            System.out.print("Your polynomial does not have solutions in the real numbers R.");
        }

    }
}
