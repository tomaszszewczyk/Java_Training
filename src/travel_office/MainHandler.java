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
        System.out.print("Destination: ");
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
        try {
            System.out.print("Enter trip name");
            String trip_name = in.next();
            System.out.print("Enter customer name");
            String name = in.next();
            Customer customer = office.findCustomerByName(name);
            Trip trip = office.getTrip(trip_name);
            customer.assingTrip(trip);
        } catch (NoSuchCustomerException exception) {
            System.out.println(exception);
        }
    }

    @Override
    public void removeCustomer() {
        try {
            System.out.print("Enter customer name");
            String name = in.next();
            Customer customer = office.findCustomerByName(name);
            office.removeCustomer(customer);
        } catch (NoSuchCustomerException exception) {
            System.out.println(exception);
        }
    }

    @Override
    public void removeTrip() {
        System.out.print("Enter trip name");
        String name = in.next();
        office.removeTrip(name);
    }

    @Override
    public void showCustomers() {
        office.getCustomers().forEach(p -> {
            System.out.println(p);
        });
    }

    @Override
    public void showTrips() {
        office.getTrips().forEach((p, s) -> {
            System.out.println(p + " " + s);
        });
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
