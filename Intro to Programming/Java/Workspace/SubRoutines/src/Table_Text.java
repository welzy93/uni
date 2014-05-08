
public class Table_Text {
	
	public static void main(String[] args) {
		
		sub1 () ;
		sub2 () ;
		
		

	}
	
	public static void  sub1()
	{
		
		int [] TimesTable;
		TimesTable = new int[10];
		int i;
		
		for(i=1; i<11; i++){
			
		TimesTable [i-1] = i*8;
		}
		
		//TextIO.putln(TimesTable);
		for(i=1; i<11; i++){
			
			TextIO.putln(TimesTable [i-1]);
			}
		
		
	}
	
	public static void sub2 ()
	{
		TextIO.putln("Ryan Wells");
	}
	

}
