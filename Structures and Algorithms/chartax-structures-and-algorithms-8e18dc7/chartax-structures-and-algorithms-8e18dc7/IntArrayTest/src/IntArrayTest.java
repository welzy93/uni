
public class IntArrayTest
{

    public static void main(String[] args)
    {
        // Make three arrays as requested.
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = array1;
        int[] array3 = new int[array1.length];

        // Copy the contents of array1 to array3
        copyArray(array1, array3);
        // Reverse the contents of array2
        reverseArray(array2);
        // Then display each of the arrays.
        displayArray(array1);
        displayArray(array2);
        displayArray(array3);
    }

    // Display each element of the array.
    public static void displayArray(int[] array)
    {
        String output = "";

        // For every item in the array
        for (int number : array)
        {
            // Add the number to the output string, preceded by a space.
            output = output + " " + number;
        }

        // Then write out the output string.
        System.out.println(output);
    }

    // Copy an an array into another array.
    public static void copyArray(int[] arraySource, int[] arrayDestination)
    {
        // For each item in the source array
        for (int i = 0; i < arraySource.length; i++)
        {
            // Set the destination array item to the same as the source's item.
            arrayDestination[i] = arraySource[i];
        }
    }

    // Reverse the contents of an array.
    public static void reverseArray(int[] array)
    {
        // Create a new empty array.
        int[] newArray = new int[5];

        // Set the integer j to the length of the array minus 1 (the index of the last array element)
        int j = array.length - 1;

        // For each item in the array
        for (int i = 0; i < array.length; i++)
        {
            // Set the new array's item to what is stored at index j
            newArray[i] = array[j];
            // Subtract 1 from j.
            j--;
        }

        // Then copy the elements from the newArray into the old array.
        for (int i = 0; i < newArray.length; i++)
        {
            array[i] = newArray[i];
        }

    }

}
