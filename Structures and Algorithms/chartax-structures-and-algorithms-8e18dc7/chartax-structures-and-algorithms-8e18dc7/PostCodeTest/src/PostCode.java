
public class PostCode
{

    private String postcode;

    public PostCode(String postcode)
    {
        this.postcode = postcode;
    }

    public String toString()
    {
        return this.postcode;
    }

    public boolean isValid()
    {
        int length = postcode.length();

        if (length < 5)
        {
            return false;
        }

        if (length > 7)
        {
            return false;
        }

        for (int i = 0; i < length; i++)
        {
            if (Character.isDigit(postcode.charAt(0)))
            {
                return false;
            }
            if (Character.isLetter(postcode.charAt(2)))
            {
                return false;
            }
            if (Character.isDigit(postcode.charAt(length - 1)))
            {
                return false;
            }
            if (Character.isDigit(postcode.charAt(length - 2)))
            {
                return false;
            }
            if (Character.isLetter(postcode.charAt(length - 3)))
            {
                return false;
            }
            if (Character.isLetter(postcode.charAt(length - 4)))
            {
                return false;
            }
            if (length == 7)
            {
                if (Character.isDigit(postcode.charAt(1)))
                {
                    return false;
                }
            }

        }
        return true;
    }
}
