
public class FourNames {
	
	public static void main(String[] args) {
		
		String[] NamesArray;
		NamesArray  = new String[4];
		int i;
		
		
		for(i=0; i<4; i++)
		{
			TextIO.putln("Please enter a name");
			NamesArray[i] = TextIO.getln();
			
		}
		
		for(i=0; i<4; i++)
		{
			TextIO.putln(NamesArray[i]);
		}
		
	}

}
