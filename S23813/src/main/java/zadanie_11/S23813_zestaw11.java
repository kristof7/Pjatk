package zadanie_11;

public class S23813_zestaw11 {

    public static void main(String[] args) {
        S23813_zestaw11 s23813_zestaw11 = new S23813_zestaw11();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw11.cwiczenie_01();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw11.cwiczenie_02();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw11.cwiczenie_03();

    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");

        Alarm alarm = new Alarm();
        alarm.isAlarm = true;

        new DetektorDymu().sprawdz(alarm);

    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");

        CiagnikSiodlowy ciagnikSiodlowy = new CiagnikSiodlowy();
        ciagnikSiodlowy.masa = 50000;
        ciagnikSiodlowy.setIloscOsi(4);
        CiagnikSiodlowy ciagnikSiodlowy2 = new CiagnikSiodlowy();
        ciagnikSiodlowy2.masa = 30000;
        ciagnikSiodlowy2.setIloscOsi(4);

        ciagnikSiodlowy.rozpocznijJazde();
        ciagnikSiodlowy2.rozpocznijJazde();

    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

    }
}


class Alarm extends Exception {

    boolean isAlarm;

}

class DetektorDymu {

    public void sprawdz(Alarm alarm) {

        if (alarm.isAlarm) {
            System.out.println("Uwaga alarm!");
        }
    }
}

class Pojazd {
    String color;
}

class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    public int getIloscOsi() {
        return iloscOsi;
    }

    public void setIloscOsi(int iloscOsi) {
        this.iloscOsi = iloscOsi;
    }
}

class CiagnikSiodlowy extends PojazdKolowy {
    int masa;

    public void rozpocznijJazde() {
        int iloscOsi = super.getIloscOsi();

        if ((masa / iloscOsi) < 11000) {
            System.out.println("Nacisk wynosi: " + ((double) masa / iloscOsi) + " kg");
        } else {
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        }
    }
}
