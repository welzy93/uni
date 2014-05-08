
public class AddressApp {


	public static Contact[] ContactArray;	
	// you could also create an array here of a fixed number e.g. to store all dart throws
	//public static Contact[] ContactArray = new Contact[100];
	
	
	public static void main (String[] args){
				
		 TextIO.putln("Please enter number of contacts ");
		 Contact.noOfContacts = TextIO.getInt();
		
		 ContactArray = new Contact[Contact.noOfContacts];			
		 

	     for (int i=0; i < ContactArray.length; i++) {
	    	  ContactArray[i] = new Contact();  // must create each element	
			  TextIO.putln("Please enter contact name: ");
			  ContactArray[i].name = TextIO.getlnWord();	
			  TextIO.putln("Please enter tel number: ");
			  ContactArray[i].tel = TextIO.getInt();
		}//for
	     TextIO.putln();
	     displayContacts(ContactArray);		//send whole array
	     
	}//main

	
	
	
	public static void displayContacts(Contact[] cA){		//receive the array
		
		for (int i=0; i < cA.length; i++) {
			TextIO.putln( cA[i].name + "'s tel is " + cA[i].tel );
		}//for
	}
		
	
	
	public static void displayContacts2(){		
		
		for (int i=0; i < ContactArray.length; i++) {
			TextIO.putln( ContactArray[i].name + "'s tel is " + ContactArray[i].tel );
		}//for
	}
				
				
	}//class
