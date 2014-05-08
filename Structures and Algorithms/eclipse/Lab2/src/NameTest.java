public class NameTest{
	public static void main (String[] args)	{
		do{
			Name firstname=new Name();
			Name lastname=new Name();
			System.out.print("name1: ");
			firstname.display();
			System.out.print("name2: ");
			lastname.display();
			if (firstname.compareto(lastname)==0)
				System.out.println("names are equal");
			else
				if (firstname.compareto(lastname)<0)
					System.out.println("firstname is less than lastname");
				else
					System.out.println("fistname is greater than lastname");
		}while (Repeat.repeat());
	}
}