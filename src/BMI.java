import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in meters:");
        double height = input.nextDouble();
        System.out.print("Enter your weight in kg:");
        double weight = input.nextDouble();
        double bmi = weight / (height * height);

        System.out.println("Given your weight (" + weight + " kg) and " +
                "your height (" + height + " m), your BMI is " + bmi);

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
}
