package projekt3_zwierzeta;

import java.io.*;
import java.util.Arrays;

public class S23813_p03 {

    private static String filePath = "wilki.txt";

    public static void main(String[] args) {

        Ssak[] szczenieta = {};
        Wadera waderaMloda1 = new Wadera("WaderaMloda", (short) 2021, true, 0, szczenieta);
        Wadera waderaMloda2 = new Wadera("WaderaMloda2", (short) 2020, true, 0, szczenieta);
        Wilk wilkMlody1 = new Wilk("WilkMlody", (short) 2020, true, "stadoA", 4);
        Wilk wilkMlody2 = new Wilk("WilkMlody2", (short) 2021, true, "stadoB", 3);
        Ssak[] szczenieta1 = {waderaMloda1, wilkMlody1};
        Ssak[] szczenieta2 = {waderaMloda2};
        Ssak[] szczenieta3 = {wilkMlody2};

        Wadera wadera1 = new Wadera("Wadera1", (short) 2014, false, 2, szczenieta1);
        Wadera wadera2 = new Wadera("Wadera2", (short) 2015, false, 1, szczenieta2);
        Wadera wadera3 = new Wadera("Wadera3", (short) 2016, false, 0, szczenieta);
        Wadera wadera4 = new Wadera("Wadera4", (short) 2017, false, 0, szczenieta);
        Wadera wadera5 = new Wadera("Wadera5", (short) 2018, false, 1, szczenieta3);
        Wadera wadera6 = new Wadera("Wadera5", (short) 2013, false, 0, szczenieta);

        Wilk wilk1 = new Wilk("Wilk1", (short) 2012, false, "stadoA", 1);
        Wilk wilk2 = new Wilk("Wilk2", (short) 2013, false, "stadoB", 1);
        Wilk wilk3 = new Wilk("Wilk3", (short) 2014, false, "stadoA", 2);
        Wilk wilk4 = new Wilk("Wilk4", (short) 2016, false, "stadoB", 2);
        Wilk wilk5 = new Wilk("Wilk5", (short) 2015, false, "stadoA", 3);
        Wilk wilk6 = new Wilk("Wilk6", (short) 2011, false, "stadoB", 3);


        Ssak[] stadoA = {wilk1, wilk3, wilk5, wadera1, wadera3, wadera5, waderaMloda1, wilkMlody1};
        Ssak[] stadoB = {wilk2, wilk4, wilk6, wadera2, wadera4, wadera6, waderaMloda2, wilkMlody2};

        File file = new File(filePath);

        if (file.exists() && !file.isDirectory() & file.length() > 0) {
            zaladuj(filePath);
        } else {
            try (FileOutputStream fos = new FileOutputStream(filePath)) {

                ObjectOutputStream objectA = new ObjectOutputStream(fos);
                objectA.writeObject(" ----- STADO A ---- ");

                for (Ssak s : stadoA) {
                    s.zapisz(fos);
                }

                ObjectOutputStream objectB = new ObjectOutputStream(fos);
                objectB.writeObject(" ----- STADO B ---- ");

                for (Ssak s : stadoB) {
                    s.zapisz(fos);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Ssak[] zaladuj(String sciezka) {

        try (FileInputStream fileInputStream = new FileInputStream(sciezka)) {

            ObjectInputStream objStream;
            try {
                do {
                    objStream = new ObjectInputStream(fileInputStream);
                    Object o = objStream.readObject();
                    System.out.println(o);
                } while (true);
            } catch (EOFException e) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Ssak implements Serializable {
    private String imie;
    private short rokUrodzenia;
    private boolean mlody;

    public Ssak(String imie, short rokUrodzenia, boolean mlody) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.mlody = mlody;
    }

    public String przedstawSie() {
        return "{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", mlody=" + mlody +
                '}';
    }

    @Override
    public String toString() {
        return "Ssak{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", mlody=" + mlody +
                '}';
    }

    void zapisz(FileOutputStream fileOutputStream) {
        try {
            ObjectOutputStream object = new ObjectOutputStream(fileOutputStream);
            object.writeObject(this.przedstawSie());
        } catch (Exception e) {
            e.getStackTrace();
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


