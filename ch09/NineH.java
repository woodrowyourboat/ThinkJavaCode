public class NineH
{
    public static void main(String[] args)
    {
        System.out.println(isFinn("Finn"));

        System.out.println(isFinn("Jake"));

    }

    private static boolean isFinn(String text)
    {
        String nameFinn = "Finn";
        String nameInput = text;

        return (nameFinn.equals(nameInput));


    }
}
