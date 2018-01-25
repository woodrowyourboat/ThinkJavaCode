
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame
{
    public static void main(String[] args)
    {
        play();

    }

    private static void play()
    {
        System.out.println("Welcome to the ultimate number guessing game!");

        int randomNumber = getRandomNumber();

        System.out.println("The secret number is " + randomNumber);

        Scanner in = new Scanner(System.in);

        int guess;

        do
        {
            System.out.println("What is your guess?");
            guess = in.nextInt();

            if (isCold(guess, randomNumber))
            {
                System.out.println("You are cold!");
            }

            else if (isHot(guess, randomNumber))
            {
                System.out.println("You are hot!");


            }
        }

        while (guess != randomNumber);

        System.out.println("You got it!");


    }

    private static boolean isCold(int guess, int randomNumber)
    {
        final int COLD_DIFFERENCE = 20;
        Boolean cold = false;
        if ((randomNumber + COLD_DIFFERENCE) < guess || guess < (randomNumber - COLD_DIFFERENCE))
        {
            cold = true;
        }
        return cold;


    }

    private static boolean isHot(int guess, int randomNumber)
    {

        final int HOT_DIFFERENCE = 10;
        Boolean hot = false;

        if ((randomNumber + HOT_DIFFERENCE) >= guess && guess >= (randomNumber - 10) && guess != randomNumber)
        {
            hot = true;
        }

        return hot;
    }



    private static int getRandomNumber()
    {
        final int MAX_NUMBER = 100;

        Random random = new Random();
        return random.nextInt(MAX_NUMBER) + 1;


    }
}





