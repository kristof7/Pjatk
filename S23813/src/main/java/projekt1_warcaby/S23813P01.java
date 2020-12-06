package projekt1_warcaby;

public class S23813P01 {
    public static long pionkiCzarne1 = 0b100001001100011001100010010100001011100011011100010100L;
    public static long pionkiCzarne2 = 0b100001100100011100100010101100001110100011110100010111L;
    public static long pionkiBiale1 = 0b101101001101111001101110010101101011101111011101110100L;
    public static long pionkiBiale2 = 0b101101100101111100101110101101101110101111110101110111L;
    public static String bp = "\u2B1B";
    public static String czp = "\u2B1C";
    public static String czPion = "\u2659";
    public static String bPion = "\u265F";
    public static String bDamka = "\u265B";
    public static String czDamka = "\u2655";

    public static void main(String[] args) {
        System.out.println("białe pole: " + bp);
        System.out.println("czarne pole: " + czp);
        System.out.println("biały pion: " + bPion);
        System.out.println("czarny pion: " + czPion);
        System.out.println("biała damka: " + bDamka);
        System.out.println("czarna damka: " + czDamka);

        System.out.println("\n-----------------------------------------------------------------------------\n");
        System.out.print("Y 1 2 3 4 5 6 7 8 X");
        System.out.println("");
        for (int y = 8; y >= 1; y--) {
            System.out.print(y + " ");
            boolean czyParzystyY = (y % 2) == 0;
            String pole = "";
            for (int x = 1; x <= 8; x++) {
                boolean czyParzystyX = (x % 2) == 0;
                pole = zapisPlanszy(czyParzystyX, czyParzystyY);
                pole = zapisPionków(x, y, pole, pionkiCzarne1, pionkiCzarne2, pionkiBiale1, pionkiBiale2);
                System.out.print(pole + " ");
            }
            System.out.println("");
        }
        System.out.println("\n-----------------------------------------------------------------------------\n");
    }

    public static String zapisPlanszy(boolean czyParzystyX, boolean czyParzystyY) {
        String pole = "";
        if (czyParzystyY)
            if (czyParzystyX) {
                pole = czp;
                return pole;
            } else {
                pole = bp;
                return pole;
            }
        else {
            if (czyParzystyX) {
                pole = bp;
                return pole;
            } else {
                pole = czp;
                return pole;
            }
        }
    }

    public static String zapisPionków(int pozX, int pozY, String pole, long cz1, long cz2, long b1, long b2) {
        long polozenie = 0b111L;

        for (cz1 = 0; cz1 < 6; cz1++) {

            int wspX = (int) ((pionkiCzarne1 >> 9 * cz1) & polozenie);
            int wspY = (int) ((pionkiCzarne1 >> 9 * cz1 + 3) & polozenie);
            long czyBialy = ((pionkiCzarne1 >> 9 * cz1 + 6) & 1);
            long czyDamka = ((pionkiCzarne1 >> 9 * cz1 + 7) & 1);
            long czyZbity = ((pionkiCzarne1 >> 9 * cz1 + 8) & 1);

            if (pozX == wspX && pozY == wspY) {
                if (czyBialy == 1) {
                    pole = bPion;
                } else {
                    pole = czPion;
                }
            }
        }

        for (cz2 = 0; cz2 < 6; cz2++) {

            int wspX = (int) ((pionkiCzarne2 >> 9 * cz2) & polozenie) + 1;
            int wspY = (int) ((pionkiCzarne2 >> 9 * cz2 + 3) & polozenie);
            long czyBialy = ((pionkiCzarne2 >> 9 * cz2 + 6) & 1);
            long czyDamka = ((pionkiCzarne2 >> 9 * cz2 + 7) & 1);
            long czyZbity = ((pionkiCzarne2 >> 9 * cz2 + 8) & 1);

            if (pozX == wspX && pozY == wspY) {
                if (czyBialy == 1) {
                    pole = bPion;
                } else {
                    pole = czPion;
                }
            }
        }

        for (b1 = 0; b1 < 6; b1++) {

            int wspX = (int) ((pionkiBiale1 >> 9 * b1) & polozenie);
            int wspY = (int) ((pionkiBiale1 >> 9 * b1 + 3) & polozenie) + 1;
            long czyBialy = ((pionkiBiale1 >> 9 * b1 + 6) & 1);
            long czyDamka = ((pionkiBiale1 >> 9 * b1 + 7) & 1);
            long czyZbity = ((pionkiBiale1 >> 9 * b1 + 8) & 1);

            if (pozX == wspX && pozY == wspY) {
                if (czyBialy == 1) {
                    pole = bPion;
                } else {
                    pole = czPion;
                }
            }
        }
        for (b2 = 0; b2 < 6; b2++) {

            int wspX = (int) ((pionkiBiale2 >> 9 * b2) & polozenie) + 1;
            int wspY = (int) ((pionkiBiale2 >> 9 * b2 + 3) & polozenie) + 1;
            long czyBialy = ((pionkiBiale2 >> 9 * b2 + 6) & 1);
            long czyDamka = ((pionkiBiale2 >> 9 * b2 + 7) & 1);
            long czyZbity = ((pionkiBiale2 >> 9 * b2 + 8) & 1);

            if (pozX == wspX && pozY == wspY) {
                if (czyBialy == 1) {
                    pole = bPion;
                } else {
                    pole = czPion;
                }
            }
        }
        return pole;
    }
}
