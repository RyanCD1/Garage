
public class Boat extends Vehicle {

	private int sails;

	public Boat(String name, String colour, int price, int noOfDoors, String type) {
		this.setName(name);
		this.setColour(colour);
		this.setPrice(price);
		this.setDoors(noOfDoors);
		this.setSails(sails);
		this.setType(type);
	}

	public int getSails() {
		return sails;
	}

	public void setSails(int sails) {
		this.sails = sails;
	}
}
