
public class Menu2 {
	
	public static void main (String[] args) 
		{
		
		int Option;
		
		
		
		
		do{
			DisplayMenu();
			Option = TextIO.getlnInt();
			Statement(Option);
			
			
			}while(Option !=4);
		
		}
		
	
	public static void DisplayMenu() {
		
		TextIO.putln("1: View all contacts");
		TextIO.putln("2: Delete a contact");
		TextIO.putln("3: Add a contact");
		TextIO.putln("4: Exit");
		
	}
	
	public static void Statement(int Option) {
	
		switch (Option){
		case 1: TextIO.putln("You chose to view all contacts");break;
		case 2: TextIO.putln("You chose to delete a contact");break;
		case 3: TextIO.putln("You chose to add a contact");break;
		case 4: TextIO.putln("You chose to exit");break;
		default: TextIO.putln("Invalid choice");break;

	
	
		}

	}
}


