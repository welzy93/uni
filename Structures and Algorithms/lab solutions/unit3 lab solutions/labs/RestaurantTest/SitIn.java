public class SitIn extends Order{
	private int table;

	public SitIn(){
		this.table=Input.getInteger("input table: ");
	}
	
	public void pay(){
		super.pay();
		final double SERVICE_CHARGE=0.15;
		this.finalCost=this.basicCost+(this.basicCost*SERVICE_CHARGE);
	}

	public void display(){
		System.out.println("sit in for table: "+this.table);
		super.display();
	}
}