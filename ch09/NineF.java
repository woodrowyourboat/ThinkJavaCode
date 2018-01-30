public class NineF
{
    public static void main(String[] args)
    {
        printPhoneNumber("501-555-0100");

    }
    private static void printPhoneNumber(String text)
    {
        String areaCode = text.substring(0, 3);
        String exchange = text.substring(4, 7);
        String lineNumber = text.substring(8, 12);

        System.out.println("Area code: " + areaCode);
        System.out.println("Exchange: " + exchange);
        System.out.println("Line Number: " + lineNumber);
    }
}
