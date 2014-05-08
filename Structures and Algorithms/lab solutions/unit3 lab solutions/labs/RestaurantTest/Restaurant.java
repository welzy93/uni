public class Restaurant{
	private Order[] orders;
	private int numberOfOrders;
	
	public Restaurant(){
		final int ORDER_NUMBERS=100;
		this.orders=new Order[ORDER_NUMBERS];
	}
	
	public void addOrder(){
		int type;

		System.out.println("1: delivery");
		System.out.println("2: sit in");
		type=Input.getInteger("input order type: ");
		if(type==1)
			this.orders[this.numberOfOrders]=new Delivery();
		else
			this.orders[this.numberOfOrders]=new SitIn();
		this.numberOfOrders++;
	}
	
	public void payForOrder(){
		Order[] unpaidOrders=new Order[this.numberOfOrders];
		int order;
		int numberOfUnpaidOrders=0;
		for(order=0;order<this.numberOfOrders;order++)
		    if(!this.orders[order].isPaid()){
			   unpaidOrders[numberOfUnpaidOrders]=this.orders[order];
			   numberOfUnpaidOrders++;
			}
	    if(numberOfUnpaidOrders!=0){
	    	order=this.selectOrder(unpaidOrders,numberOfUnpaidOrders);
	    	unpaidOrders[order-1].pay();
		}
		else
			System.out.println("no orders waiting to be paid");
	}

	public void noteOrderDelivered(){
		Delivery[] undeliveredOrders=new Delivery[this.numberOfOrders];
		int order;
		int numberOfUndeliveredOrders=0;
		for(order=0;order<this.numberOfOrders;order++)
		   if(this.orders[order] instanceof Delivery)
		      if(!((Delivery)this.orders[order]).isDelivered()){
			      undeliveredOrders[numberOfUndeliveredOrders]=(Delivery)this.orders[order];
				  numberOfUndeliveredOrders++;
			  }
	   if(numberOfUndeliveredOrders!=0){
		   order=this.selectOrder(undeliveredOrders,numberOfUndeliveredOrders);
		   undeliveredOrders[order-1].deliver();
		}
		else
		   System.out.println("no orders waiting to be delivered");
	}
	
	private int selectOrder(Order[] orders, int numberOfOrders){
	    for(int order=0;order<numberOfOrders;order++){
		   System.out.println("ORDER NUMBER: "+(order+1));
		   orders[order].display();
		}
		return Input.getInteger("select order number: ");
	}
	
	public void display(){
		for (int order=0;order<this.numberOfOrders;order++)
			this.orders[order].display();
	}

}
