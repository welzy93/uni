public class Unit1Calculator
{

    public static void main(String[] args)
    {
        boolean running = true;

        Menu mainMenu = new Menu("Main Menu");
        mainMenu.addItem(new MenuItem("Add", 1));
        mainMenu.addItem(new MenuItem("Subtract", 2));
        mainMenu.addItem(new MenuItem("Multiply", 3));
        mainMenu.addItem(new MenuItem("Integer Division", 4));
        mainMenu.addItem(new MenuItem("Floating Point Division", 5));

        int number1 = Input.getInteger("Please select integer 1: ");
        int number2 = Input.getInteger("Please select integer 2: ");

        while (running)
        {
            int userSelection = mainMenu.print();
            int result;
            switch (userSelection)
            {
                case 0:
                    running = false;
                    break;
                case 1:
                    result = Operation.Solution("+", number1, number2);
                    System.out.println(Operation.Expression("+", number1, number2));
                case 2:
                    result = Operation.Solution("-", number1, number2);
            }
        }
    }
}