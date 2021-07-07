import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void print() {
		System.out.println(vehicles);
	}

	public Vehicle getVehicle(int index) {
		return this.vehicles.get(index);
	}

	public void removeByType(String type) {
		for (int i = 0; i < vehicles.size(); i++) {
			if (this.getVehicle(i).getType() == type)
				vehicles.remove(getVehicle(i));
		}

		// public void getBill(int price) {
		// if (this.getVehicle(i).getType() == "Car")
		// this.price == price + 100
		// }

	}
}
