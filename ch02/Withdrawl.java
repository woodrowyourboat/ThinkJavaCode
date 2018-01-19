public class Withdrawl
{
    public static void main(String args[])
    {
        int withdrawal = 137;

        int twenties = withdrawal / 20;

        System.out.println("Withdrawal Amount: $" + withdrawal + "\n");
        System.out.println("Twenties: " + twenties);

        int remainder = withdrawal - (20 * twenties);

        System.out.println("$" + remainder + " remaining");


        int tens = remainder / 10;

        System.out.println("Tens: " + tens);

        remainder = withdrawal - ((20 * twenties) + (10 * tens));

        System.out.println("$" + remainder + " remaining");


        int fives = remainder / 5;

        System.out.println("Fives: " + fives);

        remainder = withdrawal - ((20 * twenties) + (10 * tens) + (5 * fives));

        System.out.println("$" + remainder + " remaining");


        int ones = remainder;

        System.out.println("Ones: " + ones);

        remainder = withdrawal - ((20 * twenties) + (10 * tens) + (5 * fives) + (ones));

        System.out.println("$" + remainder + " remaining");

        System.out.println("Optimal change: " + "Twenties: " + twenties + ", Tens: " + tens + ", Fives: " + fives +
                ", Ones: " + ones + (". \n\n Total: $" + withdrawal));


    }
}