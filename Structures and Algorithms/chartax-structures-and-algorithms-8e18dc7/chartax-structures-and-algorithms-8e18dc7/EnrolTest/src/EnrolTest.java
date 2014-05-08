import java.awt.*;

/**
 * Created by Alastair on 2/21/14.
 */
public class EnrolTest {
    public static void main (String[] args)
    {
        boolean running = true;
        StudentList students = new StudentList();

        while (running)
        {

            System.out.println("1. Add student");
            System.out.println("2. Display Students");
            System.out.println("3. Issue Grant");
            System.out.println("0. Exit");
            int selection = Input.getInteger("Please select an item: ");

            switch (selection)
            {
                case 1:
                    students.add();
                    break;
                case 2:
                    students.display();
                    break;
                case 3:
                    students.issueGrant();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println(selection + " is not a valid choice.");
            }
        }
    }
}
