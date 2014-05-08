
public class RestaurantTest {
	static Restaurant restaurants = new Restaurant();


	public static void main(String[] args){
		
		int option;
		do{
			System.out.println("RESTAURANT ORDERING SYSTEM");
	        System.out.println("--------------------------");
	        System.out.println();
	        System.out.println("1. Add order");
	        System.out.println("2. Pay order");
	        System.out.println("3. Note Order Delivered");
	        System.out.println("4. Display orders");
	        System.out.println("0. Exit");
			option=Input.getInteger("select option: ");
			switch(option){
				case 1: addOrder();
						break;
				case 2: payOrder();
						break;
				case 3: deliveredorder();
						break;
				case 4: displayOrder();
			      break;
                default:
                    System.out.println("That is not a valid selection");
                    break;
			
		}
	}while(option !=0);
}

	private static void addOrder() {
		Character selection;
		selection = Character.toUpperCase(Input.getCharacter("\"[S]it in, [D]elivery, or [C]ancel: "));
		
		selection = 'I';
		switch (selection)
        {
            case 'S':
                addSitIn();
                break;
            case 'D':
                addDelivery();
                break;
            case 'C':
                
                break;
            default:
                System.out.println("That is not a valid selection.");
        }
		
	}
	
	private static void addSitIn()
    {
        double price = getPrice();
        int tableNumber = Input.getInteger("Please enter the table number: ");
        Order order = new SitIn(price, tableNumber);
        restaurants.add(order);

    }

    private static void addDelivery()
    {
        double price = getPrice();
        String name = Input.getString("Please enter the customer name: ");
        String address = Input.getString("Please enter the customer address: ");
        Order order = new Delivery(price, name, address);
        restaurants.add(order);
    }
    
    private static double getPrice()
    {
        return Input.getDouble("Please enter the order price: ");
    }
	
	private static void payOrder() {
		 Order[] unpaidOrders = new Order[restaurants.orderCount()];
	        int[] unpaidOrdersId = new int[restaurants.orderCount()];
	        int unpaidOrderCount = 0;
	        for (int i = 0; i < restaurants.orderCount(); i++)
	        {
	            if (!restaurants.order(i).isPaid())
	            {
	                unpaidOrders[unpaidOrderCount] = restaurants.order(i);
	                unpaidOrdersId[unpaidOrderCount] = i;
	                unpaidOrderCount++;
	            }
	        }

	        for (int i = 0; i < unpaidOrderCount; i++)
	        {
	            System.out.print(unpaidOrders[i] + ". ");
	            unpaidOrders[i].display();
	        }

	        if (unpaidOrderCount > 0)
	        {
	            int selection = Input.getInteger("Please select an order to pay: ");

	            restaurants.pay(selection);
	        }
	        else
	        {
	            System.out.println("No unpaid orders.");
	        }

		
	}
	
	private static void deliveredorder() {
		 Order[] undelivered = new Order[restaurants.orderCount()];
	        int[] undeliveredOrderId = new int[restaurants.orderCount()];
	        int undeliveredOrderCount = 0;
	        for (int i = 0; i < restaurants.orderCount(); i++)
	        {
	            if (restaurants.order(i) instanceof Delivery)
	            {
	                Delivery thisOrder = (Delivery) restaurants.order(i);
	                if (!thisOrder.isDelivered())
	                {
	                    undelivered[undeliveredOrderCount] = restaurants.order(i);
	                    undeliveredOrderId[undeliveredOrderCount] = i;
	                    undeliveredOrderCount++;
	                }
	            }
	        }

	        for (int i = 0; i < undeliveredOrderCount; i++)
	        {
	            System.out.print(undeliveredOrderId[i] + ". ");
	            undelivered[i].display();
	        }

	        if (undeliveredOrderCount > 0)
	        {
	            int selection = Input.getInteger("Please select an order to deliver: ");

	            restaurants.deliver(selection);
	        }
	        else
	        {
	            System.out.println("No undelivered orders.");
	            Input.getString("Press any key to continue.");
	        }
		
	}
	
	private static void displayOrder() {
		 for (int i = 0; i < restaurants.orderCount(); i++)
	        {
	            restaurants.order(i).display();
	        }
		
	}


	


	


	
}