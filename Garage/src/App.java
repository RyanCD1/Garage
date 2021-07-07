
public class App {

	public static void main(String[] args) {

		Vehicle newVehicle = new Car("James", "Yellow", 1999, 4, "Car");
		Vehicle newVehicle2 = new Boat("Christophe", "White", 7899, 3, "Boat");
		Vehicle newVehicle3 = new Motorbike("Marc", "Orange", 139, 0, "Motorbike", true);

		newVehicle.print();
	}
}
