//subroutines (functions) that are returning values 

public class subroutines02 {		
		
		public static void main(String[] args) {
			sub1();
			int anInt;
			anInt = sub2();
			double aDouble;
			aDouble = sub3();
			String aString;
			aString = sub4();
	
			TextIO.putln ("anInt is " + anInt);
			TextIO.putln ("aDouble is " + aDouble);
			TextIO.putln ("aString is " + aString);
		}//main
		
		// sub1 is void - it doesnt have to return a value
		public static void sub1(){			
			TextIO.putln ("hello from sub1");
		}
	
		// sub2 is not void it is of type int- it has to return a value of type int
		public static int sub2(){
			TextIO.putln ("hello from sub2");
			int y = 3;
			return y;
		}

		// sub3 is not void it is of type double- it has to return a value of type double
		public static double sub3(){
			TextIO.putln ("hello from sub3");
			return 3.00;
		}
	
		// sub4 is not void it is of type String- it has to return a value of type string
		public static String sub4(){
			TextIO.putln ("hello from sub4");
			return "hello";
		}
		
	}//class
