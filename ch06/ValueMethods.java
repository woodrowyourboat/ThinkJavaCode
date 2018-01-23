public class ValueMethods
{

    public static void main(String args[])
    {
        //6.2 output
        //true
        System.out.println(isDivisible(4, 2));
        //false
        System.out.println(isDivisible(5, 3));
        System.out.println("\n");

        //6.3 output
        //true
        System.out.println(isTriangle(3, 4, 5));
        //false
        System.out.println(isTriangle(29, 3, 4));
        //true
        System.out.println(isTriangle(10, 5, 5));


    }

    //6.2 method
    private static boolean isDivisible(int n, int m)
    {
        return n % m == 0;

    }

    //6.3 method
    private static boolean isTriangle(int x, int y, int z)
    {
        // return false if any side length is greater than the sum of other two sides
        if (x > Math.addExact(y, z))
        {
            return false;
        }

        else if (y > Math.addExact(x, z))
        {
            return false;
        }

        else if (z > Math.addExact(x, y))
        {
            return false;
        }

        else
        {
            return true;
        }

    }


}


