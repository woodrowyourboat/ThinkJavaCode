import java.util.Random;

import java.util.Scanner;


/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        // pick a random number
        System.out.println("I'm thinking of a number between 1 and 100 (including both). \n Can you guess what it is?" +
                " ");

        System.out.print("Type a number: ");
        double guess = in.nextInt();

        System.out.printf("Your guess is: %.0f \n",
                guess);

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + number);


        double difference = Math.abs(number - guess);

        System.out.printf("You were off by: %.0f \n", difference);
    }

}
