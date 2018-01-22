public class LogicMethods
{
    public static void main(String args[])
    {
        //Exercises 5A and 5B output begin here:
        System.out.println("\nExercise 5-A and B: \n");

        printIsLarge(4);
        printIsLargeOrSmall(4);

        printIsLarge(99);
        printIsLargeOrSmall(99);

        printIsLarge(101);
        printIsLargeOrSmall(101);
        //5A and 5B outputs end here.


        //5C output begins here:
        System.out.println("\n Exercise 5-C:\n");

        printLargest(22, 37);
        printLargest(21, 21);
        //5C output ends here.

        //5D output begins here:
        System.out.println("\n Exercise 5-D:\n");

        printLargestOdd(37, 81);
        printLargestOdd(22, 4);
        printLargestOdd(7, 7);
        //5D output ends here.

        //5-4 output begins here:
        System.out.println("\n Exercise 5-4:\n");
        checkFermat(3, 8, 9, 4);
        checkFermat(9, 5, 7, 1);

    }

    //5A and 5B methods begin here:
    private static void printIsLarge(int number)
    {
        System.out.println("Number is: " + number);

        if (number >= 99)
        {
            System.out.println("The number is large.\n");
        }

    }

    private static void printIsLargeOrSmall(int number)
    {

        if (number > 99)
        {
            System.out.println("The number is large.\n");
        }
        else if (number < 10)
        {
            System.out.println("The number is small.\n");
        }
    }
    //5A and 5B methods end here.

    //5C methods begin here:
    private static void printLargest(int number1, int number2)
    {
        System.out.println("The numbers are: " + number1 + " and " + number2);

        if (number1 != number2)
        {
            System.out.println("The largest number is: " + Math.max(number1, number2) + "\n");
        }
        else
        {
            System.out.println("The numbers are equal.\n");
        }
    }
    //5C methods end here.

    //5D methods begin here:
    private static void printLargestOdd(int number1, int number2)
    {
        System.out.println("The numbers are: " + number1 + " and " + number2);

        if ((number1 == number2) && (number1 % 2 != 0) && (number2 % 2 != 0))
        {
            System.out.println("Two odds make an even: " + Math.addExact(number1, number2) + "\n");
        }
        else if (number1 % 2 == 0 && number2 % 2 == 0)
        {
            System.out.println("Neither number is odd. \n");
        }
        else if (number1 % 2 != 0 || number2 % 2 != 0)
        {
            System.out.println("The largest odd number is: " + Math.max(number1, number2) + "\n");
        }
    }
    //5D methods end here.

    //5-4 methods begin here:
    private static void checkFermat(int a, int b, int c, int n)
    {
        //Fermat Last Theorem is a^n +        b^n = c^n

        double fermatFormula = (Math.pow(a, n) + Math.pow(b, n));

        if (n > 2 && fermatFormula == Math.pow(c, n))
        {
            System.out.println("Holy smokes, Fermat was wrong! \n");
        }

        else
        {
            System.out.println("No, that doesn't work. \n");
        }
    }
    //5-4 methods end here.
}
