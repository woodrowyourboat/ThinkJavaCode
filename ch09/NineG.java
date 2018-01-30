import com.sun.org.apache.xpath.internal.SourceTree;

public class NineG
{
    public static void main(String[] args)
    {
        findFirstE("Hello");
        findFirstE("Goodbye");

    }

    private static void findFirstE(String text)
    {
        int index = text.indexOf('e');
        System.out.println(index);
    }
}
