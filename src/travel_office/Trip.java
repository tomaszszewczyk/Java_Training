package travel_office;

public abstract class Trip {
	private Date start;
	private Date end;
	private String destination;
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Trip(Date start, Date end, String destination) {
		super();
		this.start = start;
		this.end = end;
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Start: " + start + "\nEnd: " + end + "\nDestination: " + destination + "\nPrice: " + getPrice();
	}
	
	public String getInfo() {
		return toString();
	}
}
