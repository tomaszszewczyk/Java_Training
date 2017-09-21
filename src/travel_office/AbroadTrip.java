package travel_office;

public class AbroadTrip extends Trip {
    private int insurance;

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + insurance;
    }

    public AbroadTrip(Date start, Date end, String destination) {
        super(start, end, destination);
        // TODO Auto-generated constructor stub
    }

}
