package Coursera;

import java.util.Scanner;

class PascalTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = 0;

        // ask for the dimension fo triangle
        System.out.print("Enter the size of the Pascal's triangle: ");
        size = input.nextInt();

        int[][] triangle = new int[size][];


        //  create the first line
        triangle[0] = new int[1];
        triangle[0][0] = 1;

        for (int row = 1; row < size; row++) {

            triangle[row] = new int[triangle[row - 1].length + 1];

            // Remplissage du tableau:
            // les deux éléments aux deux extrémités des lignes valent 1.
            // Les autres sont liés par la relation:
            // triangle[row][j]= triangle[row-1][j-1] + triangle[row-1][j]

            for (int col = 0; col <= row; col++) {
                if ((col == 0) || (col == row)) {
                    triangle[row][col] = 1;
                } else {
                    triangle[row][col] = triangle[row - 1][col - 1]
                            + triangle[row - 1][col];
                }
            }
        }

        // Affichage du tableau
        for (int row = 0; row < size; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(triangle[row][col] + " ");
            }
            System.out.println();
        }
    }
}