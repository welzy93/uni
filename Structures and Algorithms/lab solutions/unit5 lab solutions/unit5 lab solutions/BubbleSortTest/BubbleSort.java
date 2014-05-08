public class BubbleSort{
    public static void sort(Comparable[] values){
	 	/* algorithm
		while still sorting loop
			for each entry that has to be checked loop // current entry
				if the next entry is less than the current entry then
					swap entries
					note still sorting
				end if
			end loop
		end loop
		*/
        Comparable temp;
        boolean stillSorting=true;
		int size=ArrayUtility.getNumberOfElements(values);
        while (stillSorting){
            stillSorting=false;
            for (int current=0; current<size-1; current++)
                if (values[current+1].compareTo(values[current])<0){
                    stillSorting=true;
                    temp=values[current+1];
                    values[current+1]=values[current];
                    values[current]=temp;
                }
            // remaining largest value is in the last slot checked so don't need to check it next time
            size--;
        }
    }
}
