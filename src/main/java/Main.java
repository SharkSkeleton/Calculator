import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your a and b:");

        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(addition(a, b));
        System.out.println(subtraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(division(a, b));
    }

    private static String addition(int a, int b) {
        return "a + b = " + (a + b);
    }

    private static String subtraction(int a, int b) {
        return "a - b = " + (a - b);
    }

    private static String multiplication(int a, int b) {
        return "a * b = " + (a * b);
    }

    private static String division(int a, int b) {
        return a > b ? "a / b = " + (a / b) : "We can`t divide by zero!";
    }
}