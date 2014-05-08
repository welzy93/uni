
public class PostCodeTest
{

    public static void main(String[] args)
    {
        do
        {
            String input = Input.getString("Please enter a postcode: ");
            PostCode postcode = new PostCode(input);
            if (postcode.isValid())
            {
                System.out.println(postcode.toString() + "\t" + "valid");
            }
            else
            {
                System.out.println(postcode.toString() + "\t" + "invalid");
            }
        }
        while (Repeat.repeat());

    }


}
