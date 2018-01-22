public class LogicMethods
{
    public static void main(String args[])
    {
        printIsLarge(4);
        printIsLarge(99);
        printIsLarge(101);

    }

    private static void printIsLarge(int number)
    {
        System.out.println("Number is: " +  number);

        if (number >= 99)
        {
            System.out.println("The number is large. \n");
        }

        else
            {
                System.out.print("\n");
            }
        }

    }
