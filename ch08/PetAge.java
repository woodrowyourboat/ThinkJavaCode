import java.util.Scanner;

public class PetAge
{
    public static void main(String[] args)
    {
        replayPetAges();
    }

    private static void replayPetAges()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int numberOfPets = in.nextInt();

        int[] petAge = new int[numberOfPets];
        System.out.println("Length is: " + petAge.length);


        int currentPet = 0;

        while (currentPet < petAge.length)
        {
            System.out.println("Enter age of pet " + (currentPet + 1));
            petAge[currentPet] = in.nextInt();
            currentPet++;
        }

        printArray(petAge, "Age");
    }

    private static void printArray(int[] values, String prefix)
    {
        System.out.println("Welcome to printArray!!!!");

        for (int index = 0; index < values.length; index++)
        {
            System.out.println(prefix + " " + (index + 1) + " Is: " + values[index]);
        }
    }

    private static void printArray2(int[] values, String prefix)
    {
        System.out.println("Welcome to printArray2!!!!");

        for (int value : values)
        {
            System.out.println(prefix + " Is: " + value);
        }

    }

}


