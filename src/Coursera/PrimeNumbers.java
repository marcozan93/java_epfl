package Coursera;

import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();


        for (int i = 2; i <= 100; ++i) {
            boolean prime = true;
            int divisor = 1;

            if (i % 2 == 0) {
                // the number is even
                if (i != 2) {
                    prime = false;
                    divisor = 2;
                }
            } else {
                double upperMax = Math.sqrt(i);
                for (int j = 3; (prime) && (j <= upperMax); j += 2) {
                    if (i % j == 0) {
                        prime = false;
                        divisor = i;
                    }
                }
            }
            if (prime) {
                myList.add(i);
            }
        }
        for (int val : myList) {
            System.out.println(val);
        }

    }
}
