
public class Operation
{

    public static int Solution(String operator, int number1, int number2)
    {
        if (operator.equals("+"))
        {
            return number1 + number2;
        }
        else if (operator.equals("-"))
        {
            return number1 - number2;
        }
        else if (operator.equals("/"))
        {
            return number1 / number2;
        }
        else if (operator.equals("*"))
        {
            return number1 * number2;
        }
        else
        {
            return 0;
        }
    }

    public static String Expression(String operator, int number1, int number2)
    {
        if (operator.equals("+"))
        {
            int result = Solution("+", number1, number2);
            return number1 + " + " + number2 + " = " + result;
        }
        else if (operator.equals("-"))
        {
            return number1 + " - " + number2;
        }
        else if (operator.equals("/"))
        {
            return number1 + " / " + number2;
        }
        else if (operator.equals("*"))
        {
            return number1 + " * " + number2;
        }
        else
        {
            return "";
        }
    }

}
