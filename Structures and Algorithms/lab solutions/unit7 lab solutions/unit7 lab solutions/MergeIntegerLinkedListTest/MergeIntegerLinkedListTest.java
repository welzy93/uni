public class MergeIntegerLinkedListTest{
	public static void main(String[] args){
		MergedADT sorted1=new MergedLinkedList();
		MergedADT sorted2=new MergedLinkedList();
		// for result from merge
		MergedADT merged=null;
		boolean inserted;
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: insert into 1");
			System.out.println("2: insert into 2");
			System.out.println("3: merge 1 and 2");
			System.out.println("4: display");
			option=Input.getInteger("input option: ");
			switch (option)
			{
				case 0:	break;
				case 1: inserted=sorted1.insert(Input.getInteger("input value: "));
						if (inserted)
							System.out.println("inserted");
				        break;
				case 2: inserted=sorted2.insert(Input.getInteger("input value: "));
						if (inserted)
							System.out.println("inserted");
				        break;
				case 3: merged=sorted1.merge(sorted2);
                     	break;
				case 4:	System.out.println("list1");
                     	sorted1.display();
                     	System.out.println("list2");
                     	sorted2.display();
                     	System.out.println("merged");
                     	if (merged!=null)
							merged.display();
						else
							System.out.println("merged list not yet set up");
                     	break;
			}
		} while(option!=0);
	}
}
