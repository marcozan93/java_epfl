package Coursera;

import java.util.Scanner;
public class BMI {
    private static final Scanner input = new Scanner(System.in);


    public static double enteringHeight() {
        final double MIN_HEIGHT = 0.3;
        final double MAX_HEIGHT = 2.5;

        double height;
        do {
            System.out.print("Enter your height in meters: ");
            height = input.nextDouble();
        } while ((height < MIN_HEIGHT) || (height > MAX_HEIGHT));

        return height;
    }

    public static double enteringWeight() {
        final double MIN_WEIGHT  = 10.0;
        final double MAX_WEIGHT  = 300.0;

        double weight;
        do {
            System.out.print("Enter your weight in kg: ");
            weight = input.nextDouble();
        } while ((weight < MIN_WEIGHT) || (weight > MAX_WEIGHT));

        return weight;
    }


    public static double calculatingBMI(double h, double w) {

        double bmi = w / (h * h);
        int decimalPlaces = 2;
        return Math.round(bmi * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    }

    public static void printStatus(double w, double h, double bmi) {
        System.out.println("Given your weight (" + w + " kg) and " +
                "your height (" + h + " m), your Coursera.BMI is " + bmi);
    }

    public static void evaluatingBMI(double bmi) {

        if ((bmi >= 18.5) && (bmi <= 24.9)) {
            System.out.println("The NHS says that you are in the healthy weight range !");
        } else {
            if (bmi < 18.5) {
                System.out.println("The NHS says you are underweight.");
            } else {
                System.out.println("The NHS says you are overweight.");
            }
        }
    }


    public static void main(String[] args) {

        double height = enteringHeight();
        double weight = enteringWeight();
        double bmi = calculatingBMI(height, weight);
        printStatus(height, weight, bmi);
        evaluatingBMI(bmi);

    }

}