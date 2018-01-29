import java.util.Arrays;

public class Exercise8B
{
    public static void main(String[] args)
    {
        int[] testing = {1, 5, 4, 10};
        arrayTotal(testing);
    }

    public static void arrayTotal(int[] nums)
    {
        int total = 0;
        for (int allElements : nums)
        {
            total += allElements;
        }
        System.out.println("The total of all elements is: " + total);

    }
}
