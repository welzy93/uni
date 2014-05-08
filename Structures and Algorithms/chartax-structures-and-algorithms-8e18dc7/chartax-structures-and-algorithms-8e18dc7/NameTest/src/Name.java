
public class Name implements Comparable<Name>
{
    private String forename;
    private String surname;

    public Name()
    {
        this.forename = Input.getString("Please enter a forename: ");
        this.surname = Input.getString("Please enter a surname: ");
    }

    public int compareTo(Name name)
    {
        int result = this.surname.compareToIgnoreCase(name.surname);
        if (result == 0)
        {
            result = this.forename.compareToIgnoreCase(name.forename);
        }
        return result;
    }

    public boolean equals(Name name)
    {
        if (this.forename.equalsIgnoreCase(name.forename))
        {
            if (this.surname.equalsIgnoreCase(name.surname))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }

    public String toString()
    {
        return forename + ", " + surname;
    }

    public void display()
    {
        System.out.println(this.toString());
    }


}
