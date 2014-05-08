public class SitIn extends Order
{
    private int table;

    public SitIn(double basicCost, int tableNumber)
    {
        super(basicCost);
        this.table = tableNumber;
    }

    public void pay()
    {
        this.paid = true;
    }

    private void displayTable()
    {
        System.out.print("Table number: " + table + "\t");
    }

    public void display()
    {
        if (paid)
        {
            System.out.print("Sit-in order paid. Details: ");
            this.displayTable();
            this.displayCost();
        }
        else
        {
            System.out.print("Sit-in order not yet paid. Details: ");
            this.displayTable();
            this.displayCost();
        }
    }
}
