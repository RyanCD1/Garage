
public class Motorbike extends Vehicle {

	private boolean sidecar;

	public Motorbike(String name, String colour, int price, int noOfDoors, String type, boolean b) {
		this.setName(name);
		this.setColour(colour);
		this.setPrice(price);
		this.setDoors(noOfDoors);
		this.setType(type);
		this.setSidecar(sidecar);
	}

	public boolean getSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}
}
