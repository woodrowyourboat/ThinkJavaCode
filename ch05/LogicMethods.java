public class LogicMethods
{
    public static void main(String args[])
    {
        //Exercises 5A and 5B output begin here:
        System.out.println("Exercise 5-A and B \n");

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
}
