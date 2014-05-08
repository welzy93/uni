
public class RectanglesArray {
		
			public static void main (String[] args){
				
				//int[] numbersArray = new int[5]; 				 //using primitive data type as Array's type
				 Rectangle[] rectangleArray = new Rectangle[2];		//using reference type/object as Array's  type
				 
				 
			     for (int i=0; i < rectangleArray.length; i++) {
			    	
						rectangleArray[i] = new Rectangle();  // must create each element
						
						TextIO.putln("Please enter rectangle colour: ");
						rectangleArray[i].colour = TextIO.getlnWord();
						
						TextIO.putln("Please enter height of rectangle: ");
						rectangleArray[i].height = TextIO.getInt();
						
						TextIO.putln("Please enter width of rectangle "); 
						rectangleArray[i].width = TextIO.getInt();
				}//for
			     TextIO.putln();
			     
			     displayRectangles(rectangleArray);
			     
			}//main

			
			public static void displayRectangles(Rectangle[] rA){
				
				for (int i=0; i < rA.length; i++) {
						
					TextIO.putln("the " + rA[i].colour + " Rectangle's height is " + rA[i].height + " its width is "  + rA[i].width );
				}//for
			}
}//class
