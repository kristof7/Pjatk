package zadanie_2;

public class S23813_zestaw2 {
    public static void main(String[] args) {
        S23813_zestaw2 s23813_zestaw2 = new S23813_zestaw2();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_01();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_02();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_03();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_04();
    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");

        System.out.println("Wartość '0b10100101' w systemie binarnym przekonwertowana na system dziesietny: " + 0b10100101);
        System.out.println("Wartość '0245' w systemie oktagonalnym przekonwertowana na system dziesietny: " + 0245);
        System.out.println("Wartość '0xA5' w systemie szesnatkowym przekonwertowana na system dziesietny: " + 0xA5);

        System.out.println("\n------- PIERWSZA METODA (konwersja liczby na zapis w systemie) ----------\n");
        int number = 165;

        System.out.println("165 w systemie dwujkowym = " + Integer.toBinaryString(number));
        System.out.println("165 w systemie ósemkowym = " + Integer.toOctalString(number));
        System.out.println("165 w systemie szestnastkowym = " + Integer.toHexString(number));

        System.out.println("\n------- DRUGA METODA (konwersja liczby na zapis w systemie) ----------\n");
        String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int n2 = 165;
        int n8 = 165;
        int n16 = 165;
        int base2 = 2;
        int base8 = 8;
        int base16 = 16;
        String result2 = "";
        String result8 = "";
        String result16 = "";
        while (n2 > 0) {
            result2 = pattern.charAt(n2 % base2) + result2;
            n2 /= base2;
        }
        while (n8 > 0) {
            result8 = pattern.charAt(n8 % base8) + result8;
            n8 /= base8;
        }
        while (n16 > 0) {
            result16 = pattern.charAt(n16 % base16) + result16;
            n16 /= base16;
        }
        System.out.println("165 w systemie dwujkowym = " + result2);
        System.out.println("165 w systemie ósemkowym = " + result8);
        System.out.println("165 w systemie szestnastkowym = " + result16);
    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");

        int d = 14;
        int a = 14;
        System.out.println("Dla liczby " + a + " nie-binarnej:");
        System.out.println("");
        System.out.println(" Pierwsze przesunięcie (o 0 pozycji w prawo) będzie wyglądało następująco :" + (a >> 0));
        System.out.println(" Kolejne przesunięcie (o 2 pozycje w lewo) będzie wyglądało tak: " + (a <<= 2));
        System.out.println(" Ostatnie przesunięcie (o 4 pozycje w prawo) wygląda tak: " + (a >>= 4));

        System.out.println("");
        System.out.println("Dla liczby " + d + " binarnej:");
        System.out.println("");
        System.out.print(" Pierwsze przesunięcie będzie wyglądało następująco: ");
        System.out.println(Integer.toBinaryString(d) + ">>" + 1 + " = " + Integer.toBinaryString(d >>= 0));
        System.out.print(" Kolejne przesunięcie będzie wyglądało tak: ");
        System.out.println(Integer.toBinaryString(d) + "<<" + 2 + " = " + Integer.toBinaryString(d <<= 2));
        System.out.print(" Ostatnie przesunięcie wygląda tak: ");
        System.out.println(Integer.toBinaryString(d) + ">>" + 4 + " = " + Integer.toBinaryString(d >>= 4));
    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

        int number = 1231;
        System.out.println("Wartość reprezentowana przez ostatnie 5 bitów tego literału:");
        System.out.println(number & 0b11111);
        System.out.println("1 lub 0 w zależności od wartości siódmego bitu tego literału:");
        System.out.println(number & 0b11111);
        System.out.println("Wartość poszczególnych bajtów(począwszy od najbardziej znaczącego) z których skłąda sięta liczby:");
        System.out.println((number >> 24) & 0xFF);
        System.out.println((number >> 16) & 0xFF);
        System.out.println((number >> 8) & 0xFF);
        System.out.println(number & 0xFF);
        System.out.println("wartość reprezentowaną przez dwa środkowe bajty literału reprezentowane jako liczba z przedziału");
        System.out.println(number & 0b1111111100000000);
        System.out.println(number & 0b111111110000000000000000);
    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");

        int zzz = 13;
        int xxx = 15;
        int yyy = 6;
        System.out.println("Liczba zzz: " + zzz);
        System.out.println("Liczba xxx: " + xxx);
        System.out.println("Liczba yyy: " + yyy);
        int a1 = 0x6D, a2 = zzz, a = a1 & a2;
        int b1 = 0xA, b2 = xxx, b = b1 | b2;
        int c1 = 11 << 2, c2 = yyy, c = c1 ^ c2;
        System.out.println("");
        System.out.println(a + " " + b + " " + c);
    }
}