
public class StudentList {
private Student[] list;


public StudentList()
{
	int size=Input.getInteger("Input list size: ");
	this.list = new Student[size];
}

public void add()
{
	char type = Input.getCharacter("Full time student? [y/N]: ");
    type = Character.toUpperCase(type);

    Student student;

    switch (type)
    {
        case 'Y':
            student = new FullTime();
            break;
        default:
            student = new PartTime();
            break;
    }
for (int i = 0; i < list.length; i++)
    {
        if (list[i] == null)
        {
            System.out.println("Added new student at i" + i);
            list[i] = student;
            break;
        }
        else if (i <= list.length - 1)
        {
            System.out.println("The array is full!");
        }
    }

}

public void display ()
{
	for (int i = 0; i < list.length; i++)
	{
		list[i].display();
	}
		
}

public void issueGrant()
{
	int studentCount = 0;
    for (int i = 0; i < this.list.length; i++)
    {
        if (list[i] instanceof FullTime)
        {
            FullTime student = (FullTime)list[i];
            if (!student.grantIssued)
            {
                studentCount++;
                System.out.print(i + ". ");
                student.display();
            }
        }
    }
    if (studentCount >= 1)
    {
        char decision = Input.getCharacter("Would you like to issue a grant? y/N");
        decision = Character.toUpperCase(decision);
        switch (decision)
        {
            case 'Y':
                int selection = Input.getInteger("To which student would you like to issue a grant?: ");
                FullTime student = (FullTime)list[selection];
                student.issueGrant();
                break;
            default:
                break;
        }
    }
    else
    {
        System.out.println("No full time students awaiting grants.");
    }

}
}