package projekt3_zwierzeta;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class S23813_p03 {

    private static String fileName = "wilki.txt";

    public static void main(String[] args) throws IOException {

        Ssak ssak = new Ssak();
        Wadera wadera7 = new Wadera("WaderaMloda", (short) 2021, true, 0, null);
        Wadera wadera8 = new Wadera("WaderaMloda2", (short) 2020, true, 0, null);
        Wilk wilk7 = new Wilk("WilkMlody", (short) 2020, true, "stadoA", 4);
        Wilk wilk8 = new Wilk("WilkMlody2", (short) 2021, true, "stadoB", 3);

        Ssak[] szczenieta1 = {wadera7, wilk7};
        Ssak[] szczenieta2 = {wadera8};
        Ssak[] szczenieta3 = {wilk8};

        Wadera wadera1 = new Wadera("Wadera1", (short) 2014, false, 2, szczenieta1);
        Wadera wadera2 = new Wadera("Wadera2", (short) 2015, false, 1, szczenieta2);
        Wadera wadera3 = new Wadera("Wadera3", (short) 2016, false, 0, null);
        Wadera wadera4 = new Wadera("Wadera4", (short) 2017, false, 0, null);
        Wadera wadera5 = new Wadera("Wadera5", (short) 2018, false, 1, szczenieta3);
        Wadera wadera6 = new Wadera("Wadera5", (short) 2013, false, 0, null);

        Wilk wilk1 = new Wilk("Wilk1", (short) 2012, false, "stadoA", 1);
        Wilk wilk2 = new Wilk("Wilk2", (short) 2013, false, "stadoB", 1);
        Wilk wilk3 = new Wilk("Wilk3", (short) 2014, false, "stadoA", 2);
        Wilk wilk4 = new Wilk("Wilk4", (short) 2016, false, "stadoB", 2);
        Wilk wilk5 = new Wilk("Wilk5", (short) 2015, false, "stadoA", 3);
        Wilk wilk6 = new Wilk("Wilk6", (short) 2011, false, "stadoB", 3);


        Ssak[] stadoA = {wilk1, wilk3, wilk5, wadera1, wadera3, wadera5, wadera7, wilk7};
        Ssak[] stadoB = {wilk2, wilk4, wilk6, wadera2, wadera4, wadera6, wadera8, wilk8};

        File file = new File(fileName);

        if (file.exists() && !file.isDirectory() && file.length() > 0) {
            ssak.zaladuj(fileName);
        } else {
            try (FileOutputStream fos = new FileOutputStream(fileName)) {

                String text = " ----- STADO A ---- ";
                byte[] stadoAText = text.getBytes();
                String text2 = " ----- STADO B ---- ";
                byte[] stadoBText = text2.getBytes();

                fos.write(stadoAText);
                for (Ssak s : stadoA) {
                    s.zapisz(fos);
                }
                fos.write(stadoBText);
                for (Ssak s : stadoB) {
                    s.zapisz(fos);
                }
            }
        }
    }
}

class Ssak {
    private String imie;
    private short rokUrodzenia;
    private boolean mlody;

    public Ssak(String imie, short rokUrodzenia, boolean mlody) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.mlody = mlody;
    }

    public Ssak() {

    }

    public String przedstawSie() {
        return "{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", mlody=" + mlody +
                '}';
    }

    void zapisz(FileOutputStream fileOutputStream) {
        try {
            byte[] array = przedstawSie().getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(array);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    void zaladuj(String sciezka) {

        File file = new File(sciezka);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int line;
            while ((line = fileInputStream.read()) != -1) {
                System.out.print((char) line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Wadera extends Ssak {
    private int iloscSzczeniat;
    private Ssak[] szczenieta;

    public Wadera(String imie, short rokUrodzenia, boolean mlody, int iloscSzczeniat, Ssak[] szczenieta) {
        super(imie, rokUrodzenia, mlody);
        this.iloscSzczeniat = iloscSzczeniat;
        this.szczenieta = szczenieta;
    }

    public String przedstawSie() {
        return "Wadera{" + super.przedstawSie() + ", " +
                "iloscSzczeniat=" + iloscSzczeniat +
                ", szczenieta=" + Arrays.toString(szczenieta) +
                '}';
    }
}

class Wilk extends Ssak {
    private String nazwaStada;
    private int pozycja;

    public Wilk(String imie, short rokUrodzenia, boolean mlody, String nazwaStada, int pozycja) {
        super(imie, rokUrodzenia, mlody);
        this.nazwaStada = nazwaStada;
        this.pozycja = pozycja;
    }

    public String przedstawSie() {
        return "Wilk{" + super.przedstawSie() + ", " +
                "nazwaStada='" + nazwaStada + '\'' +
                ", pozycja=" + pozycja +
                '}';
    }
}


