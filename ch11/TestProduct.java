public class TestProduct
{
    public static void main(String[] args)
    {
        Product product = new Product("Acer Aspire R5 14\" Notebook" );
        System.out.println(product);

        product.stock(6);
        System.out.println(product);

        product.sell(2);
        System.out.println(product);

        product.recordLoss(1);
        System.out.println(product);


    }
}
