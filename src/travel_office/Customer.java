package travel_office;

public class Customer {
	private String name;
	private Trip trip;
	private Address address;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void assingTrip(Trip aTrip) {
		trip = aTrip;
	}
	
	public void setAddress(Address aAddress) {
		address = aAddress;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nTrip: " + trip + "\nAddress: "
				+ address;
	}
	
	public String getInfo() {
		return toString();
	}
}
