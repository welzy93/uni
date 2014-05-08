
public class CalculatorVersion1 {

public static void main(String[] args) {
		int selection = 0;
		do
		{
			
			int valuea= 0, valueb = 0;
			valuea=Input.getInteger("Please enter a number: ");
			valueb=Input.getInteger("Please enter a number: ");
			
			System.out.println("0. Exit | 1. add | 2. Subtract | 3. multiply | 4. Integer Division | 5. floating point division ");
			selection=Input.getInteger("Please make a selection");
			
			switch (selection) {
			case 0: System.out.println("Exit");
					System.exit(0);
			case 1: System.out.print("add:");
					System.out.print(valuea+valueb);
				break;
			case 2: System.out.print("subtract");
					System.out.print(valuea-valueb);
				break;
			case 3: System.out.print("multiply");
					System.out.print(valuea*valueb);
				break;
			case 4: System.out.print("integer division");
					System.out.print(valuea/valueb);
				break;
			case 5: System.out.print("floating point division");
					System.out.print((double)valuea/valueb);
				break;
			
			}
			
		}
		while(selection != 0);

	}
}



