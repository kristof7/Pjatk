package zadanie_7;

import java.util.Arrays;

public class S23813_zestaw7 {
    public static void main(String[] args) {
        S23813_zestaw7 s23813_zestaw7 = new S23813_zestaw7();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw7.cwiczenie_01();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw7.cwiczenie_02();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw7.cwiczenie_03();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw7.cwiczenie_04();

    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");

        int randomNumber1 = (int) ((Math.random() * 9) + 1);
        int randomNumber2 = (int) ((Math.random() * 9) + 1);
        int randomNumber3 = (int) ((Math.random() * 9) + 1);
        int[] tablica1 = new int[randomNumber1];
        int[] tablica2 = new int[randomNumber2];
        int[] tablica3 = new int[randomNumber3];
        System.out.println("random number 1: " + randomNumber1);
        System.out.println("random number 2: " + randomNumber2);
        System.out.println("random number 3: " + randomNumber3);
        //------------ tablica 1 ------------------------
        for (int i = 0; i < randomNumber1; i++) {
            int random = (int) ((Math.random() * randomNumber1) + 1);
            tablica1[i] = random;
        }
        //------------ tablica 2 ------------------------
        for (int i = 0; i < randomNumber2; i++) {
            int random = (int) ((Math.random() * randomNumber2) + 1);
            tablica2[i] = random;
        }
        //------------ tablica 3 ------------------------
        for (int i = 0; i < randomNumber3; i++) {
            int random = (int) ((Math.random() * randomNumber3) + 1);
            tablica3[i] = random;
        }
        System.out.println("\n------------ tablica Dwuwymiarowa ------------------------\n");
        int[][] tablicaDwu = new int[3][9];
        for (int i = 0; i < tablicaDwu.length; i++) {
            if (i == 0) {
                for (int j = 0; j < tablica1.length; j++) {
                    tablicaDwu[i][j] = tablica1[j];
                    System.out.print(tablicaDwu[i][j] + " ");
                }
            }
            if (i == 1) {
                for (int j = 0; j < tablica2.length; j++) {
                    tablicaDwu[i][j] = tablica2[j];
                    System.out.print(tablicaDwu[i][j] + " ");
                }
            }
            if (i == 2) {
                for (int j = 0; j < tablica3.length; j++) {
                    tablicaDwu[i][j] = tablica3[j];
                    System.out.print(tablicaDwu[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");

        int[][] tablicaDwu = new int[8][8];

        for (int i = 0; i < tablicaDwu.length; i++) {
            for (int j = 0; j < tablicaDwu[1].length; j++) {
                int random = (int) ((Math.random() * 11));
                tablicaDwu[i][j] = random;
                System.out.print(tablicaDwu[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n------------------------\n");

        int[] count = new int[8];
        for (int i = 0; i < 8; i++) {
            count[i] = i;
        }

        for (int i = 0; i < tablicaDwu.length; i++) {

            for (int j = 0; j < tablicaDwu[1].length; j++) {

                if (tablicaDwu[i][j++] == count[i] && j < 8) {
                    count[i]++;
                    if (count[i] == 3) {
                        System.out.println("liczba: " + i + " się powtarza 3 lub więcej razy");
                    }
                }
            }
        }

    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

        char[][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                {'S', 'o', 'n', 'y'},
                {'J', 'o', 'l', 'l', 'a'}
        };

        String alfabet = "abcdefghijklmnopqrstuwz";
        int[] count = new int[23];
        for (int i = 0; i < 23; i++) {
            count[i] = i;
        }

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab[i].length; j++) {
                for (int k = 0; k < alfabet.length(); k++) {
                    if (alfabet.contains(String.valueOf(tab[i][j]).toLowerCase())) {
                        ++count[k];
                        if (count[k] == 2) {
                            System.out.println("litera: " + tab[i][j] + " się powtarza 2 lub więcej razy");
                        }
                    }
                }
            }
        }
    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");

        int[][] tablicaDwu = new int[10][10];

        for (int i = 0; i < tablicaDwu.length; i++) {
            for (int j = 0; j < tablicaDwu[1].length; j++) {
                int random = (int) ((Math.random() * 10));

                tablicaDwu[i][j] = random;
                System.out.print(tablicaDwu[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Posortowana tablica:");
        for (int i = 0; i < tablicaDwu.length; i++) {
            Arrays.sort(tablicaDwu[i]);
            System.out.println(Arrays.toString(tablicaDwu[i]));
        }
    }

}
