import java.util.Scanner;
public class Fondue
{
    public static void main(String[] args)
    {
        int BASE = 4;
        double fromage = 800.0;
        double eau = 2.0;
        double ail = 2.0;
        double pain = 400;

        Scanner keyb = new Scanner(System.in);
        System.out.println("Entrez le nombre de personne(s) conviées à la fondue : ");

        int nbConvives = keyb.nextInt();
        fromage = fromage * nbConvives / BASE;
        eau = eau * nbConvives / BASE;
        ail = ail * nbConvives / BASE;
        pain = pain * nbConvives / BASE;

        System.out.println("Pour faire une fondue fribourgeoise pour " + nbConvives + "personnes, il vous faut :");
        System.out.println(" - " + fromage + " gr de Vacherin fribourgeois");
        System.out.println(" - " + eau + " dl d'eau");
        System.out.println(" - " + ail + " gousse(s) d'ail");
        System.out.println(" - " + pain + " gr de pain");
        System.out.println(" - du poivre à volonté");

    }

}
