import java.util.Scanner;

public class MyLoops
{
    public static void main(String[] args)
    {
        //Exercises called here.
        System.out.println("7A");

        System.out.println("For Regular:");
        exercise7aForLoop();

        System.out.println("\n For Reverse:");
        exercise7aForLoopReverse();

        System.out.println("\n While Regular:");
        exercise7aWhileLoop();

        System.out.println("\n While Reverse:");
        exercise7aWhileLoopReverse();

        System.out.println("\n Do While Regular:");
        exercise7aDoWhileLoop();

        System.out.println("\n Do While Reverse:");
        exercise7aDoWhileLoopReverse();


        System.out.println("\n\n\n7B");

        System.out.println("For Loop");
        exercise7bForLoop();

        System.out.println("\n While Loop");
        exercise7bWhileLoop();

        System.out.println("\n Do While Loop");
        exercise7bDoWhileLoop();


        System.out.println("\n\n\n7C");

        System.out.println("For Loop");
        exercise7cForLoop();

        System.out.println("\n While Loop");
        exercise7cWhileLoop();

        System.out.println("\n Do While Loop");
        exercise7cDoWhileLoop();


        System.out.println("\n\n\n7D");

        System.out.println("For Loop");
        exercise7dForLoop(8);

        System.out.println("\n While Loop");
        exercise7dWhileLoop(21);

        System.out.println("\n Do While Loop");
        exercise7dDoWhileLoop(11);


        System.out.println("\n\n\n7E");

        System.out.println("For Loop");
        exercise7eForLoop();

        System.out.println("\n While Loop");
        exercise7eWhileLoop();

        System.out.println("\n Do While Loop");
        exercise7eDoWhileLoop();

    }

    //7A begins

    private static void exercise7aForLoop()
    {
        for (int count = 1; count <= 10; count++)
        {
            System.out.println(count);
        }
    }

    private static void exercise7aForLoopReverse()
    {
        for (int count = 10; count >= 1; count--)
        {
            System.out.println(count);
        }
    }

    private static void exercise7aWhileLoop()
    {
        int count = 1;
        while (count <= 10)
        {
            System.out.println(count);
            count++;
        }
    }

    private static void exercise7aWhileLoopReverse()
    {
        int count = 10;
        while (count >= 1)
        {
            System.out.println(count);
            count--;
        }
    }

    private static void exercise7aDoWhileLoop()
    {
        int count = 1;
        do
        {
            System.out.println(count);
            count++;
        }

        while (count <= 10);
    }

    private static void exercise7aDoWhileLoopReverse()
    {
        int count = 10;
        do
        {
            System.out.println(count);
            count--;
        }

        while (count >= 1);
    }


    //7B Begins

    private static void exercise7bForLoop()
    {
        for (int count = 0; count <= 100; count += 10)
        {
            System.out.println(count);
        }


    }

    private static void exercise7bWhileLoop()
    {
        int count = 0;
        while (count <= 100)
        {
            System.out.println(count);
            count += 10;
        }
    }

    private static void exercise7bDoWhileLoop()
    {
        int count = 0;
        do
        {
            System.out.println(count);
            count += 10;
        }

        while (count <= 100);
    }


    //7C begins
    private static void exercise7cForLoop()
    {
        for (int count = 100; count >= -100; count -= 8)
        {
            System.out.println(count);
        }


    }

    private static void exercise7cWhileLoop()
    {
        int count = 100;
        while (count >= -100)
        {
            System.out.println(count);
            count -= 8;
        }
    }

    private static void exercise7cDoWhileLoop()
    {
        int count = 100;
        do
        {
            System.out.println(count);
            count -= 8;
        }

        while (count >= -100);

    }


    //7D begins
    public static void exercise7dForLoop(int count)

    {
        for (int currentNumber = 1; currentNumber <= count; currentNumber++)
        {
            System.out.println(currentNumber);
        }
    }

    public static void exercise7dWhileLoop(int count)
    {
        int currentNumber = 1;

        while (currentNumber <= count)
        {
            System.out.println(currentNumber);
            currentNumber++;
        }
    }

    public static void exercise7dDoWhileLoop(int count)
    {
        int currentNumber = 1;

        do
        {
            System.out.println(currentNumber);
            currentNumber++;

        }

        while (currentNumber <= count);


    }


    //7E begins
    private static void exercise7eForLoop()
    {
        final int REQUIRED_NUMBER = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please pick a number (Hint: Nada.)");


        {
            for (int userNumber = in.nextInt(); userNumber != REQUIRED_NUMBER; userNumber = in.nextInt())
            {

                System.out.println("Please input a different number.");

            }


        }
    }


    private static void exercise7eWhileLoop()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please pick a number (Hint: Nada.)");
        int userNumber = in.nextInt();
        final int REQUIRED_NUMBER = 0;


        while (userNumber != REQUIRED_NUMBER)
        {
            System.out.println("Please input a different number");
            userNumber = in.nextInt();

        }

    }

    private static void exercise7eDoWhileLoop()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please pick a number (Hint: Nada.)");
        int userNumber = in.nextInt();
        final int REQUIRED_NUMBER = 0;


        do
        {
            System.out.println("Please input a different number");
            userNumber = in.nextInt();
        }

        while (userNumber != REQUIRED_NUMBER);

    }



}





