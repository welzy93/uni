public class FullTime extends Student{
	private boolean grantIssued;

	public void display(){
		super.display();
		System.out.print("is a full time student ");
		if (this.grantIssued)
			System.out.println("whose grant has beeen issued");
		else
			System.out.println("whose grant is still to be issued");
	}
	
	public void issueGrant(){
		this.grantIssued=true;
	}
	
	public boolean isGrantIssued(){
		return grantIssued;
	}
}