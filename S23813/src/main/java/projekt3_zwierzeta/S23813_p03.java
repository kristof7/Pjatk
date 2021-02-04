package projekt3_zwierzeta;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class S23813_p03 {

    private static String fileName = "wilki.txt";

    public static void main(String[] args) throws IOException {

        Ssak ssak = new Ssak();

        Wadera wadera1 = new Wadera("Wadera1", (short) 2014, false);
        Wadera wadera2 = new Wadera("Wadera2", (short) 2015, false);
        Wadera wadera3 = new Wadera("Wadera3", (short) 2016, false);
        Wadera wadera4 = new Wadera("WaderaMloda", (short) 2021, true);
        Wilk wilk1 = new Wilk("Wilk1", (short) 2012, false);
        Wilk wilk2 = new Wilk("Wilk2", (short) 2013, false);
        Wilk wilk3 = new Wilk("Wilk2", (short) 2014, false);
        Wilk wilk4 = new Wilk("WilkMlody", (short) 2020, true);

        File file = new File(fileName);

        if (file.exists() && !file.isDirectory() && file.length() > 0) {
            ssak.zaladuj(fileName);
        } else {
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                wilk1.zapisz(fos);
                wilk2.zapisz(fos);
                wilk3.zapisz(fos);
                wilk4.zapisz(fos);
                wadera1.zapisz(fos);
                wadera2.zapisz(fos);
                wadera3.zapisz(fos);
                wadera4.zapisz(fos);
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
        return "Ssak{" +
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

    public Wadera(String imie, short rokUrodzenia, boolean mlody) {
        super(imie, rokUrodzenia, mlody);
    }
}

class Wilk extends Ssak {
    private String nazwaStada;
    private int pozycja;

    public Wilk(String imie, short rokUrodzenia, boolean mlody) {
        super(imie, rokUrodzenia, mlody);
    }
}


