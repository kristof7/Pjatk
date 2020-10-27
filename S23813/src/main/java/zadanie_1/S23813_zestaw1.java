package zadanie_1;

public class S23813_zestaw1 {
    private static final int MAX_BASE = 36;
    private static final String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public void cwiczenie_01() {
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
    }

    public void cwiczenie_03() {
    }

    public void cwiczenie_04() {
    }
}
