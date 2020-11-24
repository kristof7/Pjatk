package zadanieProgramistyczne1;

import java.util.Scanner;

public class S23813_zadanieProgramistyczne1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nProgram do obliczania a-tej liczby znaczącej ilorazu dwóch liczb b/c. Zostaniesz poproszony/poproszona o wprowadzenie trzech liczb a,b,c.\n");
        System.out.println("Wprowadz a-tą cyfrę znaczącą:");
        int a = scanner.nextInt();
        System.out.println("Wprowadź liczbę b:");
        int b = scanner.nextInt();
        System.out.println("Wprowadź liczbę c:");
        int c = scanner.nextInt();

        double operation = (double) b / c;
        int[] result = new int[a];
        int count = 0;

        System.out.println("Wynik dzielenia dla liczb " + b + "/" + c + " wynosi: " + operation);

        String[] stringTable = String.format("%.10f", operation).replace(",", "").split("");

        for (int i = 0; i < stringTable.length; i++) {
            if (stringTable[i].matches("[1-9]")) {
                result[i] = Integer.parseInt(stringTable[i]);
                count++;
                if (count == a) {
                    break;
                }
            }
        }
        System.out.println("a-ta cyfra znacząca dla " + b + "/" + c + " wynosi: " + result[a - 1]);
    }
}