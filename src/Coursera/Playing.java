package Coursera;

public class Playing {

    class BadNumberException extends Exception {
        public BadNumberException(String msg) {
            super(msg);
        }
    }

    void f(int a) throws Exception {
        if (a < 0) {
            throw new BadNumberException("Number is negative !");
        } else if (a == 0) {
            throw new BadNumberException("Number is zero !");
        } else {
            System.out.println("The provided number is OK!");
        }
    }

    boolean g(int a) {
        try {
            f(a);
        } catch(Exception e) {
            System.out.println("Error occured: " + e.getMessage());
            return false;
        } finally {
            System.out.println("Finally here !");
        }
        return true;
    }

    public static void main(String[] args) {
        Playing p = new Playing();
        System.out.println(p.g(30));
        System.out.println(p.g(-10));
        System.out.println(p.g(0));

    }


}
