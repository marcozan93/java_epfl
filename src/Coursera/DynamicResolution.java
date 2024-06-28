package Coursera;

public class DynamicResolution {
    public static void main(String[] args) {
        X aa;
        Y bb = new Y();
        aa = bb;
        aa.affiche();
    }
}


class X {
    public void affiche() {
        System.out.println("A");
    }
}

class Y extends X {
    public void affiche() {
        System.out.println("B");
    }
}
