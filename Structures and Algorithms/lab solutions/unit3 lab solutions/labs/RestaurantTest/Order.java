public class Order{
	protected double basicCost;
	protected double finalCost;
	private boolean paid;

	public void pay(){
		this.basicCost=Input.getDouble("input basic cost: ");
		this.paid=true;
	}
	
	public boolean isPaid(){
	   return this.paid;
	}
	
	public void display(){
		if(this.paid){
		   System.out.print(" basic cost: ");
		   System.out.format("%.2f",this.basicCost);
		   System.out.print(" final cost: ");
		   System.out.format("%.2f",this.finalCost);
		   System.out.println(" has been paid");
		}
		else
		   System.out.println(" has not yet been paid");
	}
}