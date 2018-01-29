import java.util.Collections;

public class Exercise8C
{
    public static void main(String[] args)
    {
        int[] testing = {1, 5, 49, 10, 17, 15, 21};
        arrayMax(testing);
    }


    public static void arrayMax(int[] nums)
    {

        int max = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > max)
            {
                max = nums[i];
            }
        }

        System.out.println(max);


    }
}

