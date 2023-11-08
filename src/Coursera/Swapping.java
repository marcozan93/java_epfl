package Coursera;

public class Swapping {

    public static void swap(int[] var1, int[] var2) {
        int temp = var1[0];
        var1[0] = var2[0];
        var2[0] = temp;
    }

    public static void main(String[] args) {
        int[] x = {1};
        int[] y = {2};

        System.out.println("x: " + x[0] + " y: " + y[0]);

        swap(x, y);

        System.out.println("x: " + x[0] + " y: " + y[0]);
    }
}
