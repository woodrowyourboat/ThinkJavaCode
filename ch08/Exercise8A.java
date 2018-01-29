import java.util.Arrays;

public class Exercise8A
{
    public static void main(String[] args)
    {
        int trial[] = {1, 3, 5, 7, 9, 21, 10000};

        printArray(trial);
    }


    public static void printArray(int[] nums)
    {
        System.out.println("The elements are: " + Arrays.toString(nums));
    }
}

