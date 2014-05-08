
public class PostCodeTest {
	public static void main(String[] args){
		do{
			PostCode postCode=new PostCode();
			if (postCode.isValid())
				System.out.println("is valid");
			else
				System.out.println("is invalid");
		}while (Repeat.repeat());
	}
}
