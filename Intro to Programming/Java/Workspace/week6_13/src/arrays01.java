/*Arrays

 	double[] d = new double[5]; // creates an array object with 5

or

	int[] a;
	a = new int[8];

 */
public class arrays01 {
	
	public static void main(String[] args) {
		
		int x;				//declare variable of type int

		int[] a;			//declare array of type int
		a = new int[5];		//create new array object size 5 (indexed 0 - 4)
		
		x = 3;				//initialise our variable x 
		
		a[0]=2;				//initialise first place in our array
		a[1]=5;				//initialise first place in our array
		a[2]=23;				//initialise first place in our array
		a[3]=233;				//initialise first place in our array
		a[4]=18;				//initialise first place in our array
		
		TextIO.putln( " x is " + x);
		TextIO.putln( " a[0] is " + a[0]);
		TextIO.putln( " a[1] is " + a[1]);
		TextIO.putln( " a[2] is " + a[2]);
		TextIO.putln( " a[3] is " + a[3]);
		TextIO.putln( " a[4] is " + a[4]);
		
		for (int i =0 ; i <5; i++){
			TextIO.putln(a[i]);
		}//for

		//arrays02 is answer to ...
		//1	write a loop to display the content of the array
		//2	write a loop that asks the user for integer numbers to populate the array
		//3 write a subroutine to do each of the above!!
		
	}//main

}//class
