package Coursera;

import java.util.Scanner;

public class CombinationPermutation {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            String choice;

            do {
                System.out.print("Would you like a combination or permutation? ");
                choice = input.nextLine();

            } while (!choice.equalsIgnoreCase("combination") &&
                    !choice.equalsIgnoreCase("permutation"));

            System.out.print("Enter your n value: ");
            int n = input.nextInt();
            System.out.print("Enter your k value: ");
            int k = input.nextInt();

//        int n = 10;
//        int k = 6;
//        combination = 210
//        permutation = 151200

            int up = 1;
            int down1 = 1;
            int down2 = 1;

            // n!
            for (int i = n; i >=1; --i) {
                up *= i;
            }

            // (n-k)!
            for (int i = (n-k); i >= 1; --i) {
                down1 *= i;
            }

            // k!
            for (int i = k; i >=1; --i) {
                down2 *= i;
            }


            if (choice.equalsIgnoreCase("combination")) {

                int combination = up / (down1 * down2);
                System.out.println("Combination (n!)/k!(n-k)! = " + combination);

            } else {

                int permutation = up / down1;
                System.out.println("Permutation (n!)/(n-k)! = " + permutation);
            }

        }
    }

