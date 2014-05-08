
public class PartTime extends Student{
	private int numberOfmodules;
	
	public PartTime()
	{
		this.numberOfmodules=Input.getInteger("Please enter the number of modules: ");
	}
	
	public void display ()
    {
        super.display();
        System.out.println("Part time student studying " + this.numberOfmodules + " modules.");
    }
}
