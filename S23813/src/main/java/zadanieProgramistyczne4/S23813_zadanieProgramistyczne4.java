package zadanieProgramistyczne4;

import java.util.LinkedList;
import java.util.Scanner;

public class S23813_zadanieProgramistyczne4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        boolean exit;

        do {
            System.out.println("Input value:");
            int value = sc.nextInt();
            numbers.add(value);
            sc.nextLine();
            System.out.println("Add next value? (y/n):");
            String isNext = sc.nextLine();
            if (isNext.equals("y")) {
                exit = false;
            } else {
                exit = true;
            }
        } while (!exit);

        System.out.println("\nInput values:");
        for (Integer val : numbers) {
            if (val == numbers.getLast()) {
                System.out.print(val);
            } else {
                System.out.print(val + ", ");
            }
        }

    }
}
