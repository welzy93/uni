
public class Time implements Comparable<Time>{
	private Integer hour;
	private Integer minutes;
	
	public Time() {
		this.hour=Input.getInteger(" Please enter the hour you fly at: ");
		this.minutes=Input.getInteger("Please enter the minutes you fly at: ");
	}

	public void display(){
		System.out.println(this.hour+"  "+this.minutes);
	}

	
	public int compareTo(Time flights) {
		int result;
		result=this.hour.compareTo(flights.hour);
		if (result==0)
			result=this.minutes.compareTo(flights.minutes);
		return result;
	}
}
