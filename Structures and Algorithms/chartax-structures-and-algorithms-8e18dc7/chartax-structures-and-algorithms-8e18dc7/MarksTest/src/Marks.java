
public class Marks
{
    // The array of marks.
    private int[] marksArray = {};
    // Number of failed modules.
    private int failedModules;
    // The average mark.
    private double averageMark;
    // The students' merit, pass or fail.
    private String progression = "";

    // Constructor for the Marks class
    public Marks(int[] marks)
    {
        // Get the array of marks from the method call and set it to the marksArray field.
        this.marksArray = this.getMarks(marks);
        // Calculate the average mark.
        this.averageMark = this.getAverage();
        // and calculate the progression.
        this.progression = this.getProgression();
    }

    // Write out all of the students' results.
    public void outputResults()
    {
        // For every mark in the array
        for (int i : marksArray)
        {
            // Write it out.
            System.out.print(i + "\t");
        }

        // Then write out their average, number of failed modules, and their merit/pass/fail.
        System.out.print("\t");
        System.out.printf("%.2f\t", this.averageMark);
        System.out.print(failedModules + "\t");
        System.out.println(progression);
    }

    // Calculate whether they get a merit, pass or a fail.
    private String getProgression()
    {
        // The student has 0 failed modules.
        if (this.failedModules == 0)
        {
            // And an average mark above 60
            if (this.averageMark >= 60)
            {
                // They get a merit.
                return "merit";
            }
            else
            {
                // Otherwise, just a regular pass.
                return "pass";
            }
        }
        // If they have failed one module
        else if (this.failedModules == 1)
        {
            // but their average mark is above 40
            if (this.averageMark >= 40)
            {
                // Then they pass.
                return "pass";
            }
            else
            {
                // Otherwise, they fail.
                return "fail";
            }
        }
        // If they have more than 1 failed module
        else
        {
            // They fail.
            return "fail";
        }
    }

    // Get the average mark for the student
    private double getAverage()
    {
        int totalMark = 0;
        // For every mark in the mark array
        for (int mark : marksArray)
        {
            // if it's less than 40
            if (mark < 40)
            {
                // Add 1 to the number of failed modules
                failedModules++;
            }

            // and 1 to the total mark
            totalMark += mark;
        }

        // The average mark is the total divided by the number of modules taken.
        return ((double) totalMark / marksArray.length);
    }

    // Make a copy of the existent marks array with one extra space.
    private int[] getMarks(int[] marks)
    {
        int[] newMarksArray = new int[marks.length];

        for (int i = 0; i < marks.length; i++)
        {
            newMarksArray[i] = marks[i];
        }

        return newMarksArray;
    }
}
