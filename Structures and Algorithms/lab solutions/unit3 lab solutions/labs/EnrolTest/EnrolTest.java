public class EnrolTest{
	public static void main(String[] args){
		StudentList students=new StudentList();
		int option;
	
		do{
			System.out.println("0:quit");
			System.out.println("1:add student");
			System.out.println("2:issue grant");
			System.out.println("3:display");
			option=Input.getInteger("select option: ");
			switch(option){
				case 1: students.add();
					    break;
				case 2: students.issueGrant();
						break;
				case 3: students.display();
			}
		} while(option!=0);
	}
}
	