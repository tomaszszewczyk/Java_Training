package travel_office;

public class TravelOffice {
	private Customer[] customers = new Customer[2];
	private int customerCount = 0;

	public void addCustomer(Customer newCustomer) {
		if (customerCount == customers.length) {
			resize();
			addCustomer(newCustomer);
		} else {
			customers[customerCount] = newCustomer;
			customerCount++;
		}
	}

	public void resize() {
		Customer[] newCustomers = new Customer[customerCount + 2];
		System.arraycopy(customers, 0, newCustomers, 0, customers.length);
		customers = newCustomers;
	}

	public int getCustomerCount() {
		return customerCount;
	}
}