public class VendingMachine
{
    private int quarters;
    private int dimes;
    private int nickels;

    public VendingMachine()
    {
        quarters = 0;
        dimes = 0;
        nickels = 0;

    }

    public void addQuarter()
    {
        quarters++;
    }

    public void addDime()
    {
        dimes++;
    }

    public void addNickel()
    {
        nickels++;
    }

    public int getCentsEntered()
    {
        int cents = 0;

        cents += 25 * quarters;
        cents += 10 * dimes;
        cents += 5 * nickels;

        return cents;
    }

    public boolean buyItem()
    {
        final int ITEM_COST = 50;
        boolean itemBought;
        if (getCentsEntered() >= ITEM_COST)
        {
            spendAmount(ITEM_COST);
            itemBought = true;
        }
        else
        {
            itemBought = false;
        }

        return itemBought;
    }

    private void spendAmount(int amount)
    {
        int remainingAmount = amount;

        int maxQuarters = remainingAmount / 25;

        if (quarters >= maxQuarters)
        {
            remainingAmount -= maxQuarters * 25;
            quarters -=  maxQuarters;
        }
        else
        {
            remainingAmount -= quarters * 25;
            quarters = 0;
        }

        int maxDimes = remainingAmount / 10;

        if(dimes >= maxDimes)
        {
            remainingAmount -= maxDimes * 10;
            dimes -= maxDimes;
        }
        else
        {
            remainingAmount -= maxDimes * 10;
            dimes = 0;
        }

        int maxNickels = remainingAmount / 25;

        if(nickels >= maxNickels)
        {

            nickels -=maxNickels;
        }
        else
        {
            nickels =0;
        }
    }

    public int extractChange()
    {
        int change = getCentsEntered();

        quarters = 0;
        dimes = 0;
        nickels = 0;

        return change;
    }


    public String toString()
    {
        return "Vending Machine " + quarters + ":" + dimes + ":" + nickels + ":" + getCentsEntered();
    }
}
