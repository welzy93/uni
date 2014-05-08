public class Delivery extends Order
{
	
	private String name;
    private String address;
    private boolean delivered;
    
    public Delivery(double basicCost, String name, String address)
    {
        super(basicCost);
        this.name = name;
        this.address = address;
        if (basicCost < 20)
        {
            this.finalCost += 3;
        }
    }
    
    public void deliver()
    {
        this.delivered = true;
    }

    public boolean isDelivered()
    {
        return this.delivered;
    }

    private void displayDeliveryDetails()
    {
        System.out.print("Name: " + this.name + "Address: " + this.address);
        if (delivered)
        {
            System.out.print("Name: " + this.name + "Address: " + this.address + "Delivered: Yes");
        }
        else
        {
            System.out.print("Name: " + this.name + "Address: " + this.address + "Delivered: No");
        }

    }
    
    public void display()
    {
        if (paid)
        {
            System.out.print("Delivery order paid. Details: ");
            this.displayDeliveryDetails();
            this.displayCost();
        }
        else
        {
            System.out.print("Delivery order not yet paid. Details: ");
            this.displayDeliveryDetails();
            this.displayCost();
        }
    }
}