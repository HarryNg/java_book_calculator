package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGameMain {
//    Generate a random number between 1 and 100.
    public static int getRandomNumber(int max, int min){
        Random random = new Random();
        return random.nextInt((max-min+1))+ min;
    }
//    Prompt the user to guess the number.
    private static final String USER_PROMPT= "Please enter the correct number: ";
    private static final String INCORRECT_RESPONSE = "Number was incorrect. You guessed too ";
    private static final String CORRECT_RESPONSE = "The answer is correct. Your total attempt numbers are: ";
//    Provide feedback on whether the guess is too high, too low, or correct.
    public static void getFeedback(Scanner scanner, int answer){
        System.out.println(USER_PROMPT);
        int attempt=0;
        while (true){
            String[] input = scanner.nextLine().trim().split(" ");
            int number = Integer.parseInt(input[0]);
            //    Repeat steps 2 and 3 until the user guesses the correct number.
            if(input.length==1){
                if(number>answer){
                    System.out.println(INCORRECT_RESPONSE + " High");
                    System.out.println(USER_PROMPT);
                    attempt++;
                }else if(number<answer){
                    System.out.println(INCORRECT_RESPONSE + " Low");
                    System.out.println(USER_PROMPT);
                    attempt++;
                }else {
                    //    Display the number of attempts it took the user to guess the correct number.
                    System.out.println(CORRECT_RESPONSE + attempt);
                    break;
                }
            }else {
                System.out.println("Invalid Input " + USER_PROMPT);
            }
        }

    }

    public static void run(){
        byte max = 100;
        byte min = 1;
        int number = getRandomNumber(max,min);
        Scanner scanner = new Scanner(System.in);
        getFeedback(scanner,number);
    }
}
