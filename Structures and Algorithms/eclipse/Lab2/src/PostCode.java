
public class PostCode {
	private String postCode;
	public PostCode(){
		this.postCode=Input.getString("input postcode: ");
	}
	public boolean isValid(){
		
		boolean result=false;
		int index=0;
		// first character must be a letter
		if(index<postCode.length()&&
		   Character.isLetter(this.postCode.charAt(index))){
			index++;
			// skip by optional letter
			if(index<postCode.length()&&
			   Character.isLetter(this.postCode.charAt(index)))
				index++;
			// next 2 characters must be digits
			if(index+1<postCode.length()&&
			   Character.isDigit(this.postCode.charAt(index))&&
				Character.isDigit(this.postCode.charAt(index+1))){
				index+=2;
				// skip by optional digit
				if(index<postCode.length()&&
				   Character.isDigit(this.postCode.charAt(index)))
					index++;
				// next 2 characters must be letters
				if(index+1<postCode.length()&&
				   Character.isLetter(this.postCode.charAt(index))&&
					Character.isLetter(this.postCode.charAt(index+1))){
					index+=2;
					// should be no more characters
					if (index==this.postCode.length())
						result=true;
				}
			}
		}
		return result;
	}	
}
