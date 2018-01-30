public class NineC
{

    public static void main(String[] args)
    {
        printCharacters("Hello");

    }

    private static void printCharacters(String text)
    {

        String position = "";


        for (int index = 0; index < text.length(); index++)
        {
            char letter = text.charAt(index);
            System.out.print(letter);
            //position = position + text.indexOf(index - 1);
            System.out.println(index);


        }


    }


        /*
       for (int i = 0; i < text.length(); i++)


        {
            char letter = text.charAt(i);
            System.out.print(letter);

            int index = text.indexOf(text.charAt(i));
            System.out.println(index);


        }*/

}


