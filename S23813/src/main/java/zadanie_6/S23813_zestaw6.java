package zadanie_6;

import java.util.Random;

public class S23813_zestaw6 {
    public static void main(String[] args) {
        S23813_zestaw6 s23813_zestaw6 = new S23813_zestaw6();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_01();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_02();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_03();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_04();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_05();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_06();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_07();
    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");

        int[] jednowymiarowa = new int[10];

    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");

        int[] jednowymiarowa = new int[10];

        for (int i = 0; i < jednowymiarowa.length; i++) {
            int randomNum = new Random().nextInt(2);
            jednowymiarowa[i] = randomNum;
        }
        for (int i = 0; i < jednowymiarowa.length; i++) {
            System.out.print(jednowymiarowa[i] + ", ");
        }

    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

        int[] jednowymiarowa = new int[10];
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < jednowymiarowa.length; i++) {
            int randomNum = new Random().nextInt(2);
            if (randomNum == 0)
                count0++;
            if (randomNum == 1)
                count1++;
            jednowymiarowa[i] = randomNum;
        }
        System.out.println("Liczby w tablicy:");
        for (int i = 0; i < jednowymiarowa.length; i++) {
            System.out.print(jednowymiarowa[i] + ", ");
        }
        System.out.println("\nliczba zer[0] w tablicy: " + count0);
        System.out.println("liczba jedynek[1] w tablicy: " + count1);
    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");

        double[] douTable = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Wypełnienie tablicy losowymi liczbami z zakresu od 1-9 i wyświetlenie ich:");
        for (int i = 0; i < douTable.length; i++) {
            double rand = (Math.random() * 9) + 1;
            douTable[i] = rand;
            System.out.println(douTable[i]);
        }
        System.out.println("Liczby o parzystym indeksie w tablicy:");
        for (int i = 0; i < douTable.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(douTable[i] + ", ");
            }
        }
        System.out.println("");
        System.out.println("Liczby nieparzyste z przekonwertowanych na typ 'int' liczb w tablicy:");
        for (int i = 0; i < douTable.length; i++) {
            int roundedDouble = (int) Math.round(douTable[i]);
            if (roundedDouble % 2 != 0) {
                System.out.print(roundedDouble + ", ");
            }
        }
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
