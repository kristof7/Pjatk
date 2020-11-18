package zadanie_5;

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

        boolean booly = false;

        int whileValue = 0;

        while (booly) {
            whileValue++;
            System.out.println("while: " + whileValue);
        }

        int doWhileValue = 0;

        do {
            doWhileValue++;
            System.out.println("do-while: " + doWhileValue);
        } while (booly);

        //ODP: Różnica jest taka, ze do-while wykona się przynajmniej jeden raz w przeciwnosći do pętli while gdzie od początku musi byc spełniony warunek
    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");

        int n = 0;
        for (int i = 1; i <= 10; i++) {
            double power = Math.pow(2, n);
            System.out.println(i + ".  " + 1 / power);
            n++;
        }
    }

    public void cwiczenie_05() {
        System.out.println("Cwiczenie_05\n");

        int wrt = 7;

        int n = 0;
        for (int i = 1; i <= 10; i++) {
            double power = Math.pow(2, n);
            System.out.println(i + ".  " + 1 / power * wrt);
            n++;
        }

    }

    public void cwiczenie_06() {
        System.out.println("Cwiczenie_06\n");

        int a = -1500;
        int b = 1500;

        System.out.println(b + " podzielne przez 2 bez reszty:\n");
        for (int i = 0; i < b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
        System.out.println(b + " podzielne przez 3 bez reszty:\n");
        for (int i = 0; i < b; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
        System.out.println(a + " podzielne przez 2 bez reszty:\n");
        for (int i = 0; i > a; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
        System.out.println(a + " podzielne przez 3 bez reszty:\n");
        for (int i = 0; i > a; i--) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public void cwiczenie_07() {
        System.out.println("Cwiczenie_07\n");

        String trojkat = "";
        for (int i = 0; i < 5; i++) {
            trojkat += "*";
            System.out.println(trojkat);
        }
    }
}

