
public class Name 
{
	
	private String firstname;
	private String lastname;
	
	public Name()
	{
		this.firstname = Input.getString("Please enter your First Name: ");
		this.lastname = Input.getString("Please enter your Last Name:");
	}
	
	public int compareto (Name name){
		
		int test = this.lastname.compareToIgnoreCase(firstname);
		if(test == 0)
		{
			test = this.firstname.compareToIgnoreCase(lastname);
		}
		return test;
	}
	
	public boolean equals(Name name)
    {
        if (this.firstname.equalsIgnoreCase(firstname))
        {
            if (this.lastname.equalsIgnoreCase(lastname))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
		return false;
    }
	
	public String toString()
    {
        return firstname + ", " + lastname;
    }

    public void display()
    {
        System.out.println(this.toString());
    }
}