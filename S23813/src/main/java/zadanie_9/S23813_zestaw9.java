package zadanie_9;

public class S23813_zestaw9 {

    public static void main(String[] args) {
        S23813_zestaw9 s23813_zestaw9 = new S23813_zestaw9();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw9.cwiczenie_01();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw9.cwiczenie_02();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw9.cwiczenie_03();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw9.cwiczenie_04();
        System.out.println("\n------------------------------------------------");
        s23813_zestaw9.cwiczenie_05();

    }

    public void cwiczenie_01() {
        System.out.println("Cwiczenie_01\n");
        MethodCurrier methodCurrier = new MethodCurrier();

        int intValue = 1;
        float floatValue = 1f;
        char charValue = 1;
        byte byteValue = 1;

        methodCurrier.setValue(intValue);
        methodCurrier.setValue(floatValue);
        methodCurrier.setValue(charValue);
        methodCurrier.setValue(byteValue);

    }

    public void cwiczenie_02() {
        System.out.println("Cwiczenie_02\n");

    }

    public void cwiczenie_03() {
        System.out.println("Cwiczenie_03\n");

    }

    public void cwiczenie_04() {
        System.out.println("Cwiczenie_04\n");
    }

    public void cwiczenie_05() {
        System.out.println("Cwiczenie_05\n");
    }



}

class MethodCurrier {

    void setValue(int value) {
        System.out.println("wartość podanej zmiennej wynosi " + value + " i jest typu int");
    }

    void setValue(float value) {
        System.out.println("wartość podanej zmiennej wynosi " + value + " i jest typu float");
    }
}

