package travel_office;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {

    private Set<Customer> customers = new HashSet<>();
    private Map<String, Trip> trips = new HashMap<>();
    private int customerCount = 0;

    public Trip getTrip(String name) {
        return trips.get(name);
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public Map<String, Trip> getTrips() {
        return trips;
    }


    public void addTrip(String name, Trip trip) {
        trips.put(name, trip);
    }

    public void removeTrip(String name) {
        trips.remove(name);
    }

    public Customer findCustomerByName(String name) throws NoSuchCustomerException {
        for (Customer customer : customers) {
            if (customer.getName().equals(name))
                return customer;
        }
        throw new NoSuchCustomerException();
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        customerCount++;
    }

    public int getCustomerCount() {
        return customerCount;
    }
}