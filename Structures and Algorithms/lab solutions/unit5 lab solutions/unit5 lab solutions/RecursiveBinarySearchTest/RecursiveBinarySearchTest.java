public class RecursiveBinarySearchTest{
	public static void main(String[] args){
		Integer[] integers={5,10,15,20,25,30,35,40,45,50};
		Integer result;
		ArrayUtility.display(integers);
		result=(Integer)RecursiveBinarySearch.find(integers,3);
		System.out.println("searched for 3, found: "+ result);		
		result=(Integer)RecursiveBinarySearch.find(integers,5);
		System.out.println("searched for 5, found: "+ result);		
		result=(Integer)RecursiveBinarySearch.find(integers,28);
		System.out.println("searched for 28, found: "+ result);		
		result=(Integer)RecursiveBinarySearch.find(integers,30);
		System.out.println("searched for 30, found: "+ result);		
		result=(Integer)RecursiveBinarySearch.find(integers,50);
		System.out.println("searched for 50, found: "+ result);		
		result=(Integer)RecursiveBinarySearch.find(integers,58);
		System.out.println("searched for 58, found: "+ result);		
	}
}
	