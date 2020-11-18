package zadanie_5;

import zadanie_4.S23813_zestaw4;

import java.util.Scanner;

public class S23813_zestaw5 {

    public static void main(String[] args) {
        S23813_zestaw5 s23813_zestaw5 = new S23813_zestaw5();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw5.cwiczenie_01();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw5.cwiczenie_02();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw5.cwiczenie_03();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw5.cwiczenie_04();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw5.cwiczenie_05();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw5.cwiczenie_06();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw5.cwiczenie_07();
    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");

        int K = 987654321;

        String s = "";

        while (K != 0) {
            int cyfra = K % 10;
            s += cyfra;
            K /= 10;
        }
        System.out.println("s wynosi: " + s);
        System.out.println("K wynosi: " + K);
    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");

//        int s = 0;
//        for (int i = 1; i <= 10; i++)
//            s = s + i;

        // Zmodyfikowany powyższy kod pod pętle while
        int s = 0;
        int i = 1;
        while (i <= 10) {
            s += i;
            i++;
        }
    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");

    }

    public void cwiczenie_05() {
        System.out.println("Cwiczenie_05\n");

    }

    public void cwiczenie_06() {
        System.out.println("Cwiczenie_06\n");

    }

    public void cwiczenie_07() {
        System.out.println("Cwiczenie_07\n");

    }

}

