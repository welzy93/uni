public class ReverseIntegerLinkedListTest{
	public static void main(String[] args){
		ReversedADT sorted=new ReversedLinkedList();
		ReversedADT reversed=null;
		boolean inserted;
		Integer value;
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: insert");
			System.out.println("2: reverse");
			System.out.println("3: display");
			option=Input.getInteger("input option: ");
			switch (option){
				case 0:	break;
				case 1: inserted=sorted.insert(Input.getInteger("input value: "));
	   					if (inserted)
							System.out.println("inserted");
				        break;
				case 2:	reversed=sorted.reverse();
                     	break;
				case 3:	System.out.println("sorted");
						sorted.display();
						System.out.println("reversed");
						if (reversed!=null)
							reversed.display();
						break;
			}
		} while(option!=0);
	}
}

