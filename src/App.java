
import java.util.Scanner;

public class App {

    static void operations(int option) {
        Scanner scanner = new Scanner(System.in);
        int numOne;
        int numTwo;
        int result;
        switch (option) {
            case 1:
                numOne = Integer.parseInt(scanner.nextLine());
                numTwo = Integer.parseInt(scanner.nextLine());
                result = numOne + numTwo;
                System.out.println(result);
                break;
            case 2:
                numOne = Integer.parseInt(scanner.nextLine());
                numTwo = Integer.parseInt(scanner.nextLine());
                result = numOne - numTwo;
                System.out.println(result);
                break;
            case 3:
                numOne = Integer.parseInt(scanner.nextLine());
                numTwo = Integer.parseInt(scanner.nextLine());
                result = numOne * numTwo;
                System.out.println(result);
                break;
            case 4:
                numOne = Integer.parseInt(scanner.nextLine());
                numTwo = Integer.parseInt(scanner.nextLine());
                result = numOne / numTwo;
                System.out.println(result);
                break;
            case 5:
                numOne = Integer.parseInt(scanner.nextLine());
                numTwo = Integer.parseInt(scanner.nextLine());
                result = numOne % numTwo;
                System.out.println(result);
                break;
            default:
                System.out.println("Choose anything from 1 to 5");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to new calculator");
        System.out.println("## Choose what I want to perform ##");
        System.out.println("1. Addition       ==) Press 1");
        System.out.println("2. Subtraction    ==) Press 2");
        System.out.println("3. Multiplication ==) Press 3");
        System.out.println("4. Division       ==) Press 4");
        System.out.println("5. Modulos        ==) Press 5");

        // Get the input from the user
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i != 1) {
            System.out.println("Enter the option");
            int userInput = Integer.parseInt(scanner.nextLine());
            operations(userInput);
            i++;
        }

    }
}
