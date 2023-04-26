package F1_team;
public class mechanician extends employee{
	int car;

    public mechanician(String name, String position, int salary) {
        super(name, position, salary);
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }
}
