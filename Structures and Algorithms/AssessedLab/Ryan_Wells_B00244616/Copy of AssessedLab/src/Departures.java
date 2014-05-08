public class Departures {
	private Flight[] flights;
	private int numberofFlights;
	
	public Departures(int size){
		this.flights=new Flight[size];
	}
	
	public void add(){
		this.flights[this.numberofFlights]=new Flight();
		this.numberofFlights++;
	}
	
	public void display(){
		
			for (int index=0;index<this.numberofFlights;index++)
				this.flights[index].display();
		}

	
	}


