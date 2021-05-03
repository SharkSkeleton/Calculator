import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your a and b:");

        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("a + b = " + addition(a, b));
        System.out.println("a - b = " + subtraction(a, b));
        System.out.println("a * b = " + multiplication(a, b));
        System.out.println("a / b = " + division(a, b));
    }

    private static int addition(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int multiplication(int a, int b) {
        return a * b;
    }

    // if a < b we will return 0 as infinity
    private static int division(int a, int b) {
        return a > b ? a / b : 0;
    }
}