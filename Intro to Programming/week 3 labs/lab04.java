
public class lab04 {


		/*Rewrite the following switch statement as an if statement (you may assume
that leafCount is an int variable and that its value is never less than zero).
Write a program to test that your solution produces the same output as the
switch statement would do:
		 */

			
			public static void main(String[] args) {
				
				int leafCount=0;
				
				TextIO.putln( "enter no of leaves" );
				leafCount = TextIO.getInt();
					
				
				/*
				switch(leafCount) {
					case 0 : TextIO.putln("No leaves");
						break;
					case 1 : TextIO.putln("One leaf");
						break;
					case 2: TextIO.putln("A couple of leaves");
						break;
					case 3:
					case 4:
					case 5: TextIO.putln("A handful of leaves");
						break;
					default: TextIO.putln("More than a handful of leaves");
					break;
				}
				*/
				
			
				
				if (leafCount==0) {
					 TextIO.putln("No leaves");
				}
				else if (leafCount==1) {
					 TextIO.putln("one leaf");
				}
				else if (leafCount==2) {
					 TextIO.putln("A couple of leaves");
				}
				else if ((leafCount==3)||(leafCount==4)||(leafCount==5)) {
					 TextIO.putln("A handful of leaves");
				}else{
					TextIO.putln("More than a handful of leaves");
				}
					
				


			}//end main
		}