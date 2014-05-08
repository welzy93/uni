public class IntArrayTest{
    public static void main(String[] args){
        int[] array1={10,20,30,40,50};
        int[] array2=array1;
        int[] array3=new int[array1.length];

        System.out.println("array1");
        IntArrayTest.displayArray(array1);
        System.out.println("array2");
        IntArrayTest.displayArray(array2);
        System.out.println("array3");
        IntArrayTest.displayArray(array3);
        IntArrayTest.copyArray(array1,array3);
        IntArrayTest.reverseArray(array2);
        System.out.println("array1");
        IntArrayTest.displayArray(array1);
        System.out.println("array2");
        IntArrayTest.displayArray(array2);
        System.out.println("array3");
        IntArrayTest.displayArray(array3);
    }
    public static void displayArray(int[] array){
        for (int value:array)
            System.out.print(value+" ");
        System.out.println();
    }
    public static void copyArray(int[] array1,int[] array2){
        for (int index=0;index<array1.length;index++)
            array2[index]=array1[index];
    }
    public static void reverseArray(int[] array){
        int[]newArray=new int[array.length];
        for (int index=0;index<array.length;index++)
            newArray[index]=array[array.length-index-1];
		  // need to use copyArray rather than simply
		  // assigning newArray to array because array parameter
		  // is pass by value. the contents of the array can be
		  // modified but the parameter itself cannot
        IntArrayTest.copyArray(newArray,array);
    }
}
