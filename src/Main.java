import java.util.Scanner;
import JavaCalculator.CalculatorMain;
import LibrarySystem.LibrarySystemMain;
import NumberGame.NumberGameMain;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the main application");
        System.out.println("1: Calculator Program");
        System.out.println("2: Number Guessing Program");
        System.out.println("3: OOP - Library system Display info ");
        System.out.println("Type 'exit' to terminate");
        boolean continueRunning = true;

        do {
            System.out.println("\n[Main] Select an option [1,2,3 or 'exit']: ");
            String[] input = scanner.nextLine().split(" ");
            String inputOne = input[0];
            switch (inputOne){
                case "exit" -> {
                    System.out.println("[Main] Program terminated. \n```");
                    continueRunning = false;
                    scanner.close();
                }
                case "1" -> CalculatorMain.run();
                case "2" -> NumberGameMain.run();
                case "3" -> LibrarySystemMain.run();
                default -> System.out.println("Invalid option. Please enter 1,2 or 'exit'. ");
            }
        }while (continueRunning);

    }
}