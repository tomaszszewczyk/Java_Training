package ex07;

public abstract class Vehicle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

	public abstract double getFuelNeeds();
	public abstract double getDistance();
	public abstract double calculateFuelConsumption();
	public abstract void go();
	public abstract void stop();
}
