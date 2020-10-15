package esercitazione;

public class Garage {
	

	public int Repair(Vehicle vehicle) {
		
		if (vehicle.isGuasto()) {		
			vehicle.setGuasto(false);	
			if (vehicle.getClass().getName() == "esercitazione.Car")
				return 100;
			if (vehicle.getClass().getName() == "esercitazione.Motocycle")
				return 80;
		}
		
		return 0;
	}
}
