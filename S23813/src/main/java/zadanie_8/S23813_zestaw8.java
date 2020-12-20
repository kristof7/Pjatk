package zadanie_8;

public class S23813_zestaw8 {

    public static void main(String[] args) {
        S23813_zestaw8 s23813_zestaw8 = new S23813_zestaw8();
        System.out.println("\n------------------------------------------------");

        s23813_zestaw8.show(7);

        System.out.println("\n------------------------------------------------");

        Integer wrt = 7;
        s23813_zestaw8.modifyValue(wrt);

        System.out.println("\n------------------------------------------------");

        char[] tablica = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        s23813_zestaw8.charCount(tablica);

        System.out.println("\n------------------------------------------------");

        int randomNumber1 = (int) ((Math.random() * 9) + 1);
        Integer[] tablicaNumber1 = new Integer[9];
        for (int i = 0; i < 9; i++) {
            int random = (int) ((Math.random() * randomNumber1) + 1);
            tablicaNumber1[i] = random;
        }
        int randomNumber2 = (int) ((Math.random() * 9) + 1);
        Integer[] tablicaNumber2 = new Integer[9];
        for (int i = 0; i < 9; i++) {
            int random = (int) ((Math.random() * randomNumber2) + 1);
            tablicaNumber2[i] = random;
        }

        s23813_zestaw8.tablesMethod(tablicaNumber1, tablicaNumber2);


        System.out.println("\n------------------------------------------------");
        s23813_zestaw8.kwadrat(5, 'x');

    }

    public void show(Integer value) {
        System.out.println("Cwiczenie_01\n");
        System.out.println(value);
    }

    public void modifyValue(Integer wrt) {
        System.out.println("Cwiczenie_02\n");
        System.out.println("wartość dostarczanej zmiennej= " + wrt);
        wrt *= 5;
        System.out.println("wartość dostarczanej zmiennej pomnożone * 5= " + wrt);

        //metoda modyfikuje dostarczaną wqartość jeżeli taki był zamierzony cel/rezultat który programista chciał uzyskać
    }

    public void charCount(char[] table) {
        System.out.println("Cwiczenie_03\n");
        Integer count = 0;
        for (int i = 0; i < table.length; i++) {
            count++;
        }
        System.out.println("Liczba znaków w argumencie= " + count);
    }

    public void tablesMethod(Integer[] table1, Integer[] table2) {
        System.out.println("Cwiczenie_04\n");
        Integer[] newTable = new Integer[9];

        for (int i = 0; i < 9; i++) {
            newTable[i] = table1[i] + table2[i];
            System.out.println(newTable[i]);
        }
    }

    public void kwadrat(Integer iloscZnakow, char pierwszyZnak) {
        System.out.println("Cwiczenie_05\n");

        for (int i = 0; i < iloscZnakow; i++) {

            for (int j = 0; j < iloscZnakow; j++) {
                if (pierwszyZnak == 'x') {
                    if (i % 2 == 0) {
                        System.out.print("x");
                    } else {
                        System.out.print("o");
                    }
                } else {
                    if (i % 2 == 0) {
                        System.out.print("o");
                    } else {
                        System.out.print("x");
                    }

                }

            }
            System.out.println("");

        }
    }

}
