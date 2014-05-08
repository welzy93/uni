public class Restaurant {
	 private Order[] orders;
	 
	 public Restaurant()
	    {
	        this.orders = new Order[0];
	    }
	 
	 public void add(Order order)
	    {
	        Order[] newOrders;

	        if (this.orders.length == 0)
	        {
	            newOrders = new Order[1];
	            newOrders[0] = order;
	        }
	        else
	        {
	            newOrders = new Order[this.orders.length + 1];

	            for (int i = 0; i < this.orders.length; i++)
	            {
	                newOrders[i] = this.orders[i];
	            }

	            newOrders[this.orders.length] = order;
	        }

	        this.orders = newOrders;

	    }

	    public int orderCount()
	    {
	        return this.orders.length;
	    }

	    public Order order(int orderNo)
	    {
	        return this.orders[orderNo];
	    }

	    public void pay(int orderNumber)
	    {
	        this.orders[orderNumber].paid();
	    }

	    public void deliver(int orderNumber)
	    {
	        Delivery order = (Delivery) this.orders[orderNumber];
	        order.deliver();
	        this.orders[orderNumber] = order;
	    }
}
