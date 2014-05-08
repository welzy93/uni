public class Delivery extends Order{
	private boolean delivered;
	private String name;
	private String address;
	
	public Delivery(){
	   this.name=Input.getString("input name: ");
	   this.address=Input.getString("input address: ");
	}
	
	public void pay(){
	   super.pay();
	   final double DELIVERY_CHARGE=3;
	   this.finalCost=this.basicCost;
	   if(this.finalCost<20)
		  this.finalCost+=DELIVERY_CHARGE;
	}

	public void display(){
		System.out.println("delivery for: "+this.name+" at: "+this.address);
		if (this.delivered)
			System.out.print("  has been delivered");
		else
			System.out.print("  is waiting to be delivered");
		super.display();
	}
	
	public void deliver(){
		this.delivered=true;
	}
	
	public boolean isDelivered(){
		return delivered;
	}
	
}