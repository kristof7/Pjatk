package zadanieProgramistyczne1;

public class S23813_zadanieProgramistyczne1 {
    public static void main(String[] args) {

        int a = 3;
        int b = 10000;
        int c = 8;

        double operation = (double) b / c;
        int[] result = new int[a];
        int count = 0;

        System.out.println("a-ta cyfra znacząca dla " + b + "/" + c + " wynosi: " + operation);

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