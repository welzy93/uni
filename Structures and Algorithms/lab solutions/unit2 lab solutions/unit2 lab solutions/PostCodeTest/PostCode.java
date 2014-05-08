public class PostCode{
	private String postCode;
	public PostCode(){
		this.postCode=Input.getString("input postcode: ");
	}
	public boolean isValid(){
		/* algorithm
		// each time that a character is checked there
		// needs to be a prior check that there is still a
		// character available
		if character available and character is a letter then
  			move to next character
  			if character available and character is a letter then
    			move to next character
  			end if
  			if 2 characters are available and
     		  next 2 characters are digits then
    			move by 2 characters
    			if character available and character is a digit then
     				move to next character
    			end if
    			if 2 characters are available and
       		  next 2 characters are letters then
     				move by 2 characters
      			if all characters checked then
        				postcode is valid
      			else
        				postcode is invalid
      			end if
    			else
      			postcode is invalid
    			end if
  			else
    			postcode is invalid
 			 end if
		else
  			postcode is invalid
		end if
		return the result
		*/

		// to simplify code, assume invalid
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