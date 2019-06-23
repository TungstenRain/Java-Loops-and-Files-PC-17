package ch04pc17;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose: random number guessing game
 */
public class Ch04pc17 {

    public static void main(String[] args) {
        //variables
        int number1, guess, counter = 0;
        boolean correct = false;
        
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //create random number
        Random randomNumbers = new Random();
        number1 = randomNumbers.nextInt(101);
        
        //Begin game
        while (!correct)
        {
            System.out.print("Guess a number between 0 and 100.  Your guess: ");
            guess = keyboard.nextInt();
            
            if (guess == number1)
            {
                System.out.println("Great guess.  It took you " + counter + " tries.");
                break;
            }
            else if (guess < number1)
            {
                System.out.println("Your guess " + guess + " was too low.  Try again.");
            }
            else if (guess > number1)
            {
                System.out.println("Your guess " + guess + " was too high.  Try again.");
            }
            counter++;
        }
            
    }
    
}
