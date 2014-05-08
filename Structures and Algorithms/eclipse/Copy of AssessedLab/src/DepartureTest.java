public class DepartureTest{
	public static void main(String[] args){
		final int MAX_SIZE=5;
		Departures flights=new Departures(MAX_SIZE);
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: add flight");
			System.out.println("2: display flight");
			option=Input.getInteger("input option: ");
			switch(option){
				case 1:	flights.add();
						break;
				case 2: flights.display();
			}
		}while(option!=0);
	}
}