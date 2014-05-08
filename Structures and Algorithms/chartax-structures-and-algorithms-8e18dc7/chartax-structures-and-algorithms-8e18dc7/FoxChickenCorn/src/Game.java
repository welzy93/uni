
public class Game
{

    // Properties

    // Number of turns
    public static int turnCount = 0;

    // Is the game still running?
    public static boolean playing = true;

    // Each of the characters in the game.
    public static Actor farmer = new Actor();
    public static Actor chicken = new Actor();
    public static Actor fox = new Actor();
    public static Actor corn = new Actor();

    // the main entry point of the program
    public static void main(String[] args)
    {
        // Show the game intro
        Game.printIntro();

        // keep updating while the game is still running
        while (Game.playing)
        {
            Game.update();
        }
    }

    // This just prints out the game's intro to the screen.
    public static void printIntro()
    {
        System.out.println("Welcome to the Puzzle of the Fox, the Chicken, and the Corn.");
        System.out.print(
                "One day a farmer wanted to cross from the left to the right bank of a river taking a fox, a chicken and a bag of corn with him.");
        System.out.println(
                "The problem is that he just has a small boat and can only take one item with him on each crossing. The problem is that: ");
        System.out.println();
        System.out.println(" * If the fox and chicken are left together, the fox will eat the chicken.");
        System.out.println(" * If the chicken and the corn are left together, then the chicken will eat the corn.");
        System.out.println();
        System.out.println("Please help the farmer get everything across the river safely!");
    }

    // This performs the actual update of the game.
    public static void update()
    {
        // Print out the game update (chicken is on the left side etc)
        Game.printUpdate();

        // get the selection the user put in
        int selection = Game.getAction();

        // Make a blank line just for show
        System.out.println();

        // Make sure that the selection is valid (between 0 and 3)
        if (selection < 0)
        {
            System.out.println("Please only choose 0, 1, 2 or 3.");
            return;
        }
        else if (selection > 3)
        {
            System.out.println("Please only choose 0, 1, 2 or 3.");
            return;
        }
        else
        {
            // If the game processes the action successfully
            if (Game.processAction(selection))
            {
                // check if the game is over or not
                if (!checkLogic())
                {
                    // if it is, end it.
                    Game.playing = false;
                }
            }
        }
    }

    // Print out the game update (chicken is on the left side etc)
    public static void printUpdate()
    {
        System.out.println();
        System.out.println("The farmer is on the " + Game.farmer.side + " bank.");
        System.out.println("The chicken is on the " + Game.chicken.side + " bank.");
        System.out.println("The fox is on the " + Game.fox.side + " bank.");
        System.out.println("The corn is on the " + Game.corn.side + " bank.");
        System.out.println();
    }

    // Get input from the player and make sure it's not empty.
    public static int getAction()
    {
        System.out.println("What would you like Farmer to cross with?");
        System.out.println("(type 0 for nothing, 1 for chicken, 2 for fox, or 3 for corn)");
        Integer retVal = null;
        while (retVal == null)
        {
            retVal = Input.getInteger("Please make a selection: ");
        }

        Game.turnCount++;
        return retVal;
    }


    // Process the players' input action
    public static boolean processAction(int actionId)
    {
        switch (actionId)
        {
            // If it's 0, just move the farmer.
            case 0:
                farmer.switchSide();
                return true;

            case 1:
                // The farmer moves the chicken.
                if (farmer.side.equals(chicken.side))
                {
                    chicken.switchSide();
                    farmer.switchSide();
                    return true;
                }
                else
                {
                    System.out.println("You're not on the same side as the chicken!");
                    return false;
                }

            case 2:
                // The farmer moves the fox.
                if (farmer.side.equals(fox.side))
                {
                    fox.switchSide();
                    farmer.switchSide();
                    return true;
                }
                else
                {
                    System.out.println("You're not on the same side as the fox!");
                    return false;
                }

            case 3:
                // The farmer moves the corn.
                if (farmer.side.equals(corn.side))
                {
                    // If the farmer is on the same side as the corn, switch the side of the corn and the farmer
                    corn.switchSide();
                    farmer.switchSide();
                    return true;
                }
                else
                {
                    // The farmer can't move the corn unless he's there too.
                    System.out.println("You're not on the same side as the corn!");
                    return false;
                }

            default:
                // It should not be possible for the value to be anything other than 0, 1, 2 or 3.
                throw new IllegalArgumentException("invalid action, must be 0, 1, 2 or 3");
        }

    }

    // Show a game over message when a player loses.
    public static void lose()
    {
        System.out.println("We'll have to stop and help the farmer.");
        System.out.println("Undoubtedly, he'll need your help again.");
    }

    // Check to see if the player has either lost or won/
    public static boolean checkLogic()
    {
        // if the chicken is left alone with the corn
        if ((chicken.side.equals(corn.side)) && !(farmer.side.equals(chicken.side)))
        {
            System.out.println("Oh no! The chicken ate the corn!");
            Game.lose();
            return false;
        }

        // if the fox is left alone with the chicken
        else if ((fox.side.equals(chicken.side)) && !(farmer.side.equals(fox.side)))
        {
            System.out.println("Oh no! The fox ate the chicken!");
            Game.lose();
            return false;
        }

        // if everything is on the right side
        else if ((fox.side.equals("right")) && (farmer.side.equals("right")) && (corn.side.equals(
                "right")) && (chicken.side.equals("right")))
        {
            System.out.println("You won in " + Game.turnCount + " moves! Well done!");
            System.out.println("Now can you answer the more complicated puzzle? Why does the farmer even HAVE a fox!");
            return false;
        }

        // otherwise the game continues!
        else
        {
            return true;
        }
    }


}
