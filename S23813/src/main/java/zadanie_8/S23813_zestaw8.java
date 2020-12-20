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
        Integer[] tablicaNumber1 = new Integer[randomNumber1];
        for (int i = 0; i < randomNumber1; i++) {
            int random = (int) ((Math.random() * randomNumber1) + 1);
            tablicaNumber1[i] = random;
        }
        int randomNumber2 = (int) ((Math.random() * 9) + 1);
        Integer[] tablicaNumber2 = new Integer[randomNumber2];
        for (int i = 0; i < randomNumber2; i++) {
            int random = (int) ((Math.random() * randomNumber2) + 1);
            tablicaNumber2[i] = random;
        }

        s23813_zestaw8.tablesMethod(tablicaNumber1, tablicaNumber2);


        System.out.println("\n------------------------------------------------");
        s23813_zestaw8.cwiczenie_05();

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

        for (int i = 0; i < table1.length; i++) {
            newTable[i] = table1[i] + table2[i];
            System.out.println(newTable[i]);
        }
    }

    public void cwiczenie_05() {
        System.out.println("Cwiczenie_05\n");
    }

}
