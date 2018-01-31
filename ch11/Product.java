public class Product
{
    String name;
    int quantityInStock;

    public Product(String name)
    {
        this.name  = name;
    }

    public void stock(int amount)
    {
       int addingAmount = amount;
       quantityInStock = quantityInStock + addingAmount;
    }

    public void sell(int amount)
    {
        int subtractingAmount = amount;
        quantityInStock = quantityInStock - subtractingAmount;
    }

    public void recordLoss(int amount)
    {
        int subtractingAmount = amount;
        quantityInStock = quantityInStock - subtractingAmount;
    }

    public String getName()
    {
        return name;
    }
    public int getQuantityInStock()
    {
        return quantityInStock;
    }



    public String toString()
    {
        return "Product: " + name + ", has a quantity of " + quantityInStock + ".";
    }
}
