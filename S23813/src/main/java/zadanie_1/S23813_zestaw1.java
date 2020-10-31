package zadanie_1;

public class S23813_zestaw1 {
    private static final int MAX_BASE = 36;
    private static final String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public void cwiczenie_01() {
        int number = 165;

        System.out.println("165 w systemie dwujkowym = " + Integer.toBinaryString(number));
        System.out.println("165 w systemie ósemkowym = " + Integer.toOctalString(number));
        System.out.println("165 w systemie szestnastkowym = " + Integer.toHexString(number));
    }

    public void cwiczenie_02() {
        int a = 14;
        int b = 14;
        System.out.println("Dla liczby " + a + " binarnej:");
        System.out.println("");
        System.out.print(" Pierwsze przesunięcie będzie wyglądało następująco: ");
        System.out.println(Integer.toBinaryString(a) + ">>" + 1 + " = " + Integer.toBinaryString(a >>= 1));
        System.out.print(" Kolejne przesunięcie będzie wyglądało tak: ");
        System.out.println(Integer.toBinaryString(a) + "<<" + 2 + " = " + Integer.toBinaryString(a <<= 2));
        System.out.print(" Ostatnie przesunięcie wygląda tak: ");
        System.out.println(Integer.toBinaryString(a) + ">>" + 4 + " = " + Integer.toBinaryString(a >>= 4));
        System.out.println("");
        System.out.println("Dla liczby " + b + " nie-binarnej:");
        System.out.println("");
        System.out.println(" Pierwsze przesunięcie będzie wyglądało następująco :" + (b >> 1));
        System.out.println(" Kolejne przesunięcie będzie wyglądało tak: " + (b <<= 2));
        System.out.println(" Ostatnie przesunięcie wygląda tak: " + (b >>= 4));
    }

    public void cwiczenie_03() {

    }

    public void cwiczenie_04() {
        int zzz = 13;
        int xxx = 15;
        int yyy = 6;
        int a1 = 0x6D, a2 = zzz, a = a1 & a2;
        int b1 = 0xA, b2 = xxx, b = b1 | b2;
        int c1 = 11 << 2, c2 = yyy, c = c1 ^ c2;

        System.out.println(a + " " + b + " " + c);
    }
}
