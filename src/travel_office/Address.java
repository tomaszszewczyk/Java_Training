package travel_office;

public class Address {
	private String street;
	private String zip;
	private String city;

	public Address(String street, String zip, String city) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Street: " + street + "\nZip: " + zip + "\nCity: " + city;
	}
	
	public String getInfo() {
		return toString();
	}

}
