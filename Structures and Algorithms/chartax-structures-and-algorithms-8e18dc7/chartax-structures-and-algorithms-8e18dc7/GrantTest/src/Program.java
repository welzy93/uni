
public class Program {

	public static void main(String[] args) {
		int x = 0;
		
		String Userinput;
		
		Userinput = Input.getString("Please enter a sentence");
		
		String split = " ";
		
		String[] words = Userinput.split(split);
		
		for(int i = 0; i < words.length; i++){
			
		System.out.println(words[i]);
		
		x = i;
				
		}
		
		if(x == 0)
			
		{
			
		System.out.println("ERROR! You never entered any text");
		
		}
		
		System.out.println(x);

	}

}
