public class Student implements Comparable<Student>{
	private String bannerID;
	private String name;
	private String campus;
	
	public Student(){
		this.bannerID=Input.getString("input bannerID: ");
		this.name=Input.getString("input name: ");
		this.campus=Input.getString("input campus: ");
	}

	public int compareTo(Student student){
		int result;
		result=this.campus.compareTo(student.campus);
		if (result==0)
			result=this.bannerID.compareTo(student.bannerID);
		return result;
	}
	
	public void display(){
		System.out.println(this.campus+"  "+this.bannerID+"  "+this.name);
	}
}