
public class arrays02 {

	
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
		
		for (int i =0 ; i <5; i++){
			a[i]=getArrayData();	
		}
		
		
		displayArrayData(a);
		
		
		
	}//main
	
	public static int getArrayData(){
		int usersNumber;
		TextIO.putln( "Enter a whole number ");
		usersNumber = TextIO.getInt();
		return usersNumber;
	}//getArrayData
	
	public static void displayArrayData(int[] theWholeArray){  //pass the whole array
		for (int i =0 ; i <5; i++){
			TextIO.putln("place " + i + " in the Array is " + theWholeArray[i]);
		}
	}//displayArrayData

}//class
