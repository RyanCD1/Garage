
public class Car extends Vehicle {

	private String make;

	public Car(String name, String colour, int price, int noOfDoors, String type) {
		this.setName(name);
		this.setColour(colour);
		this.setPrice(price);
		this.setDoors(noOfDoors);
		this.setType(type);
		this.setMake(make);

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public double calcRepairCost() {
		return (getPrice() * getDoors());
	}
}
