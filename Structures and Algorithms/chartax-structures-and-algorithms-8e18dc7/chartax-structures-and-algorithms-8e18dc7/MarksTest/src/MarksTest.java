
public class MarksTest
{

    public static void main(String[] args)
    {
        // Do this until we're told to stop.
        do
        {
            // Get 6 marks from the user.
            int mark1 = Input.getInteger("Please enter mark #1: ");
            int mark2 = Input.getInteger("Please enter mark #2: ");
            int mark3 = Input.getInteger("Please enter mark #3: ");
            int mark4 = Input.getInteger("Please enter mark #4: ");
            int mark5 = Input.getInteger("Please enter mark #5: ");
            int mark6 = Input.getInteger("Please enter mark #6: ");

            // Store the marks into an array.
            int[] marksArray = {mark1, mark2, mark3, mark4, mark5, mark6};

            // Make a new Marks object with the array.
            Marks test = new Marks(marksArray);

            // Then output the results of the Marks object.
            test.outputResults();
        }
        while (Repeat.repeat());
    }

}
