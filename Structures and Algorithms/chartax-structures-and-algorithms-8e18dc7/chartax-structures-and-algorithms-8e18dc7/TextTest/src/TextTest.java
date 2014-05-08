
public class TextTest
{

    public static void main(String[] args)
    {
        boolean running = true;

        while (running)
        {
            String input = Input.getString("Please enter a string: ");

            if (input.equalsIgnoreCase("no"))
            {
                running = false;
            }
            else if (input.equalsIgnoreCase(""))
            {
                System.out.println("The input cannot be blank!");
            }
            else
            {
                char[] chars = input.toCharArray();

                int words = 0;
                for (char character : chars)
                {
                    if (character == ' ')
                    {
                        words++;
                        System.out.println();
                    }
                    else
                    {
                        System.out.print(character);
                    }
                }
                words++;
                System.out.println();
                System.out.println(words + " words.");
                System.out.println();
            }
        }
    }

}
