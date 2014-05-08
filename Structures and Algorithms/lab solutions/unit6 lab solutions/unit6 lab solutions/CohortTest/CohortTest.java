public class CohortTest{
	public static void main(String[] args){
		final int MAX_SIZE=10;
		Cohort students=new Cohort(MAX_SIZE);
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: add student");
			System.out.println("2: sort students");
			System.out.println("3: display students");
			option=Input.getInteger("input option: ");
			switch(option){
				case 1:	students.add();
						break;
				case 2: students.sort();
						break;
				case 3: students.display();
			}
		}while(option!=0);
	}
}
