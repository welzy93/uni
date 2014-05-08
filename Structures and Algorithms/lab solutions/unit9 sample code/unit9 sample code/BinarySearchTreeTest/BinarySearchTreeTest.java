public class BinarySearchTreeTest{
	public static void main(String[] args){
		SortedADT sorted=new BinarySearchTree();
		boolean inserted;
		Integer value;
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: insert");
			System.out.println("2: remove");
			System.out.println("3: find");
			System.out.println("4: display");
			option=Input.getInteger("input option: ");
			switch (option){
				case 0:	break;
				case 1: inserted=sorted.insert(Input.getInteger("input value: "));
	   					if (inserted)
							System.out.println("inserted");
				        break;
				case 2: value=(Integer)sorted.remove(Input.getInteger("input value: "));
      					if (value!=null)
							System.out.println("removed");
						else
							System.out.println("not found");
				        break;
				case 3: value=(Integer)sorted.find(Input.getInteger("input value: "));
      					if (value!=null)
							System.out.println("found");
						else
							System.out.println("not found");
				        break;
				case 4:	sorted.display();
                        break;
			}
		} while(option!=0);
	}
}
