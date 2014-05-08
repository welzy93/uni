public class Cohort{
	private Student[] students;
	private int numberOfStudents;
	
	public Cohort(int size){
		this.students=new Student[size];
	}
	
	public void add(){
		this.students[this.numberOfStudents]=new Student();
		this.numberOfStudents++;
	}
	
	public void display(){
		for (int index=0;index<this.numberOfStudents;index++)
			this.students[index].display();
	}
	
	public void sort(){
		QuickSort.sort(this.students);
	}
}
