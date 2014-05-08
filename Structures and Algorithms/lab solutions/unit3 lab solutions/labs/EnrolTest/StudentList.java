public class StudentList{
	private Student[] students;
	private int numberOfStudents;
	
	public StudentList(){
		int size=Input.getInteger("input list size: ");
		this.students=new Student[size];
	}
	
	public void add(){
		int type;

		if (this.numberOfStudents==this.students.length)
			System.out.println("list full");
		else{
			System.out.println("1: full-time");
			System.out.println("2: part-time");
			type=Input.getInteger("input student type: ");
			if(type==1)
				this.students[numberOfStudents]=new FullTime();
			else
				this.students[numberOfStudents]=new PartTime();
			this.numberOfStudents++;
		}
	}

	public void display(){
		for (int student=0;student<this.numberOfStudents;student++)
			this.students[student].display();
	}

	public void issueGrant(){
		int student;
		FullTime[] fullTimeStudents=new FullTime[numberOfStudents];
		int index=0;

		for (student=0;student<this.numberOfStudents;student++)
			if (this.students[student] instanceof FullTime){
				if (((FullTime)this.students[student]).isGrantIssued()==false){
					System.out.println("STUDENT NUMBER: "+(index+1));
					this.students[student].display();
					fullTimeStudents[index]=(FullTime)this.students[student];
					index++;
				}
			}
		if (index>0){
			student=Input.getInteger("select student number: ");
			fullTimeStudents[student-1].issueGrant();
		}
		else
			System.out.println("no full time students waiting for grants");
	}
}
