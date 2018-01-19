import java.util.Scanner;

public class ConvertTemp
{
    public static void main(String[] args)
    {

        //C to F conversion = Multiply by 9, then divide by 5, then add 32


        double celsius;
        double fahr;


        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many degrees Celsius? ");
        celsius = in.nextDouble();

        // convert and output the result
        fahr =  (((celsius * 9) / 5) + 32);
        System.out.printf("%.01f\u00b0 Celsius = %.01f\u00b0 Fahrenheit", celsius, fahr);
    }

}
