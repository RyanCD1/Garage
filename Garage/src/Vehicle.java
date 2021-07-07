
public abstract class Vehicle {

	private int price;

	private String colour;

	private String name;

	private String type;

	private int noOfDoors;

	public Vehicle() {
		super();
	}

	public Vehicle(int price, String colour, String name, int noOfDoors, String type) {
		super();
		this.setName(name);
		this.setColour(colour);
		this.setPrice(price);
		this.setDoors(noOfDoors);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDoors() {
		return noOfDoors;
	}

	public void setDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public String getType() {
		return type;

	}

	public double calcRepairCost() {
		return 100.0D;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void print() {
		System.out.println("Name: " + getName());
		System.out.println("Colour: " + getColour());
		System.out.println("Price: " + getPrice());
		System.out.println("Doors: " + getDoors());
		System.out.println("Type: " + getType());
	}
}
