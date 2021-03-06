package zadanie_4;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Program do obliczania pory roku po wpisanej dacie. Program nie uwqzględnia walidacji wprowadzania nieprawidłowych danych");
        System.out.println("Podaj dni miesiąca (wpisz od 1-31 zależnie od miesiąca):");
        int dzien = scanner.nextInt();
        System.out.println("Podaj numer miesiąca (wpisz od 1-12):");
        int miesiac = scanner.nextInt();

        System.out.println("Data to " + dzien + "/" + miesiac);


        switch (miesiac) {

            case 1:
            case 2:
            case 3:
                if (miesiac == 1) {
                    System.out.println("Zima");
                } else if (miesiac == 2) {
                    System.out.println("Zima");
                } else if (miesiac == 3 && dzien >= 1 && dzien < 21) {
                    System.out.println("Zima");
                } else {
                    System.out.println("Wiosna");
                }
                break;
            case 4:
            case 5:
            case 6:
                if (miesiac == 4) {
                    System.out.println("Wiosna");
                } else if (miesiac == 5) {
                    System.out.println("Wiosna");
                } else if (miesiac == 6 && dzien >= 1 && dzien <= 20) {
                    System.out.println("Wiosna");
                } else {
                    System.out.println("Lato");
                }
                break;
            case 7:
            case 8:
            case 9:
                if (miesiac == 7) {
                    System.out.println("Lato");
                } else if (miesiac == 8) {
                    System.out.println("Lato");
                } else if (miesiac == 9 && dzien >= 1 && dzien <= 22) {
                    System.out.println("Lato");
                } else {
                    System.out.println("Jesien");
                }
                break;
            case 10:
            case 11:
            case 12:
                if (miesiac == 10) {
                    System.out.println("Jesien");
                } else if (miesiac == 11) {
                    System.out.println("Jesien");
                } else if (miesiac == 12 && dzien >= 1 && dzien <= 21) {
                    System.out.println("Jesien");
                } else {
                    System.out.println("Zima");
                }
                break;

        }

    }

    public void cwiczenie_08() {
        System.out.println("Cwiczenie_08\n");

        double liczba = 0.7d;

        if (liczba > 0) {
            System.out.println("liczba " + liczba + " należy do zbioru A");
        }
        if (liczba < 1) {
            System.out.println("liczba " + liczba + " należy do zbioru B");
        }
        if (liczba > 0 && liczba < 1) {
            System.out.println("liczba " + liczba + " należy do zbioru C");
        }
    }

    public void cwiczenie_09() {
        System.out.println("Cwiczenie_09\n");

        int wrt = -3;

        if ((wrt > -5 && wrt <= 10) || (wrt > -5 && wrt < 0) || (wrt > 5 && wrt < 10)) {
            System.out.println("liczba " + wrt + " należy do zbioru A");
        }
        if ((wrt <= -13) || (wrt > -8 && wrt <= -3)) {
            System.out.println("liczba " + wrt + " należy do zbioru B");
        }
        if (wrt >= -4) {
            System.out.println("liczba " + wrt + " należy do zbioru C");
        }

        if (((wrt > -5 && wrt <= 10) || (wrt > -5 && wrt < 0) || (wrt > 5 && wrt < 10)) && ((wrt <= -13) || (wrt > -8 && wrt <= -3)) && (wrt >= -4)) {
            System.out.println("liczba " + wrt + " należy do czesci wspolnej wszystkich trzech zbiorów A, B, C");
        }

    }

    public void cwiczenie_10() {
        System.out.println("Cwiczenie_10\n");

        int wrt = -12;

        if ((wrt > -15 && wrt < -10) && !(wrt < -13)) {
            System.out.println("liczba " + wrt + " należy tylko do zbioru A");
        }
        if ((wrt < -13) && !(wrt > -15 && wrt < -10)) {
            System.out.println("liczba " + wrt + " należy tylko do zbioru B");
        }
    }
}
