public class DLLTest {
	public static void main(String[] args){
		DLL integerDLL=new DLL();
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: add");
			System.out.println("2: remove");
			System.out.println("3: display forwards");
			System.out.println("4: display backwards");
			option=Input.getInteger("input option: ");
			Integer value;
			int numberRemoved;
			switch(option){
				case 1:	value=Input.getInteger("Input value to be added: ");
						integerDLL.add(value);
						break;
				case 2: value=Input.getInteger("Input value to be removed: ");
						numberRemoved=integerDLL.remove(value);
						System.out.println(value+" number removed: "+numberRemoved);
						break;
				case 3:	integerDLL.displayForwards();
						break;
				case 4:	integerDLL.displayBackwards();
						break;
			}
		}
		while(option!=0);
	}
}
