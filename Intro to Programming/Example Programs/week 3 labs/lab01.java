public class lab01 {

		/**
		 * A simple solution to the Week 3 laboratory question 1.
		 * Note that the solution just assumes that the user enters
	       * a non-negative number.
		 * @param args - not used in this program
		 */
		public static void main(String[] args) {
			final double COST_PER_UNIT_FIRST_100 = 26.7;
			final double COST_PER_UNIT_AFTER_100 = 15.6;
			
			
			double units;
			
			double cost; // we won't worry about fractional pence
			
			TextIO.put("Enter the number of units consumed: ");
			units = TextIO.getlnDouble();
			
			if (units <= 100) {
				cost = units*COST_PER_UNIT_FIRST_100;
			} else {
				cost = 100*COST_PER_UNIT_FIRST_100 + 
	                           (units-100)*COST_PER_UNIT_AFTER_100;
			}
			
			TextIO.putln("Your bill is " + cost + " pence");
		}

	}
