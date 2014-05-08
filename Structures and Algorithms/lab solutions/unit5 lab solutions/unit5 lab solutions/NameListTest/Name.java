public class Name implements Comparable<Name>{
	private String forename;
	private String surname;
	public Name(){
		this.forename=Input.getString("input forename: ");
		this.surname=Input.getString("input surname: ");
	}
	public void display(){
		System.out.println(surname+", "+forename);
	}
	public boolean equals(Object otherObject){
		return (this.forename.equalsIgnoreCase(((Name)otherObject).forename)) &&
			   (this.surname.equalsIgnoreCase(((Name)otherObject).surname));
	}
	public int compareTo(Name name){
		int result=this.surname.compareToIgnoreCase(name.surname);
		if (result==0)
			result=this.forename.compareToIgnoreCase(name.forename);
		return result;
	}
}