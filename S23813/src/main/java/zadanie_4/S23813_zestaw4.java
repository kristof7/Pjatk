package zadanie_4;

public class S23813_zestaw4 {

    public static void main(String[] args) {
        S23813_zestaw4 s23813_zestaw4 = new S23813_zestaw4();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_01();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_02();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_03();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_04();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_05();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_06();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_07();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_08();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_09();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw4.cwiczenie_10();
    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");

        int i = 10;
        i = i++;
        i = ++i;
        i = i++ + ++i;
        System.out.println("Rezultat: i wynosi " + i);

    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");

        double a = -7;
        double x = 0;
        if (a >= 0) x = 1.701;
        if (a < 0) x = (2D * 3.14f);
        System.out.println("1. Rezultat: x wynosi " + ((a > 0) ? (1.701) : (2D * 3.14f)));
        System.out.println("2. Rezultat: x wynosi " + x);

    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

        int zmInt = 4;
        double zmDouble = -1.0;
        if (zmInt > 0)
            if (zmDouble > 0)
                System.out.println("Here I am!");
            else
                System.out.println("No, I am here!");
        System.out.println("No, actually , I am here!");

        // typ double powinien miec oznaczenie w postaci przyrostka d, / warunek if teoretycznie powinien mieć klamry jeżeli nie chcemy uchwycić ostatniego wywołania "No, actually , I am here!"
        // (choc w przeciwnym wypadku nie jest to konieczne, wtedy warunek jest spełniony dla pierwszej linkijki pod spodem)

    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");


        boolean doesSignificantWork = true;
        boolean makesBreakthrough = false;
        boolean nobelPrizeCandidate = false;

        // --------- Dłuższa wersja --------
        if (doesSignificantWork) {

            if (makesBreakthrough)
                nobelPrizeCandidate = true;
            else
                nobelPrizeCandidate = false;
        } else if (!doesSignificantWork)
            nobelPrizeCandidate = false;

        // --------- Skrócona wersja --------

        System.out.println(doesSignificantWork ? ((makesBreakthrough) ? (nobelPrizeCandidate = true) : (nobelPrizeCandidate = false)) : (nobelPrizeCandidate = false));

    }

    public void cwiczenie_05() {
        System.out.println("Cwiczenie_05\n");

        int a = 1;
        int b = 2;

//        (!(a<b) && !(a>b))

        // jezeli a nie jest wieksze ani nie jest mniejsze od b czyli a jest równe b
        if (a == b) {
            //...
        }

    }

    public void cwiczenie_06() {
        System.out.println("Cwiczenie_06\n");

        int a = 1;
        int b = 1;
        int c = 3;

        if (a == b) {
            System.out.println(a + " oraz " + b + " są takie same");
        } else {
            System.out.println(a + " oraz " + b + " nie są takie same");
        }
        if (a == c) {
            System.out.println(a + " oraz " + c + " są takie same");
        } else {
            System.out.println(a + " oraz " + c + " nie są takie same");
        }
        if (b == c) {
            System.out.println(b + " oraz " + c + " są takie same");
        } else {
            System.out.println(b + " oraz " + c + " nie są takie same");
        }

    }

    public void cwiczenie_07() {
        System.out.println("Cwiczenie_07\n");

    }

    public void cwiczenie_08() {
        System.out.println("Cwiczenie_08\n");

    }

    public void cwiczenie_09() {
        System.out.println("Cwiczenie_09\n");

    }

    public void cwiczenie_10() {
        System.out.println("Cwiczenie_10\n");

    }

}
