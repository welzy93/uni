public class RecursiveBinarySearch{
	public static Comparable find(Comparable[] values,Comparable value){
		class Find{
			Comparable find(Comparable[] values,int start,int end,Comparable value){
				/* algorithm
				if elements to be checked then
					calculate midpoint of array
					if search element matches  element at midpoint then
						search element found
					else
						if search element is less than element at midpoint then
							search left half of array
						else
							search right half of array
						end if
					end if
				else
					search element is not in the array
				end if
				*/
				Comparable result;
				if(start<=end){
					int midpoint=(start+end)/2;
					if(value.compareTo(values[midpoint])==0) 
						result=values[midpoint];
					else
						if(value.compareTo(values[midpoint])<0) 
							result=find(values,start,midpoint-1,value);
						else
							result=find(values,midpoint+1,end,value);
				}
				else
					result=null;
				return result;
			}
		}
		int size=ArrayUtility.getNumberOfElements(values);
		return new Find().find(values,0,size-1,value);
	}
}
