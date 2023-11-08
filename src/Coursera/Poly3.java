package Coursera;

import java.lang.Math;
import java.util.Scanner;
public class Poly3
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        double x;

        Scanner keyb = new Scanner(System.in);
        // ((a+b)/2)x3 + (a+b)2x2 + a + b + c
        System.out.println("Enter a value for a: ");
        a = keyb.nextInt();
        System.out.println("Enter a value for b: ");
        b = keyb.nextInt();
        System.out.println("Enter a value for c: ");
        c = keyb.nextInt();
        System.out.println("Enter a value for x: ");
        x = keyb.nextDouble();

        double ab = a + b;
        double result = (ab/2 * Math.pow(x, 3) + Math.pow((a+b),2) * Math.pow(x, 2) + a + b + c);

        System.out.println("The result of the poly is " + result);
    }
}
