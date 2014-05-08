//intro to basic subroutine 
public class subroutines01 {

		public static void main(String[] args) {
			TextIO.putln ("hello from main ");
			sub1();
			
			TextIO.putln ("hello from main again ");
			sub1();
			sub1();
			
		}//main
				
		public static void sub1(){
			TextIO.putln ("hello from sub1");
		}//sub1
		
		
}//class