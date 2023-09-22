import java.util.Scanner;
import java.time.Year;

public class Age
{
    public static void main(String[] args)
    {
        Scanner keyb = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = keyb.nextInt();
        int year = Year.now().getValue();
        int yob = year - age;
        System.out.println("Your year of birth is: " + yob);

    }
}