package Coursera;//abstract class Coursera.A {
//    public Coursera.A() {
//        print();
//    }
//
//    protected abstract void print();
//}
//
//class Coursera.B extends Coursera.A {
//    private int a;
//    public Coursera.B(int a) {
//        super();
//        this.a = a;
//        print();
//    }
//
//    protected void print() {
//        System.out.println("a = " + a);
//    }
//}
//
//class Coursera.C extends Coursera.B {
//    private int x;
//
//    public Coursera.C(int a, int b) {
//        super(b);
//        this.x = a;
//    }
//
//    protected void print() {
//        System.out.println("x = " + x);
//    }
//}
//
//
//public class Coursera.Playground {
//
//    public static void main(String[] args) {
//        Coursera.A aInstance1 = new Coursera.B(20);
//        Coursera.A aInstance2 = new Coursera.C(10, 20);
//
//// OUTPUT
////        a = 0
////        a = 20
////        x = 0
////        x = 0
//    }
//}
//
//abstract class W {
//    public abstract void aMethod();
//    private void cMethod(){
//        aMethod();
//    }
//}
//
//abstract class Q extends W {
//
//}


//class Coursera.A {
//
//    private static int var1 = 10;
//    private int var2 = 10;
//
//    public void inc() {
//        var1 += 1;
//        var2 += 2;
//    }
//
//    public void print(){
//        System.out.println("var1 = " + var1 + ", var2 = " + var2);
//    }
//}


class A {
    public static void doSth(){
        System.out.println("Doing something in Coursera.A");
    }
}

class B extends A {
    public static void doSth(){
        System.out.println("Doing something in Coursera.B");
    }
}

class C extends B {
    public static void doSth(){
        System.out.println("Doing something in Coursera.C");
    }
}
public class Playground {

    public static void main(String[] args) {
        A.doSth();
        B.doSth();
        C.doSth();

        A aInstance = new B();
        B bInstance = new C();
        C cInstance = new C();

        aInstance.doSth();
        bInstance.doSth();
        cInstance.doSth();
//        Coursera.A a1 = new Coursera.A();
//        a1.inc();
//        a1.print();
//
//        Coursera.A a2 = new Coursera.A();
//        a2.print();
//        a2.inc();
//        a2.print();
//        a1.print();

    }
}





interface I1 {
    public int a = 10;
}

interface I2 {
    public int a = 20;
    public int b = 40;
}





