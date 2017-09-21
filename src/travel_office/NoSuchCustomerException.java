package travel_office;

public class NoSuchCustomerException extends Exception {
    public NoSuchCustomerException() {
        super("No such customer");
    }
}
