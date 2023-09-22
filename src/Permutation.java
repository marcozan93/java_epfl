import java.util.Scanner;
public class Permutation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        int x = input.nextInt();
        System.out.println("Enter a value for y: ");
        int y = input.nextInt();
        System.out.println("Before permutation:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("After permutation:");
        int temp = y;
        y = x;
        x = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
