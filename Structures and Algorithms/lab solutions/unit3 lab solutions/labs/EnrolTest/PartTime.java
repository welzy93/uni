public class PartTime extends Student{
	private int numberOfModules;

	public PartTime(){
		this.numberOfModules=Input.getInteger("how many modules are being taken: ");
	}
	
	public void display(){
		super.display();
		System.out.println("is a part time student taking "
			+this.numberOfModules+" module(s)");
	}
}