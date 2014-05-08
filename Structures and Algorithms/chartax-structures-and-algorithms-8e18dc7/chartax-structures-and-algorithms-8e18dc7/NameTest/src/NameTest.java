
public class NameTest
{

    public static void main(String[] args)
    {
        /*
             joe jones	JOE JONES		true	equals
		 	joe james	james joe		false	less than
			james joe	joe james		false	greater than
			joe jones	joe james		false	greater then
			joe james	joe jones		false	less than
			jim james	joe james		false	less than
			joe james	jim james		false	greater than
		 */
        TestCase.Test("joe", "jones", "JOE", "JONES", true, "equals");
        TestCase.Test("joe", "james", "james", "joe", false, "less than");
        TestCase.Test("james", "joe", "joe", "james", false, "greater than");
        TestCase.Test("joe", "jones", "joe", "james", false, "greater than");
        TestCase.Test("joe", "james", "joe", "jones", false, "less than");
        TestCase.Test("jim", "james", "joe", "james", false, "less than");
        TestCase.Test("joe", "james", "jim", "james", false, "greater than");

    }

}
