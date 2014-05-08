public class FullTime extends Student {
	public boolean grantIssued;

    public void display ()
    {
        super.display();
        if (grantIssued)
        {
            System.out.println("Full time student with a grant.");
        }
        else
        {
            System.out.println("Full time student with no grant.");
        }
    }

    public void issueGrant ()
    {
        this.grantIssued = true;
    }
}
