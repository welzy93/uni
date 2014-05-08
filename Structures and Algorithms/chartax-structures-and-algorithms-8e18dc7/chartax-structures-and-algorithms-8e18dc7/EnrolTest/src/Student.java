/**
 * Created by Alastair on 2/21/14.
 */
public class Student {

    private String name;

    public Student ()
    {
        this.name = Input.getString("Please enter a name for the student: ");
    }

    public void display ()
    {
        System.out.println(this.name);
    }
}
