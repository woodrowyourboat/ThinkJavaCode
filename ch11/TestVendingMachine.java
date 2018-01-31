public class TestVendingMachine
{
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine);

        vendingMachine.addQuarter();
        System.out.println(vendingMachine);

        vendingMachine.addQuarter();
        System.out.println(vendingMachine);

        vendingMachine.addDime();
        System.out.println(vendingMachine);

        vendingMachine.addNickel();
        System.out.println(vendingMachine);

        System.out.println("Buying an item");
        vendingMachine.buyItem();
        System.out.println(vendingMachine);

        int changeReturned = vendingMachine.extractChange();
        System.out.println("I got " + changeReturned + " cents back!");
        System.out.println(vendingMachine);
    }
}
