public class RestaurantTest{
	public static void main(String[] args){
		Restaurant restaurant=new Restaurant();
		int option;
	
		do{
			System.out.println("0:quit");
			System.out.println("1:add order");
			System.out.println("2:pay for order");
			System.out.println("3:note order delivered");
			System.out.println("4:display");
			option=Input.getInteger("select option: ");
			switch(option){
				case 1: restaurant.addOrder();
					    break;
				case 2: restaurant.payForOrder();
						break;
				case 3: restaurant.noteOrderDelivered();
						break;
				case 4: restaurant.display();
			}
		} while(option!=0);
	}
}
	