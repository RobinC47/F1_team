package controlleur;

import F1_team.*;

public class main {

		public main(String[] args) {
			Formula1Team Mercedes = new Formula1Team("Mercedes");
			Formula1TeamController controller = new Formula1TeamController(Mercedes);
	        controller.setFormula1TeamName("Mercedes-AMG Petronas Formula One Team");
	        controller.setDriver("Lewis Hamilton", 36);
	        controller.setCar(1000, "Mercedes-AMG F1 M12 E Performance", "Pirelli", 18, "Carbon Fiber", 746);
	        controller.addMechanic("John Smith", "Engine Specialist");
	        controller.addMechanic("Jane Doe", "Tire Specialist");
	        controller.updateView();
	    }
}
