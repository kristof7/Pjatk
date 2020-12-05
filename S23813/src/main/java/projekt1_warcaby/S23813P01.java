package projekt1_warcaby;

public class S23813P01 {
    public static long pionki1 = 0b011111111;
    public static long pionki2 = 0b111111111;
    public static long maska = 0;

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
        Boolean czyPionek = true;
        Boolean czyBialy = false;
        for (int y = 8; y >= 1; y--) {
            System.out.print(y + " ");
            boolean czyParzystyY = (y % 2) == 0;
            String pole = "";
            for (int x = 1; x <= 8; x++) {
                boolean czyParzystyX = (x % 2) == 0;
                pole = zapisPlanszy(czyParzystyX, czyParzystyY);
                pole = zapisCzarnychPionków(x, y, 1, 1, pole, czyBialy, czyPionek, czyZbity);
                System.out.print(pole + " ");
            }
            System.out.println("");
        }
        System.out.println("\n-----------------------------------------------------------------------------\n");

    }


    public static String zapisPlanszy(boolean czyParzystyX, boolean czyParzystyY) {

        if (czyParzystyY)
            if (czyParzystyX)
                return czp;
            else
                return bp;
        else {
            if (czyParzystyX)
                return bp;
            else
                return czp;
        }
    }

    public static String zapisCzarnychPionków(int pozX, int pozY, int pionX, int pionY, String pole, Boolean czyBialy, Boolean czyPionek, Boolean czyZbity) {
        String result;
        String starePole = pole;

        for (int zm = 0; zm <= 3; zm++) {
            maska = pionki1 >> zm;
            for (int i = 0; i <= 5; i++) {
                if (pozX == pionX && pozY == pionY) {
                    if ((maska & zm) == 0) {
                        pionki1 = maska;
                    }
                    if ((maska & zm) == 1) {
                        pionki1 = maska ^ 1;
                        pole = czPion;
                    }
                    if ((maska & zm) == 2) {
                        pionki1 = maska ^ 1;
                    }
                    if ((maska & zm) == 3) {
                        int valueX = 0;
                        int valueY = 0;
                        switch (pionX){
                            case 1:
                                valueX = 0b001;
                                break;
                            case 2:
                                valueX = 0b010;
                                break;
                            case 3:
                                valueX = 0b011;
                                break;
                            case 4:
                                valueX = 0b100;
                                break;
                            case 5:
                                valueX = 0b101;
                                break;
                            case 6:
                                valueX = 0b110;
                                break;
                        }
                        switch (pionY){
                            case 1:
                                valueY = 0b001;
                                break;
                            case 2:
                                valueY = 0b010;
                                break;
                            case 3:
                                valueY = 0b011;
                                break;
                            case 4:
                                valueY = 0b100;
                                break;
                            case 5:
                                valueY = 0b101;
                                break;
                            case 6:
                                valueY = 0b110;
                                break;
                        }
                        pionki1 = maska ^ (valueX + valueY);
                    }
                }
            }
        }
        if (!czyZbity) {
            return pole;
        }
        return starePole;
    }
}
