import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your a and b:");

        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Potential trouble (division by zero)
        System.out.println("a / b = " + (a / b));
    }
}