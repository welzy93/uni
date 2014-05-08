
public class TestCase
{

    public static void Test(String forename1, String surname1, String forename2, String surname2, boolean equals,
                            String compares)
    {
        Name test1 = new Name();
        Name test2 = new Name();

        boolean actualEquals = test1.equals(test2);
        int actualComparison = test1.compareTo(test2);

        boolean equalsAssured = TestCase.checkEquals(equals, actualEquals);
        boolean comparisonAssured = false;

        if (compares.equals("equals"))
        {
            if (actualComparison == 0)
            {
                comparisonAssured = true;
            }

        }
        else if (compares.equals("greater than"))
        {
            if (actualComparison > 0)
            {
                comparisonAssured = true;
            }

        }
        else if (compares.equals("less than"))
        {
            if (actualComparison < 0)
            {
                comparisonAssured = true;
            }

        }
        else
        {
            throw new IllegalArgumentException("Must be equals, greater than, or less than.");
        }


        if (equalsAssured)
        {
            if (comparisonAssured)
            {
                System.out.println(
                        "Test case " + forename1 + " " + surname1 + " " + forename2 + " " + surname2 + " " + equals + " " + compares + " was valid!");
            }
            else
            {
                System.out.println(
                        "Test case " + forename1 + " " + surname1 + " " + forename2 + " " + surname2 + " " + equals + " " + compares + " failed, comparison was invalid.");
            }
        }
        else
        {
            System.out.println(
                    "Test case " + forename1 + " " + surname1 + " " + forename2 + " " + surname2 + " " + equals + " " + compares + " failed, equal test was invalid.");
        }

        System.out.println(
                forename1 + " " + surname1 + "\t" + forename2 + " " + surname2 + "\t" + equalsAssured + " " + comparisonAssured);
    }

    public static boolean checkEquals(boolean equals, boolean actualEquals)
    {
        return equals == actualEquals;
    }
}
