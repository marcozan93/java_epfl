package Coursera;

import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de dÃ©but de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double OFFPEAK = 1.0;
        final double PEAK = 2.0;

        if ((fin > 24 ) || (debut < 0)){
            System.out.println("Les heures doivent Ãªtre comprises entre 0 et 24 !");
        } else if (debut == fin) {
            System.out.println("Bizarre, vous n'avez pas louÃ© votre vÃ©lo bien longtemps !");
        } else if (fin < debut) {
            System.out.println("Bizarre, le dÃ©but de la location est aprÃ¨s la fin ...");
        } else {

            if (((debut > 0) && (fin < 7)) || ((debut >= 17) && (fin < 24))) {
                int duration = fin - debut;
                double cost = duration * OFFPEAK;
                System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
                System.out.println(duration + " heure(s) au tarif horaire de " + OFFPEAK + " franc(s)");
                System.out.print("Le montant total Ã  payer est de " + cost + " franc(s).");

            } else if ((debut >= 7) && (fin < 17)) {;
                int duration = fin - debut;
                double cost = duration * PEAK;
                System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
                System.out.println(duration + " heure(s) au tarif horaire de " + PEAK + " franc(s)");
                System.out.print("Le montant total Ã  payer est de " + cost + " franc(s).");

            } else if ((debut < 7) && (fin < 17)) {
                int offPeakHours = (7 - debut);
                int peakHours = (fin - 7);
                double offPeakCost = offPeakHours * OFFPEAK;
                double PeakCost = peakHours * PEAK;
                double cost = offPeakCost + PeakCost;
                System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
                System.out.println(offPeakHours + " heure(s) au tarif horaire de " + OFFPEAK + " franc(s)");
                System.out.println(peakHours + " heure(s) au tarif horaire de " + PEAK + " franc(s)");
                System.out.print("Le montant total Ã  payer est de " + cost + " franc(s).");

            } else if ((debut >= 7) && (fin <= 24)) {
                int offPeakHours = (fin - 17);
                int peakHours = (17 - debut);
                double offPeakCost = offPeakHours * OFFPEAK;
                double PeakCost = peakHours * PEAK;
                double cost = offPeakCost + PeakCost;
                System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
                System.out.println(offPeakHours + " heure(s) au tarif horaire de " + OFFPEAK + " franc(s)");
                System.out.println(peakHours + " heure(s) au tarif horaire de " + PEAK + " franc(s)");
                System.out.print("Le montant total Ã  payer est de " + cost + " franc(s).");

            } else {
                int offPeakHours1 = (7 - debut);
                int offPeakHours2 = (fin - 17);
                int totalOffPeakHours = offPeakHours1 + offPeakHours2;
                int peakHours = 17 - 7;
                double offPeakCost = totalOffPeakHours * OFFPEAK;
                double PeakCost = peakHours * PEAK;
                double cost = offPeakCost + PeakCost;
                System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
                System.out.println(totalOffPeakHours + " heure(s) au tarif horaire de " + OFFPEAK + " franc(s)");
                System.out.println(peakHours + " heure(s) au tarif horaire de " + PEAK + " franc(s)");
                System.out.print("Le montant total Ã  payer est de " + cost + " franc(s).");
            }

        }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}