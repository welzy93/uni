
public class TextTest {
	public static void main(String[] args){
		String Sentence;
		int count;
		final char EMPTY=' ';
		String Repeat;
		String Terminate="no";
		
		do
		{
			count = 0;
			Sentence=Input.getString("Please enter a sentence: ");
			
			if(Sentence.length()!=0)
				for(int i=0;i<=Sentence.length();i++)
				{
					if (i == Sentence.length() ||
							Sentence.charAt(i)==EMPTY){
							count++;
							System.out.println();
						}
						else
							System.out.print(Sentence.charAt(i));
				}
			System.out.println("number of words: "+count);
			Repeat=Input.getString("do you want to repeat: ");
		}while(!Repeat.equalsIgnoreCase(Terminate));
	}

}
