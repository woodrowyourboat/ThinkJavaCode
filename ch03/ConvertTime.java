import java.util.Scanner;

public class ConvertTime
{
    public static void main(String args[])
    {
        double seconds;
        double hours;
        double minutes;
        double remainder;

        // Conversion rates for times
        final double SEC_PER_MIN = 60;
        final double MIN_PER_HOUR = 60;
        final double SEC_PER_HOUR = 3600;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many seconds? ");
        seconds = in.nextDouble();

        // convert and output the result
        hours = Math.floorDiv((long) seconds, (long) SEC_PER_HOUR);
        minutes = ((seconds % SEC_PER_HOUR) / MIN_PER_HOUR);
        remainder = ((seconds % SEC_PER_HOUR)) % SEC_PER_MIN;

        System.out.printf("%.2f seconds = %.0f hours, %.0f minutes, %.0f seconds,\n",
                seconds, hours, minutes, remainder);

    }
}

// X seconds turns to hours, then minutes and then seconds