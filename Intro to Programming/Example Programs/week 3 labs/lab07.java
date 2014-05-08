public class lab07 {
enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,
	FRIDAY,SATURDAY
}
	public static void main(String[] args) {
		int numberedDay;
		Days today = Days.SUNDAY; // this needs to be initialised or      //                            compiler complains here *
		TextIO.putln("Enter the day of the week as a number");
		numberedDay = TextIO.getlnInt();
		switch(numberedDay){ // switching on an integer variable
		case 0: today =Days.SUNDAY;
		break;
		case 1: today  =Days.MONDAY;
		break;
		case 2: today =Days.TUESDAY;
		break;
		case 3: today =Days.WEDNESDAY;
		break;
		case 4: today =Days.THURSDAY;
		break;
		case 5: today = Days.FRIDAY;
		break;
		case 6: today =Days.SATURDAY;;
		}


		switch (today){ // switching on a Days variable
		// * compiler insists on today initialised before switch()
		case SATURDAY:
		case SUNDAY: 
			TextIO.putln("Weekends are best");
			break;
		case MONDAY:
			TextIO.putln("Mondays are bad");
			break;
		case FRIDAY:
			TextIO.putln("Fridays are better");
			break;
		default: TextIO.putln("Mid-weeks are so so");
		}
	}
}
