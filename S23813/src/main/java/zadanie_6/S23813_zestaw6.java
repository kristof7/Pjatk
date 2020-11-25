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
        System.out.println("\n------------------------------------------------");
        s23813_zestaw6.cwiczenie_08();
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
//        int tab[];
        int tab[] = new int[0];
        System.out.println(tab);
        // zmienna o nazwie tabpowinna zostać zadeklarowana, bez tego wystąpi błąd, jeżeli się zadeklaruje to pokazuje się kod tablicy

    }

    public void cwiczenie_06() {
        System.out.println("Cwiczenie_06\n");

        int tab[] = {789, 678, 567};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.println(tab[i] + tab[j]);
            }
        }
        // wynik jest sumą poszczególnych elementów z tablicy: 1z1, 1z2, 1,3, 2z1, 2z2, 2z3, 3z1, 3z2, 3z3

    }

    public void cwiczenie_07() {
        System.out.println("Cwiczenie_07\n");

        String[] slowa = {
                "Ala", "kota", "ma", "ma", "a", "kot", "Ale"
        };
        System.out.println(slowa[0] + " " + slowa[2] + " " + slowa[1] + " " + slowa[4] + " " + slowa[5] + " " + slowa[3] + " " + slowa[6]);
    }

    public void cwiczenie_08() {
        System.out.println("Cwiczenie_07\n");

        char[] litery = {'a', 'b', 'd', 'z', 'x', 'y', 's', 'e', 'j'};
        char[] literyMirror = new char[litery.length];
        int count = 0;

        for (int i = literyMirror.length - 1; i >= 0; i--) {
            literyMirror[count] = litery[i];
            System.out.print(literyMirror[count] + ", ");
            count++;
        }
    }
}
