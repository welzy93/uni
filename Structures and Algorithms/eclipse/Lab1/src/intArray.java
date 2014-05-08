
public class intArray {
	public static void main(String[] args){
		
		int[] array1={10,20,30,40,50};
		int[] array2=array1;
		int[] array3= new int[array1.length];
		
		System.out.println("array1:");
        intArray.displayArray(array1);
        System.out.println("array2: ");
        intArray.displayArray(array2);
        System.out.println("array3: ");
        intArray.displayArray(array3);
        intArray.copyArray(array1,array3);
        intArray.reverseArray(array2);
        System.out.println("array1: ");
        intArray.displayArray(array1);
        System.out.println("array2:");
        intArray.displayArray(array2);
        System.out.println("array3: ");
        intArray.displayArray(array3);
	}
	
	




	public static void displayArray(int[] array){
		
		for (int value:array)
            System.out.print(value+" ");
        System.out.println();
	}
	
	private static void copyArray(int[] array1, int[] array2) {
		for (int i=0;i<array1.length;i++)
            array2[i]=array1[i];
		
	}
	

	private static void reverseArray(int[] array) {
		
		int[]newArray=new int[array.length];
        for (int index=0;index<array.length;index++)
            newArray[index]=array[array.length-index-1];
        
        intArray.copyArray(newArray,array);
		
	}
}
