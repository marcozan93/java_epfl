import java.util.Scanner;
public class RoseBlanches
{
    public static void main(String[] args)
    {
        final int COFFEE = 2;
        final int FLASHINFORMATIQUE = 4;
        final int METRO = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("How much money did you get?");
        int money = input.nextInt();
        System.out.println("You received (Frs.) " + money);
        int booksFornitures = money * 3 / 4;
        System.out.println("Livre et Fournitures: " + booksFornitures + " Frs");
        System.out.println("Vous pouvez ensuite acheter:");

        int eachRest = (money - booksFornitures) / 3;

        // count total number of each item
        int coffee = eachRest / COFFEE;
        int journal = eachRest / FLASHINFORMATIQUE;
        int metro = eachRest / METRO;

        int rest = (eachRest % COFFEE) + (eachRest % FLASHINFORMATIQUE) + (eachRest % METRO) + ((money - booksFornitures) % 3);

        System.out.println(" " + coffee + " cafés");
        System.out.println(" " + journal + " numéros du Flash Informatique");
        System.out.println(" " + metro + " billets de métro");
        System.out.println("et il vous restera " + rest + " Frs pour les roses blanches.");


    }
}
