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
				class Smallest{
					void swap(Comparable[] values, int position, int next, int end){
						if (next<=end){
							if (values[next].compareTo(values[position])<0){
								Comparable temp=values[position];
								values[position]=values[next];
								values[next]=temp;
							}
							swap(values,position,next+1,end);
						}
					}
				}
				new Smallest().swap(values,start,start+1,end);
			}
		}
		int size=ArrayUtility.getNumberOfElements(values);
		new RecursiveSelection().sort(values,0,size-1);
	}
}