package Coursera;

import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            System.out.print("Enter a integer number: ");
            int myInt = input.nextInt();
            total += myInt;
        }

        System.out.print("Total is " + total);
    }
}
