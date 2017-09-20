package travel_office;

public class Test {
	public static void main(String[] args) {
		TravelOffice travelOffice = new TravelOffice();
		
		DomesticTrip trip1 = new DomesticTrip(new Date(2016, 9, 12), new Date(2016, 10, 1),
				"Krakow");
		trip1.setPrice(100);
		trip1.setOwnArrivalDiscount(20);
		
		AbroadTrip trip2 = new AbroadTrip(new Date(2016, 9, 12), new Date(2016, 10, 1),
				"Honolulu");
		trip2.setPrice(200);
		trip2.setInsurance(50);

		Address address = new Address("ul. Malinowa 15", "00-012", "Pogwizdów");
		Customer customer = new Customer("Nowak");
		customer.setAddress(address);		
		
		Address address1 = new Address("ul. Malinowa 16", "00-012", "Pogwizdów");
		Customer customer1 = new Customer("Janusz");
		customer1.setAddress(address1);
		
		customer.assingTrip(trip1);
		customer1.assingTrip(trip2);

		travelOffice.addCustomer(customer);
		travelOffice.addCustomer(customer1);

		System.out.println(travelOffice.getCustomerCount());
		System.out.println(customer);
		System.out.println(customer1);
	}
}
