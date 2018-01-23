public class Multadd
{
    public static void main(String args[])
    {
        //110
        System.out.println(multadd(10, 10, 10));
        //5
        System.out.println(multadd(1, 2, 3));
        //11
        System.out.println(multadd(5, 2, 1));

    }

    private static double multadd(double a, double b, double c)
    {
        return a * b + c;
    }
}
