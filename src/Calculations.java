
import java.util.Scanner;

public class Calculations {

    public int addition() {
        try (Scanner scanner = new Scanner(System.in)) {
            int numOne;
            int numTwo;
            int result;
            System.out.println("You choose addition");
            System.out.println("Enter the number");
            numOne = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the number");
            numTwo = Integer.parseInt(scanner.nextLine());
            System.out.println("Result of addition");
            result = numOne + numTwo;
            System.out.println(result);
            return result;
        }
    }

    public int subtraction() {
        try (Scanner scanner = new Scanner(System.in)) {
            int numOne;
            int numTwo;
            int result;
            System.out.println("You choose subtraction");
            System.out.println("Enter the number");
            numOne = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the number");
            numTwo = Integer.parseInt(scanner.nextLine());
            System.out.println("Result of subtraction");
            result = numOne - numTwo;
            System.out.println(result);
            return result;
        }
    }

    public int multiplication() {
        try (Scanner scanner = new Scanner(System.in)) {
            int numOne;
            int numTwo;
            int result;
            System.out.println("You choose multiplication");
            System.out.println("Enter the number");
            numOne = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the number");
            numTwo = Integer.parseInt(scanner.nextLine());
            System.out.println("Result of multiplication");
            result = numOne * numTwo;
            System.out.println(result);
            return result;
        }
    }

    public int division() {
        try (Scanner scanner = new Scanner(System.in);) {
            int numOne;
            int numTwo;
            int result;
            System.out.println("You choose division");
            System.out.println("Enter the number");
            numOne = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the number");
            numTwo = Integer.parseInt(scanner.nextLine());
            System.out.println("Result of division");
            result = numOne / numTwo;
            System.out.println(result);
            return result;
        }
    }

    public int modulos() {
        try (Scanner scanner = new Scanner(System.in)) {
            int numOne;
            int numTwo;
            int result;
            System.out.println("You choose modulos");
            System.out.println("Enter the number");
            numOne = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the number");
            numTwo = Integer.parseInt(scanner.nextLine());
            System.out.println("Result of modulos");
            result = numOne % numTwo;
            System.out.println(result);
            return result;
        }
    }
}
