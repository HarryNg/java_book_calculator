package NumberGame;

import java.util.Random;

public class NumberGameMain {
//    Generate a random number between 1 and 100.
    public static int getRandomNumber(int max, int min){
        Random random = new Random();
        return random.nextInt((max-min+1))+ min;
    }
//    Prompt the user to guess the number.
//    Provide feedback on whether the guess is too high, too low, or correct.
//    Repeat steps 2 and 3 until the user guesses the correct number.
//    Display the number of attempts it took the user to guess the correct number.
    public static void run(){
        byte max = 100;
        byte min = 1;
        int number = getRandomNumber(max,min);
        System.out.println(number);
    }
}
