package F1_team;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private Tires tires;
    private Body body;

    public Car(Engine engine, Tires tires, Body body) {
        this.engine = engine;
        this.tires = tires;
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}