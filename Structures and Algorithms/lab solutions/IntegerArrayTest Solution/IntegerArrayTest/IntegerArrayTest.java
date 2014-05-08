public class IntegerArrayTest{
	public static void main(String[] args){
		Integer[] array1={30,50,40,10};
		System.out.print("array 1: ");
		IntegerArray.display(array1);
		System.out.println();
		System.out.println("total: "+IntegerArray.getTotal(array1));
		Integer[] array2={60,90,30,50,null};
		System.out.print("array 2: ");
		IntegerArray.display(array2);
		System.out.println();
		System.out.println("total: "+IntegerArray.getTotal(array2));
	}
}