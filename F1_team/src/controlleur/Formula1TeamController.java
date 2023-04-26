package controlleur;

import F1_team.*;
import vue.*;

public class Formula1TeamController {
    private Formula1Team model;
    private Formula1TeamView view;

    public Formula1TeamController(Formula1Team model) {
        this.model = model;
        this.view = new Formula1TeamView();
    }

    public void setFormula1TeamName(String name) {
        model.setName(name);
    }

    public String getFormula1TeamName() {
        return model.getName();
    }

    public void setDriver(String name, int age) {
        Driver driver = new Driver(name, age, model);
        model.setDriver(driver);
    }

    public void setCar(int horsepower, String engineType, String tireManufacturer, int tireSize, String bodyMaterial, int bodyWeight) {
        Engine engine = new Engine(horsepower, engineType);
        Tires tires = new Tires(tireManufacturer, tireSize);
        Body body = new Body(bodyMaterial, bodyWeight);
        Car car = new Car(engine, tires, body);
        model.setCar(car);
        }
    public void addMechanic(String name, String specialty) {
        Mechanic mechanic = new Mechanic(name, specialty);
        model.addMechanic(mechanic);
    }

    public void updateView() {
        view.printFormula1TeamDetails(model.getName(), model.getDriver(), model.getCar(), model.getMechanics());
    }
    
}