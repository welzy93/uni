
public class Menu {
	
	public static void main (String[] args) {
		
		int Option;
		
		
		
		do{
			TextIO.putln("1: View all contacts");
			TextIO.putln("2: Delete a contact");
			TextIO.putln("3: Add a contact");
			TextIO.putln("4: Exit");
			Option = TextIO.getlnInt();
			
			switch (Option){
			case 1: TextIO.putln("You chose to view all contacts");break;
			case 2: TextIO.putln("You chose to delete a contact");break;
			case 3: TextIO.putln("You chose to add a contact");break;
			case 4: TextIO.putln("You chose to exit");break;
			default: TextIO.putln("Invalid choice");break;
			
			
			}
		
		
			
		}while(Option !=4);
		
	
	}

}
