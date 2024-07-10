package JavaCalculator;


import java.util.Scanner;

public class CalculatorMain {
    public static boolean isNumber(String str){
        return str.chars().allMatch( Character::isDigit);
    }
    public static void printInvalidInput(){
        System.out.println("Invalid input. Please enter a valid number");
    }

    public static double getInputNumber(Scanner scanner, String prompt){
        while(true){
            System.out.println(prompt);
            String[] input = scanner.nextLine().trim().split(" ");
            String inputPartOne = input[0];
            if(inputPartOne.equalsIgnoreCase("exit")){
                System.out.println("The program is now terminated. ");
                System.exit(0);
            }
            if(input.length== 1 && isNumber(inputPartOne)){
                return Double.parseDouble(inputPartOne);
            }else{
                printInvalidInput();
            }
        }
    }
    public static String getOperation(Scanner scanner){
        while (true){
            System.out.println("Please choose an operation: addition (+), subtraction (-), multiplication (*), or division (/)");
            String operation = scanner.nextLine().trim().split(" ")[0];
            if(operation.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            if(operation.equalsIgnoreCase("+")
                    || operation.equalsIgnoreCase("-")
                    || operation.equalsIgnoreCase("*")
                    || operation.equalsIgnoreCase("/")){
                return operation;
            }else {
                printInvalidInput();
            }
        }
    }
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        boolean continuous = true;
        do {

            //Prompt the user to enter two numbers.
            double firstNumber = getInputNumber(scanner,"Please enter the first number ");
            double secondNumber = getInputNumber(scanner,"Please enter the second number ");

            //Prompt the user to choose an operation: addition, subtraction, multiplication, or division.
            String operation = getOperation(scanner);

            //Perform the chosen operation on the input numbers and display the result.
            double result = 0;
            switch (operation){
                case "+" -> result = firstNumber + secondNumber;
                case "-" -> result = firstNumber - secondNumber;
                case "*" -> result = firstNumber * secondNumber;
                case "/" -> {
                    if(secondNumber != 0){
                        result = firstNumber / secondNumber;
                    }else {
                        System.out.println("Cannot divide by zero. Please try again");
                        result = Double.NaN;
                    }
                }
            }

            System.out.println("result: "+ result);

        }while(continuous);

    }
}


