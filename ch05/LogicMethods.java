public class LogicMethods
{
    public static void main(String args[])
    {
        printIsLarge(4);
        printIsLargeOrSmall(4);

        printIsLarge(99);
        printIsLargeOrSmall(99);

        printIsLarge(101);
        printIsLargeOrSmall(101);


    }

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
            System.out.println("The number is large\n");
        }
        else if (number < 10)
        {
            System.out.println("The number is small\n");
        }
    }

}
