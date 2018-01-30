public class NineD
{
    public static void main(String[] args)
    {
        printAllButFirstThree("Hello");
        printAllButFirstThree("Goodbye");
    }
    private static void printAllButFirstThree(String text)
    {
        System.out.println(text.substring(3));
    }
}
