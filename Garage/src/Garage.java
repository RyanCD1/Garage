import java.util.ArrayList;

public class Garage {

	public Garage() {
		super();
	}

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
	}

	public void print2() {
		System.out.println("Vehicles:");
		for (int i = 0; i < vehicles.size(); i++) {
			Vehicle noOfVehicles = vehicles.get(i);
			noOfVehicles.print();

		}
	}

	public double calcBill() {
		double bill = 0;
		for (Vehicle vehicle : vehicles) {
			bill += vehicle.calcRepairCost();
		}
		return bill;
	}

	public boolean emptyGarage() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}

}
