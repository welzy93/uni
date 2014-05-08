
public class Flight implements Comparable<Flight>{
	private Integer hour;
	private Integer minutes;
	Time departure=new Time();
	Time arrival=new Time();
	
	public Flight() {
		this.hour=Input.getInteger(" Please enter your departure time: ");
		this.minutes=Input.getInteger("Please enter your arrival time: ");
	}
	
	public void display(){
		System.out.println(this.hour+"  "+this.minutes);
	}

	public int compareTo(Flight flights){
		int result;
		result=this.hour.compareTo(flights.hour);
		if (result==0)
			result=this.minutes.compareTo(flights.minutes);
		return result;
	}
	

}
