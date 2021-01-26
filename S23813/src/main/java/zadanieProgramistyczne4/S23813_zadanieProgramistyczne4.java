package zadanieProgramistyczne4;

import java.util.LinkedList;
import java.util.Scanner;

public class S23813_zadanieProgramistyczne4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        boolean exit;
        double result = 0;
        Integer count = 0;
        char operator = 0;

        do {
            System.out.println("Input value:");
            int value = sc.nextInt();
            numbers.add(value);

            if (numbers.size() > 1) {

                if (operator != 'y') {

                    switch (operator) {
                        case '+':
                            result += numbers.get(count);
                            break;
                        case '-':
                            result -= numbers.get(count);
                            break;
                        case '*':
                            result *= numbers.get(count);
                            break;
                        default:
                            System.out.println("illegal operand");
                    }
                    System.out.println("\nresult: " + result);
                    exit = false;
                } else {
                    exit = true;
                }
            } else {
                result += numbers.get(count);
                exit = false;
            }

            count++;
            sc.nextLine();
            System.out.println("Add operator (+/-/*) or press 'y' for exit");
            operator = sc.findInLine(".").charAt(0);

        } while (!exit);

    }
}
