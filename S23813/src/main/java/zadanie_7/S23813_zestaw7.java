package zadanie_7;

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
    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");
    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");
    }

}
