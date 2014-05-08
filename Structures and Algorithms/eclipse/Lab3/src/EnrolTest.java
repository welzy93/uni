public class EnrolTest {
	public static void main(String[] args){
		StudentList students=new StudentList();
		int option;

		do{
			System.out.println("0:quit");
			System.out.println("1:add member");
			System.out.println("2:display");
			option=Input.getInteger("select option: ");
			switch(option){
				case 1: students.add();
						break;
				case 6: students.display();
			}
		}while(option!=0);
	}

}
