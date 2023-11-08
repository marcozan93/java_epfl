package Coursera;

import java.util.Scanner;

public class Napoleon {
    // input scanner
    private static final Scanner input = new Scanner(System.in);

    public static String retrievingLastName(String n, String names) {

        int myIndexStart = names.lastIndexOf(n);
        int myIndexEnd = myIndexStart + (n.length() + 1);
        String trimmedName = names.substring(myIndexEnd);
        String[] namesArray = trimmedName.split(" ");

        return namesArray[0];
    }

    public static String askingName(String names) {

        String name;
        do {
            System.out.print("Enter a first name, and you'll get their last name: ");
            name = input.nextLine();
            if (!names.contains(name)) {
                System.out.println("Unknown in the battalion!");
            }
        } while (!names.contains(name));

        return name;
    }
    public static void main(String[] args) {

        String names = "Coursera.Napoleon Bonaparte Bill Gates Claudia Schiffer Martina Hingis Marco Zanin";
        // Asking the user the name
        String name = askingName(names);
        // retrieving the last name
        String lastName = retrievingLastName(name, names);
        // display the results
        System.out.print(name + "'s last name is " + lastName);


    }
}
