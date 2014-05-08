public class RecursiveSelectionSort{
	public static void sort(Comparable[] values){
		class RecursiveSelection{
			void sort(Comparable[] values, int start,int end){
				/* algorithm
				if elements to be sorted
					move smallest element to beginning
					sort remaining array elements
				end if
				*/
				if (start<end){
					moveSmallest(values,start,end);
					sort(values,start+1,end);
				}
			}
			void moveSmallest(Comparable[] values,int start,int end){
				/* algorithm
				for each element from the 2nd element to the end loop
					if element is less than first element then
						swap elements
					end if
				end loop
				*/
				for (int index=start+1;index<=end;index++)
					if (values[index].compareTo(values[start])<0){
						Comparable temp=values[start];
						values[start]=values[index];
						values[index]=temp;
					}
			}
		}
		int size=ArrayUtility.getNumberOfElements(values);
		new RecursiveSelection().sort(values,0,size-1);
	}
}