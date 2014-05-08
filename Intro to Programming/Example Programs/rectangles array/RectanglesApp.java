
public class RectanglesApp {

		
		public static void main (String[] args){
		
			Rectangle blueRectangle = new Rectangle();
			Rectangle.noOfRectangles ++ ;//increment no of Rectangles created
			blueRectangle.colour = "blue";
			blueRectangle.height = 5;
			blueRectangle.width = 5;
		
			Rectangle redRectangle = new Rectangle();
			Rectangle.noOfRectangles ++ ;	//increment no of Rectangles created
			redRectangle.colour="red";
			redRectangle.height = 15;
			redRectangle.width = 15;
			
			Rectangle greenRectangle = new Rectangle();
			Rectangle.noOfRectangles ++ ;//increment no of Rectangles created
			greenRectangle.colour="green";
			greenRectangle.height = 35;
			greenRectangle.width = 35;
			
			TextIO.putln (blueRectangle.colour +  " is " + blueRectangle.height + "cm X " + blueRectangle.width + "cm" );
			TextIO.putln ("the area of " + blueRectangle.colour +  " is " + (blueRectangle.height * blueRectangle.width + "cm\u00B2" ) );
			TextIO.putln (redRectangle.colour +  " h = " + redRectangle.height + "cm, w = " + redRectangle.width + "cm"  );
			TextIO.putln (greenRectangle.colour +  " h = " + greenRectangle.height + "cm, w = " + greenRectangle.width + "cm "  );
		
			TextIO.putln("total rectangles created = " + Rectangle.noOfRectangles);
			

		}

	}
