package travel_office;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UserInterface userInterface = new MainHandler();

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1: Add customer");
            System.out.println("2: Add trip");
            System.out.println("3: Assign");
            System.out.println("4: Remove customer");
            System.out.println("5: Remove trip");
            System.out.println("6: Show customers");
            System.out.println("7: Show trips");
            System.out.println("8: Exit");
            System.out.print("Choose one [1-8]: ");

            String choice = in.next();

            switch (choice) {
                case "1":
                    userInterface.addCustomer();
                    break;
                case "2":
                    userInterface.addTrip();
                    break;
                case "3":
                    userInterface.assign();
                    break;
                case "4":
                    userInterface.removeCustomer();
                    break;
                case "5":
                    userInterface.removeTrip();
                    break;
                case "6":
                    userInterface.showCustomers();
                    break;
                case "7":
                    userInterface.showTrips();
                    break;
                case "8":
                    userInterface.exit();
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
