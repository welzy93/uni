
public class Actor
{

    // What side is the actor currently on?
    String side = "left";

    // change the side to the given string
    private void changeSide(String newSide)
    {
        if (newSide.equals("left"))
        {
            // If the argument was "left", make the actor's side left.
            this.side = "left";

        }
        else if (newSide.equals("right"))
        {
            // If the argument was right, set the actor's side to right.
            this.side = "right";

        }
        else
        {
            // don't let this set anything except left or right.
            throw new IllegalArgumentException("side must be left or right");
        }
    }

    // invert the actor's side
    public void switchSide()
    {
        // If the side is left, make it right.
        if (this.side.equals("left"))
        {
            this.changeSide("right");

        }
        // If the side is right, make it left.
        else if (this.side.equals("right"))
        {
            this.changeSide("left");

        }
        // If their side is currently not left or right, something very bad happened.
        else
        {
            throw new IllegalStateException("side is not left or right");
        }
    }

}
