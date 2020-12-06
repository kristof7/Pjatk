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
        Boolean czyZbity = false;
        Boolean czyDamka = false;
        Boolean czyBialy = false;
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

    public static String zapisPionków(int pozX, int pozY, String pole, long i, long j, long b, long c) {
        long polozenie = 0b111L;

        int pionX = 0;
        int pionY = 0;

        for (i = 0; i < 6; i++) {

            int wspX = (int) ((pionkiCzarne1 >> 9 * i) & polozenie);
            int wspY = (int) ((pionkiCzarne1 >> 9 * i + 3) & polozenie);
            long czyBialy = ((pionkiCzarne1 >> 9 * i + 6) & 1);
            long czyDamka = ((pionkiCzarne1 >> 9 * i + 7) & 1);
            long czyZbity = ((pionkiCzarne1 >> 9 * i + 8) & 1);

            if (pozX == wspX && pozY == wspY) {
                if (czyBialy == 1) {
                    pole = bPion;
                } else {
                    pole = czPion;
                }
            }

        }
        for (j = 0; j < 6; j++) {

            int wspX = (int) ((pionkiCzarne2 >> 9 * j) & polozenie) + 1;
            int wspY = (int) ((pionkiCzarne2 >> 9 * j + 3) & polozenie);
            long czyBialy = ((pionkiCzarne2 >> 9 * j + 6) & 1);
            long czyDamka = ((pionkiCzarne2 >> 9 * j + 7) & 1);
            long czyZbity = ((pionkiCzarne2 >> 9 * j + 8) & 1);

            if (pozX == wspX && pozY == wspY) {
                if (czyBialy == 1) {
                    pole = bPion;
                } else {
                    pole = czPion;
                }
            }

        }

        for (b = 0; b < 6; b++) {

            int wspX = (int) ((pionkiBiale1 >> 9 * b) & polozenie);
            int wspY = (int) ((pionkiBiale1 >> 9 * b + 3) & polozenie) + 1;
            long czyBialy = ((pionkiBiale1 >> 9 * b + 6) & 1);
            long czyDamka = ((pionkiBiale1 >> 9 * b + 7) & 1);
            long czyZbity = ((pionkiBiale1 >> 9 * b + 8) & 1);

            if (pozX == wspX && pozY == wspY) {
                if (czyBialy == 1) {
                    pole = bPion;
                } else {
                    pole = czPion;
                }
            }

        }
        for (c = 0; c < 6; c++) {

            int wspX = (int) ((pionkiBiale2 >> 9 * c) & polozenie) + 1;
            int wspY = (int) ((pionkiBiale2 >> 9 * c + 3) & polozenie) + 1;
            long czyBialy = ((pionkiBiale2 >> 9 * c + 6) & 1);
            long czyDamka = ((pionkiBiale2 >> 9 * c + 7) & 1);
            long czyZbity = ((pionkiBiale2 >> 9 * c + 8) & 1);

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
