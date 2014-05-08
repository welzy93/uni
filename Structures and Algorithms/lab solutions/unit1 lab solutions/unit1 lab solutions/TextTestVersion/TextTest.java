public class TextTest{
	public static void main(String[] args){
		String text;
		int wordCount;
		final char BLANK=' ';
		String repeatResponse;
		final String terminate="no";
		do{
			wordCount=0;
			text=Input.getString("input text: ");
			// check for empty string
			if (text.length()!=0)
				for (int index=0;index<=text.length();index++){
					// end of text or word separator
					if (index==text.length() ||
						text.charAt(index)==BLANK){
						wordCount++;
						System.out.println();
					}
					else
						System.out.print(text.charAt(index));
				}
			System.out.println("number of words: "+wordCount);
			repeatResponse=Input.getString("do you want to repeat: ");
		}while(!repeatResponse.equalsIgnoreCase(terminate));
	}
}
