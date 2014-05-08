public class FamilyTreeTest {
public static void main (String [] args){
	String name=Input.getString("Input ancestor name: ");
	FamilyTree familyTree=new FamilyTree(name);
	
	
	int option;
	//boolean found
	do{

		System.out.println("1: Add child to current");
		System.out.println("2: Display FamilyTree");
		System.out.println("0: Quit");
		option=Input.getInteger("Input Option: ");
		switch(option){
		case 1: 
			name=Input.getString("Input childs Name: ");
			familyTree.addchild(name);			
			break;
		case 2:		
			familyTree.displayFamilyTree();			
			break;
		}
	}while(option!=0);
}
}
