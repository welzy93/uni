public class NameTest{
	public static void main (String[] args)	{
		do{
			Name name1=new Name();
			Name name2=new Name();
			System.out.print("name1: ");
			name1.display();
			System.out.print("name2: ");
			name2.display();
			if (name1.compareTo(name2)==0)
				System.out.println("names are equal");
			else
				if (name1.compareTo(name2)<0)
					System.out.println("name1 is less than name2");
				else
					System.out.println("name1 is greater than name2");
		}while (Repeat.repeat());
	}
}