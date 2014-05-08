public class Student{
	private String name;
	
	public Student(){
		this.name=Input.getString("input student name: ");
	}
	
	public void display(){
		System.out.println("name: "+this.name);
	}
}