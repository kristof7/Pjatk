package zadanieProgramistyczne3;

public class S23813_zadanieProgramistyczne3 {
    public static void main(String[] args) {
        int inputA = 135;
        int inputB = 60;
        System.out.println("Input a: "+ inputA);
        System.out.println("Input b: "+ inputB);

        System.out.println("Least common multiple: "+ lcm(inputA, inputB));

    }

    public static int lcm(int a, int b) {
        Integer result = a * b / gcd_recursive(a, b);

        return result;
    }

    public static Integer gcd_recursive(int a, int b) {
        if (b != 0)
            return gcd_recursive(b, a % b);
        else
            return a;
    }

}
