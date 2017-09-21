package travel_office;

import java.util.Scanner;

public class MainHandler implements UserInterface {
    Scanner in;
    TravelOffice office;

    public MainHandler() {
        in = new Scanner(System.in);
        office = new TravelOffice();
    }

    @Override
    public void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = in.next();
        Customer customer = new Customer(name);
        office.addCustomer(customer);
    }

    @Override
    public void addTrip() {
        System.out.print("What kind of trip? D/A: ");
        String kind = in.next();
        System.out.print("Name: ");
        String name = in.next();
        System.out.print("Start date: ");
        String startString = in.next();
        Date start = new Date(startString);
        System.out.print("End date: ");
        String endString = in.next();
        Date end = new Date(endString);
        String destination = in.next();


        if (kind.toUpperCase().equals("D")) {
            Trip trip;
            trip = new DomesticTrip(start, end, destination);
            office.addTrip(name, trip);
        } else if (kind.toUpperCase().equals("A")) {
            Trip trip;
            trip = new AbroadTrip(start, end, destination);
            office.addTrip(name, trip);
        } else {
            System.out.println("Wrong trip kind");
        }
    }

    @Override
    public void assign() {
        System.out.print("Enter trip name");
        String trip_name = in.next();
        System.out.print("Enter customer name");
        String name = in.next();

        Customer customer = office.findCustomerByName(name);
        Trip trip = office.getTrip(trip_name);
        customer.assingTrip(trip);
    }

    @Override
    public void removeCustomer() {
        System.out.print("Enter customer name");
        String name = in.next();
        Customer customer = office.findCustomerByName(name);
        office.removeCustomer(customer);
    }

    @Override
    public void removeTrip() {
        System.out.print("Enter trip name");
        String name = in.next();
        office.removeTrip(name);
    }

    @Override
    public void showCustomers() {
        for (Customer customer : office.getCustomers()) {
            System.out.println(customer);
        }
    }

    @Override
    public void showTrips() {
        for (String trip : office.getTrips().keySet()) {
            System.out.println(trip);
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
