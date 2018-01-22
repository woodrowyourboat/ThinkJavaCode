public class SimpleMethods
{
    public static void main(String args[])
    {
        printCount(5);

        printSum(4, 6);
        System.out.println();
        printSum(7, 2);
    }

    private static void printCount(int count)
    {
        System.out.println("This count is: " + count);
    }

    private static void printSum(int num1, int num2)
    {
        System.out.print(num1);
        System.out.print(" + ");
        System.out.print(num2);
        System.out.print(" = ");
        System.out.print(num1 + num2);

    }
}

