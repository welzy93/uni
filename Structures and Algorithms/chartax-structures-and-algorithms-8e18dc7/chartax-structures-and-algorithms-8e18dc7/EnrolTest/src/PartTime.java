/**
 * Created by Alastair on 2/21/14.
 */
public class PartTime extends Student {
    private int numberOfModules;

    public PartTime ()
    {
        this.numberOfModules = Input.getInteger("Please enter the number of modules: ");;
    }

    public void display ()
    {
        super.display();
        System.out.println("Part time student studying " + this.numberOfModules + " modules.");
    }
}
