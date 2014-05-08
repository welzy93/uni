
abstract class Order {

	double basicCost;
    double finalCost;
    boolean paid;
    
    public Order(double basicCost)
    {
        this.basicCost = basicCost;
        this.finalCost = basicCost;
        this.paid = false;
    }

    
    public void paid()
    {
        this.paid = true;
    }
    
    public boolean isPaid()
    {
        return this.paid;
    }

    public void display()
    {
        if (paid)
        {
            System.out.print("Order paid. Details: ");
            this.displayCost();
        }
        else
        {
            System.out.print("Order not yet paid. Details: ");
            this.displayCost();
        }
    }

    protected void displayCost()
    {
        System.out.print("Cost: £" + basicCost + "Total: £" + finalCost);
    }
}
