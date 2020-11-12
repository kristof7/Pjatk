package zadanie_3;

public class S23813_zestaw3 {
    public static void main(String[] args) {
        S23813_zestaw3 s23813_zestaw2 = new S23813_zestaw3();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_01();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_02();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_03();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_04();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_05();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_06();
        System.out.println("\n------------------------------------------------\n");
        s23813_zestaw2.cwiczenie_07();
    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");

        String stringWord = "hello String";
        char charSign = 'a';
        boolean booleanMinSign = false;
        boolean booleanMaxSign = true;
        byte byteMinNumber = -128;
        byte byteMaxNumber = 127;
        short shortMinNumber = -32768;
        short shortMaxNumber = 32767;
        int intMinNumber = -2147483648;
        int intMaxNumber = 2147483647;
        long longMinNumber = -9223372036854775808L;
        long longMaxNumber = 9223372036854775807L;
        float floatMinNumber = 1.4E-45F;
        float floatMaxNumber = 3.4028235E38F;

        System.out.println(stringWord);
        System.out.println(charSign);
        System.out.println(booleanMinSign);
        System.out.println(booleanMaxSign);
        System.out.println(byteMinNumber);
        System.out.println(byteMaxNumber);
        System.out.println(shortMinNumber);
        System.out.println(shortMaxNumber);
        System.out.println(intMinNumber);
        System.out.println(intMaxNumber);
        System.out.println(longMinNumber);
        System.out.println(longMaxNumber);
        System.out.println(floatMinNumber);
        System.out.println(floatMaxNumber);

    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");


        boolean logiczna = true;
        int calkowita = 165;
        double rzeczywista = 165.0d;
        int kodujacaZnaki = 0b10100101;


        System.out.println(logiczna);
        System.out.println(calkowita);
        System.out.println(rzeczywista);
        System.out.println(kodujacaZnaki);
        System.out.println("-----------------");
//        System.out.println(logiczna == calkowita);
//        System.out.println(logiczna == rzeczywista);
//        System.out.println(logiczna == kodujacaZnaki);
//        System.out.println(calkowita == logiczna);
        System.out.println(calkowita == rzeczywista);
        System.out.println(calkowita == kodujacaZnaki);
//        System.out.println(rzeczywista == logiczna);
        System.out.println(rzeczywista == calkowita);
        System.out.println(rzeczywista == kodujacaZnaki);
//        System.out.println(kodujacaZnaki == logiczna);
        System.out.println(kodujacaZnaki == calkowita);
        System.out.println(kodujacaZnaki == rzeczywista);

    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

        int a123 = 1;
//        int 1napis = 2;
//        int @znak = 3;
//        int void = 4;
//        int null = 5;

    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");
        int zmiennaInt = 7;

        System.out.println(zmiennaInt);
    }

    public void cwiczenie_05() {
        System.out.println("Cwiczenie_05\n");

        char charValue = 'a';
        char charvalue = 'b';
//        skompiluje się zmiana wielkości litery liczy się jako nowa zmienna

        System.out.println(charValue);
        System.out.println(charValue);


    }

    public void cwiczenie_06() {
        System.out.println("Cwiczenie_06\n");
        int a = 7;
        double b = 7d;

//        System.out.println(a = b);
        System.out.println(b = a);

    }

    public void cwiczenie_07() {
        System.out.println("Cwiczenie_07\n");

        byte byteVal = 7;
        char charVal = '7';
        int intVal = 7;
        float floatVal = 7.0f;
        double doubleVal = 7.0d;

//        char charResult = charVal + intVal;
        // z charResult nie można dodawać zmiennej char do zmiennej int, char jest znakiem a byte liczbą
        char charResult = (char) (charVal + intVal); // rozwiazanie problemu - narzucenie konkretego typu dla rezultatu
        int intResult = intVal + charVal;
//        float floatResult = floatVal + doubleVal;
        // z floatResult trzeba określić czy zmienna jest double czy float ewentualnie przekonwertować zmienną do jednego typu, nie można dodawać rózych typów zmiennoprzecinkowych
        float floatResult = (float) (floatVal + doubleVal); // rozwiazanie problemu- narzucenie konkretego typu dla rezultatu

        float byteResult = byteVal + intVal;

    }
}