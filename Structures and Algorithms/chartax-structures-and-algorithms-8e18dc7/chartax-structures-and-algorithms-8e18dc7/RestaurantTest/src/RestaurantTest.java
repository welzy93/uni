public class RestaurantTest
{

    static Restaurant restaurant = new Restaurant();

    public static void main(String[] args)
    {
        boolean running = true;

        while (running)
        {
            printMenu();
            Integer selection;

            try
            {
                selection = Input.getInteger("Please select an option: ");
            }
            catch (Exception e)
            {
                selection = 1;
            }

            switch (selection)
            {
                case 1:
                    addOrder();
                    break;
                case 2:
                    payOrder();
                    break;
                case 3:
                    deliverOrder();
                    break;
                case 4:
                    display();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("That is not a valid selection");
                    break;
            }
        }
    }

    public static void printMenu()
    {
        System.out.println("RESTAURANT ORDERING SYSTEM");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("1. Add order");
        System.out.println("2. Pay order");
        System.out.println("3. Deliver order");
        System.out.println("4. Display orders");
        System.out.println("0. Exit");
    }

    public static void addOrder()
    {
        boolean selecting = true;

        while (selecting)
        {
            Character selection;

            try
            {
                selection = Character.toUpperCase(Input.getCharacter("\"[S]it in, [D]elivery, or [C]ancel: "));
            }
            catch (Exception e)
            {
                selection = 'x';
            }
            switch (selection)
            {
                case 'S':
                    selecting = false;
                    addSitIn();
                    break;
                case 'D':
                    selecting = false;
                    addDelivery();
                    break;
                case 'C':
                    selecting = false;
                    break;
                default:
                    System.out.println("That is not a valid selection.");
            }
        }

    }

    private static void addSitIn()
    {
        double price = getPrice();
        int tableNumber = Input.getInteger("Please enter the table number: ");
        Order order = new SitIn(price, tableNumber);
        restaurant.add(order);

    }

    private static void addDelivery()
    {
        double price = getPrice();
        String name = Input.getString("Please enter the customer name: ");
        String address = Input.getString("Please enter the customer address: ");
        Order order = new Delivery(price, name, address);
        restaurant.add(order);
    }

    private static double getPrice()
    {
        return Input.getDouble("Please enter the order price: ");
    }

    public static void payOrder()
    {
        Order[] unpaidOrders = new Order[restaurant.orderCount()];
        int[] unpaidOrdersId = new int[restaurant.orderCount()];
        int unpaidOrderCount = 0;
        for (int i = 0; i < restaurant.orderCount(); i++)
        {
            if (!restaurant.order(i).isPaid())
            {
                unpaidOrders[unpaidOrderCount] = restaurant.order(i);
                unpaidOrdersId[unpaidOrderCount] = i;
                unpaidOrderCount++;
            }
        }

        for (int i = 0; i < unpaidOrderCount; i++)
        {
            System.out.print(unpaidOrdersId[i] + ". ");
            unpaidOrders[i].display();
        }

        if (unpaidOrderCount > 0)
        {
            int selection = Input.getInteger("Please select an order to pay: ");

            restaurant.pay(selection);
        }
        else
        {
            System.out.println("No unpaid orders.");
        }

        Input.getString("");
    }

    public static void deliverOrder()
    {
        Order[] undelivered = new Order[restaurant.orderCount()];
        int[] undeliveredOrderId = new int[restaurant.orderCount()];
        int undeliveredOrderCount = 0;
        for (int i = 0; i < restaurant.orderCount(); i++)
        {
            if (restaurant.order(i) instanceof Delivery)
            {
                Delivery thisOrder = (Delivery) restaurant.order(i);
                if (!thisOrder.isDelivered())
                {
                    undelivered[undeliveredOrderCount] = restaurant.order(i);
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

            restaurant.deliver(selection);
        }
        else
        {
            System.out.println("No undelivered orders.");
            Input.getString("Press any key to continue.");
        }
    }

    public static void display()
    {
        for (int i = 0; i < restaurant.orderCount(); i++)
        {
            restaurant.order(i).display();
        }
    }
}
