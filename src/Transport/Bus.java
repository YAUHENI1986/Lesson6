package Transport;

public class Bus extends Auto{
	private int passengers;

	public Bus() {
		super();
		System.out.println("Bus()");
	}
	
	public Bus(int passengers) {
		super();
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	

}
