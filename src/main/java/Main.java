import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 1;
        do {
            menu(scanner);
            System.out.println("One more time?");
            drawOptions(new String[]{"Yes", "No"});
            answer = scanner.nextInt();
        } while (answer != 2);
    }

    private static void drawOptions(String[] options) {
        int iterator = 1;
        for (String s : options) {
            System.out.println(iterator + ": " + s);
            iterator++;
        }
    }

    private static void menu(Scanner scanner) {
        System.out.println("---Welcome---");
        System.out.println("---Choose number type---");
        drawOptions(new String[]{"Integer (1, 2, etc.)", "Float (1.3, 2.1, etc.)"});
        System.out.print("---Enter your option (For example: 1): ");
        int option = scanner.nextInt();
        System.out.println("---Please enter a and b---");
        readInputNumbers(new Scanner(System.in), option);
    }

    private static void readInputNumbers(Scanner scanner, int option) {
        System.out.print("---a: ");
        String a = scanner.nextLine();
        System.out.print("---b: ");
        String b = scanner.nextLine();
        menuSwitcher(option, new String[]{a, b});
    }

    private static void menuSwitcher(int option, String[] arr) {
        switch (option) {
            case 1:
                calculationInt(intNumbers(arr));
                break;
            case 2:
                calculationFloat(floatNumbers(arr));
                break;
        }
    }

    private static void calculationInt(int[] nums) {
        System.out.println(addition(nums));
        System.out.println(subtraction(nums));
        System.out.println(multiplication(nums));
        System.out.println(division(nums));
    }

    private static void calculationFloat(float[] nums) {
        System.out.println(additionFloat(nums));
        System.out.println(subtractionFloat(nums));
        System.out.println(multiplicationFloat(nums));
        System.out.println(divisionFloat(nums));
    }

    private static int[] intNumbers(String[] arr) {
        return new int[]{Integer.parseInt(arr[0]), Integer.parseInt(arr[1])};
    }

    private static float[] floatNumbers(String[] arr) {
        return new float[]{Float.parseFloat(arr[0]), Float.parseFloat(arr[1])};
    }

    private static String addition(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        return "Your addition result is: " + sum;
    }

    private static String subtraction(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum -= nums[i];
        }
        return "Your subtraction result is: " + sum;
    }

    private static String multiplication(int[] nums) {
        int sum = 1;
        for (int num: nums) {
            sum *= num;
        }
        return "Your multiplication result is: " + sum;
    }

    private static String division(int[] nums) {
        return nums[1] != 0 ? "a / b = " + ( ((float) nums[0]) / (float) (nums[1])) : "We can`t divide by zero!";
    }

    private static String additionFloat(float[] nums) {
        float sum = 0;
        for (float num: nums) {
            sum += num;
        }
        return "Your addition result is: " + sum;
    }

    private static String subtractionFloat(float[] nums) {
        float sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum -= nums[i];
        }
        return "Your subtraction result is: " + sum;
    }

    private static String multiplicationFloat(float[] nums) {
        float sum = 1;
        for (float num: nums) {
            sum *= num;
        }
        return "Your multiplication result is: " + sum;
    }

    private static String divisionFloat(float[] nums) {
        return nums[1] != 0 ? "a / b = " + (nums[0] / nums[1]) : "We can`t divide by zero!";
    }

}