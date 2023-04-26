package vue;

import F1_team.*;
import java.util.List;

public class Formula1TeamView {
    public void printFormula1TeamDetails(String name, Driver driver, Car car, List<Mechanic> mechanics) {
        System.out.println("Formula 1 Team: " + name);
        System.out.println("Driver: " + driver.getName() + ", Age: " + driver.getAge());
        System.out.println("Car Details: ");
        System.out.println("   Engine Type: " + car.getEngine().getType() + ", Horsepower: " + car.getEngine().getHorsepower());
        System.out.println("   Tire Manufacturer: " + car.getTires().getManufacturer() + ", Size: " + car.getTires().getSize());
        System.out.println("   Body Material: " + car.getBody().getMaterial() + ", Weight: " + car.getBody().getWeight());
        System.out.println("Mechanics: ");
        for (Mechanic mechanic : mechanics) {
            System.out.println("   Name: " + mechanic.getName() + ", Specialty: " + mechanic.getSpecialty());
        }
    }
}
