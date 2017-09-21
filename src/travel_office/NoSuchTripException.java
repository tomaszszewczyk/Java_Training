package travel_office;

public class NoSuchTripException extends Exception {
    public NoSuchTripException() {
        super("No such trip");
    }
}
