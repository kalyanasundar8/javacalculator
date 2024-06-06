
import java.util.Scanner;

public class App {

    // Getting user option
    static void userOption() {
        System.out.println("Welcome to new Java calculator");
        System.out.println("## Choose what I want to perform ##");
        System.out.println("1. Addition       ==) Press 1");
        System.out.println("2. Subtraction    ==) Press 2");
        System.out.println("3. Multiplication ==) Press 3");
        System.out.println("4. Division       ==) Press 4");
        System.out.println("5. Modulos        ==) Press 5");
        System.out.println("5. Exit           ==) Press 0");
    }

    static void operations(int option) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculations calc = new Calculations();
            String confirmation;

            switch (option) {
                case 1 ->
                    calc.addition();
                case 2 ->
                    calc.subtraction();
                case 3 ->
                    calc.multiplication();
                case 4 ->
                    calc.division();
                case 5 ->
                    calc.modulos();
                case 0 -> {
                    System.out.println("Dou you want to exit the calculator (y/n)");
                    confirmation = scanner.nextLine();
                    char yesOrno = confirmation.charAt(0);
                    if (yesOrno == 'y') {
                        System.out.println("Thanks for using java calculator");
                        System.exit(0);
                    } else {
                        userOption();
                    }
                }
                default ->
                    System.out.println("Choose anything from 1 to 5");
            }
        }
    }

    public static void main(String[] args) {

        int i = 1;
        do {
            userOption();
            try (// Get the input from the user
                    Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter the option");
                int userInput = Integer.parseInt(scanner.nextLine());
                operations(userInput);
            }
            i++;
        } while (i != 1);

    }
}
