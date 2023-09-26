import java.util.Scanner;


public class MyPlayground {
    public static void main(String[] args) {
        System.out.print("Enter a real number: ");
        Scanner input = new Scanner(System.in);
        double myReal = input.nextDouble();

        if (((2.0 < myReal) & (myReal < 3) || (myReal == 2)) ||
                ((0.0 < myReal) & (myReal < 1.0) || (myReal == 1.0)) ||
                ((-10.0 < myReal) & (myReal < -2.0) || (myReal == -10.0) ||
                        (myReal == -2.0))) {
            System.out.println("Your real number is in the set S !");
        } else {
            System.out.println("Your real number is not in the set S.");
        }

    }
}
